import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Decrypter implements DecrypterInterface {

  private Map<Character, Character> code = new HashMap<>();
  private Map<Character, Character> decode = new HashMap<>();
  private final List<String> validPattern = List.of("Wydział", "Fizyki,", "Astronomii", "i", "Informatyki",
      "Stosowanej");

  /**
   * Returns true if pattern is correct, false otherwise
   * 
   * @param pattern list of words
   * @return boolean with test result
   */
  private boolean patternMatcher(List<String> pattern) {
    if (pattern.get(1).charAt(6) != ',')
      return false;
    String patternStr = String.join(" ", pattern);
    String validPatternStr = String.join(" ", validPattern);
    // required comma check
    // for each word
    for (int wordNo = 0; wordNo < validPattern.size(); wordNo++) {
      String validWord = validPattern.get(wordNo);
      String word = pattern.get(wordNo);
      // for each character inside word
      for (int chNo = 0; chNo < validWord.length(); chNo++) {
        // list of occurences in valid pattern
        List<Integer> validIndexes = new LinkedList<Integer>();
        for (int index = validPatternStr.indexOf(validWord.charAt(chNo)); index >= 0; index = validPatternStr
            .indexOf(validWord.charAt(chNo), index + 1)) {
          validIndexes.add(index);
        }
        // list of occurences in tested pattern
        List<Integer> indexes = new LinkedList<Integer>();
        for (int index = patternStr.indexOf(word.charAt(chNo)); index >= 0; index = patternStr
            .indexOf(word.charAt(chNo), index + 1)) {
          indexes.add(index);
        }
        // check list mismatch
        if (!validIndexes.equals(indexes)) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Compares lenghts of 6 words to determine if header is valid
   * 
   * @param header list of words
   * @return true if the header sizes are correct
   */
  private boolean lengthChecker(List<String> header) {
    List<Integer> lengthlist = header.stream().map(elt -> elt.length()).collect(Collectors.toList());
    List<Integer> corLengths = validPattern.stream().map(el -> el.length()).collect(Collectors.toList());
    return lengthlist.equals(corLengths);
  }

  @Override
  public void setInputText(String encryptedDocument) {
    // reset maps
    this.code.clear();
    this.decode.clear();

    // null check
    if (encryptedDocument == null)
      return;

    // regex split on whitespace characters
    List<String> split = new LinkedList<String>(List.of(encryptedDocument.split("\\s")));
    // trim empty subarrays
    split.removeIf(item -> "".equals(item));
    // list too short to contain pattern
    if (split.size() < validPattern.size())
      return;

    List<String> header = null;

    // get all words with 7 letters as possible pattern starters
    int[] starterWordsIndexes = IntStream.range(0, split.size())
        .filter(x -> split.get(x).length() == validPattern.get(0).length()).toArray();
    for (int index : starterWordsIndexes) {
      // System.out.println("Possible start word: `" + word + "` at index " + index);

      // end of possible patterns
      if (index + validPattern.size() - 1 >= split.size())
        return;

      header = split.subList(index, index + validPattern.size());

      // check if word lengths are correct
      if (!lengthChecker(header)) {
        header = null;
        continue;
      }
      // full pattern check
      if (!patternMatcher(header)) {
        header = null;
        continue;
      }
      break;
    }

    // no valid header was found
    if (header == null) {
      // System.out.println("Pattern not found");
      return;
    }

    // create code and decode maps
    for (int wI = 0; wI < validPattern.size(); wI++) {
      String word = header.get(wI);
      String decodedWord = validPattern.get(wI);
      for (int i = 0; i < decodedWord.toCharArray().length; i++) {
        if (word.charAt(i) == ',')
          continue; // skip ,
        this.code.putIfAbsent(decodedWord.charAt(i), word.charAt(i));
        this.decode.putIfAbsent(word.charAt(i), decodedWord.charAt(i));
      }
    }
  }

  @Override
  public Map<Character, Character> getCode() {
    return this.code;
  }

  @Override
  public Map<Character, Character> getDecode() {
    return this.decode;
  }

}
