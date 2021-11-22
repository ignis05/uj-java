import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Compression implements CompressionInterface {
  private LinkedList<String> words = new LinkedList<String>();
  private Map<String, String> header = new HashMap<String, String>(0);
  private List<String> compressedWords = null;
  private Iterator<String> compressedIterator = null;

  private static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
    Set<Set<T>> sets = new HashSet<Set<T>>();
    if (originalSet.isEmpty()) {
      sets.add(new HashSet<T>());
      return sets;
    }
    List<T> list = new ArrayList<T>(originalSet);
    T head = list.get(0);
    Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
    for (Set<T> set : powerSet(rest)) {
      Set<T> newSet = new HashSet<T>();
      newSet.add(head);
      newSet.addAll(set);
      sets.add(newSet);
      sets.add(set);
    }
    return sets;
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
    var repeatedSet = (counts.entrySet().stream().filter(entry -> entry.getValue() > 1)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))).keySet();

    // refs to optimal header and wordlist
    Map<String, String> optimalHeader = null;
    List<String> optimalWords = null;

    // minSize = uncompressed length
    int minSize = this.words.get(0).length() * this.words.size();

    // interate through powerset for every combination
    for (var set : powerSet(repeatedSet)) {
      if (set.isEmpty())
        continue;

      // create compression header
      Map<String, String> header = new HashMap<String, String>();
      int codeSize = Integer.toBinaryString(set.size()).length();
      var binCounter = 0;
      for (var word : set) {
        header.put(Integer.toBinaryString((int) Math.pow(2, codeSize) | binCounter++).substring(1), word);
      }
      var entry1 = header.entrySet().iterator().next();
      int headerSize = (entry1.getKey().length() + entry1.getValue().length()) * header.size();

      var compWords = new ArrayList<String>(this.words);
      for (int i = 0; i < compWords.size(); i++)
        compWords.set(i, "1" + compWords.get(i));

      for (var el : header.entrySet())
        Collections.replaceAll(compWords, "1" + el.getValue(), el.getKey());

      var wordsSize = compWords.stream().mapToInt(String::length).sum();

      if (headerSize + wordsSize < minSize) {
        optimalHeader = header;
        optimalWords = compWords;
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
