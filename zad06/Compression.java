import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Compression implements CompressionInterface {
  private LinkedList<String> words = new LinkedList<String>();
  private Map<String, String> header = new HashMap<String, String>(0);
  private List<String> compressedWords = null;
  private Iterator<String> compressedIterator = null;

  private static int getBitSize(int k) {
    var c = Integer.toBinaryString(k).length();
    if (Integer.toBinaryString((int) Math.pow(2, c) | (k - 1)).substring(1).toCharArray()[0] == '1') {
      c++;
    }
    return c;
  }

  @Override
  public void addWord(String word) {
    this.words.add(word);
  }

  @Override
  public void compress() {

    // map {key=word val=count}
    Map<String, Long> counts = this.words.stream().collect(Collectors.groupingBy(el -> el, Collectors.counting()));
    // set of words that repeat more than once
    var repeatedList = new ArrayList<String>(
        (counts.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))).keySet());

    // sorted from most occurences to least
    Collections.sort(repeatedList, (a, b) -> counts.get(b).compareTo(counts.get(a)));

    // refs to optimal header and wordlist
    Map<String, String> optimalHeader = null;
    List<String> optimalWords = null;

    // minSize = uncompressed length
    int minSize = this.words.get(0).length() * this.words.size();

    // keep adding words to compression from most occurences to least
    List<String> words2Compress = new LinkedList<String>();
    for (var newWord : repeatedList) {
      words2Compress.add(newWord);

      // create compression header
      Map<String, String> header = new HashMap<String, String>();
      int codeSize = getBitSize(words2Compress.size());
      var binCounter = 0;
      for (var word : words2Compress) {
        header.put(Integer.toBinaryString((int) Math.pow(2, codeSize) | binCounter++).substring(1), word);
      }
      var entry1 = header.entrySet().iterator().next();
      int headerSize = (entry1.getKey().length() + entry1.getValue().length()) * header.size();

      // unshift "1" to all words
      List<String> compWords = new ArrayList<String>(this.words).stream().map(el -> "1" + el).collect(Collectors.toList());

      // replace all words chosen for compression
      for (var el : header.entrySet())
        Collections.replaceAll(compWords, "1" + el.getValue(), el.getKey());

      var wordsSize = compWords.stream().mapToInt(String::length).sum();

      // if new result is smaller, set it as optimal
      if (headerSize + wordsSize < minSize) {
        optimalHeader = header;
        optimalWords = compWords;
        minSize = headerSize + wordsSize;
      }
    }

    if (optimalWords == null) {
      this.header = new HashMap<String, String>(0);
    } else {
      this.header = optimalHeader;
      this.compressedWords = optimalWords;
      this.compressedIterator = this.compressedWords.iterator();
    }
  }

  @Override
  public Map<String, String> getHeader() {
    return this.header;
  }

  @Override
  public String getWord() {
    return compressedIterator.next();
  }

}
