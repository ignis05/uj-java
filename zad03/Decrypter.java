import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Decrypter implements DecrypterInterface {

  private Map<Character, Character> code = new HashMap<>();;
  private Map<Character, Character> decode = new HashMap<>();;

  /**
   * Returns true if pattern is correct, false otherwise
   * 
   * @param pattern list of words
   * @return boolean with test result
   */
  private boolean patternMatcher(List<String> pattern) {
    String headerStr = String.join(" ", pattern);
    // Wydział Fizyki, Astronomii i Informatyki Stosowanej
    // W 0-0
    if (headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(0)).count() != 1) {
      // System.out.println("Failed pattern match for 'W'");
      return false;
    }
    // y 0-1 1-3 4-8
    if (pattern.get(0).charAt(1) != pattern.get(1).charAt(3) || pattern.get(1).charAt(3) != pattern.get(4).charAt(8)
        || headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(1)).count() != 3) {
      // System.out.println("Failed pattern match for 'y'");
      return false;
    }
    // d 0-2
    if (headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(2)).count() != 1) {
      // System.out.println("Failed pattern match for 'd'");
      return false;
    }
    // z 0-3 1-2
    if (pattern.get(0).charAt(3) != pattern.get(1).charAt(2)
        || headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(3)).count() != 2) {
      // System.out.println("Failed pattern match for 'z'");
      return false;
    }
    // i 0-4 1-1 1-5 2-8 2-9 3-0 4-10
    if (pattern.get(0).charAt(4) != pattern.get(1).charAt(1) || pattern.get(1).charAt(1) != pattern.get(1).charAt(5)
        || pattern.get(1).charAt(5) != pattern.get(2).charAt(8) || pattern.get(2).charAt(8) != pattern.get(2).charAt(9)
        || pattern.get(2).charAt(9) != pattern.get(3).charAt(0) || pattern.get(3).charAt(0) != pattern.get(4).charAt(10)
        || headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(4)).count() != 7) {
      // System.out.println("Failed pattern match for 'i'");
      return false;
    }
    // a 0-5 4-6 5-6
    if (pattern.get(0).charAt(5) != pattern.get(4).charAt(6) || pattern.get(4).charAt(6) != pattern.get(5).charAt(6)
        || headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(5)).count() != 3) {
      // System.out.println("Failed pattern match for 'a'");
      return false;
    }
    // ł 0-6
    if (headerStr.chars().filter(ch -> ch == pattern.get(0).charAt(6)).count() != 1) {
      // System.out.println("Failed pattern match for 'ł'");
      return false;
    }
    // F 1-0
    if (headerStr.chars().filter(ch -> ch == pattern.get(1).charAt(0)).count() != 1) {
      // System.out.println("Failed pattern match for 'F'");
      return false;
    }
    // k 1-4 4-9
    if (pattern.get(1).charAt(4) != pattern.get(4).charAt(9)
        || headerStr.chars().filter(ch -> ch == pattern.get(1).charAt(4)).count() != 2) {
      // System.out.println("Failed pattern match for 'k'");
      return false;
    }
    // , 1-6
    if (headerStr.chars().filter(ch -> ch == pattern.get(1).charAt(6)).count() != 1) {
      // System.out.println("Failed pattern match for ','");
      return false;
    }
    // A 2-0
    if (headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(0)).count() != 1) {
      // System.out.println("Failed pattern match for 'A'");
      return false;
    }
    // s 2-1 5-3
    if (pattern.get(2).charAt(1) != pattern.get(5).charAt(3)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(1)).count() != 2) {
      // System.out.println("Failed pattern match for 's'");
      return false;
    }
    // t 2-2 4-7 5-1
    if (pattern.get(2).charAt(2) != pattern.get(4).charAt(7) || pattern.get(4).charAt(7) != pattern.get(5).charAt(1)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(2)).count() != 3) {
      // System.out.println("Failed pattern match for 't'");
      return false;
    }
    // r 2-3 4-4
    if (pattern.get(2).charAt(3) != pattern.get(4).charAt(4)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(3)).count() != 2) {
      // System.out.println("Failed pattern match for 'r'");
      return false;
    }
    // o 2-4 2-6 4-3 5-2 5-4
    if (pattern.get(2).charAt(4) != pattern.get(2).charAt(6) || pattern.get(2).charAt(6) != pattern.get(4).charAt(3)
        || pattern.get(4).charAt(3) != pattern.get(5).charAt(2) || pattern.get(5).charAt(2) != pattern.get(5).charAt(4)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(4)).count() != 5) {
      // System.out.println("Failed pattern match for 'o'");
      return false;
    }
    // n 2-5 4-1 5-7
    if (pattern.get(2).charAt(5) != pattern.get(4).charAt(1) || pattern.get(4).charAt(1) != pattern.get(5).charAt(7)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(5)).count() != 3) {
      // System.out.println("Failed pattern match for 'n'");
      return false;
    }
    // m 2-7 4-5
    if (pattern.get(2).charAt(7) != pattern.get(4).charAt(5)
        || headerStr.chars().filter(ch -> ch == pattern.get(2).charAt(7)).count() != 2) {
      // System.out.println("Failed pattern match for 'm'");
      return false;
    }
    // I 4-0
    if (headerStr.chars().filter(ch -> ch == pattern.get(4).charAt(0)).count() != 1) {
      // System.out.println("Failed pattern match for 'I'");
      return false;
    }
    // f 4-2
    if (headerStr.chars().filter(ch -> ch == pattern.get(4).charAt(2)).count() != 1) {
      // System.out.println("Failed pattern match for 'f'");
      return false;
    }
    // S 5-0
    if (headerStr.chars().filter(ch -> ch == pattern.get(5).charAt(0)).count() != 1) {
      // System.out.println("Failed pattern match for 'S'");
      return false;
    }
    // w 5-5
    if (headerStr.chars().filter(ch -> ch == pattern.get(5).charAt(5)).count() != 1) {
      // System.out.println("Failed pattern match for 'w'");
      return false;
    }
    // e 5-8
    if (headerStr.chars().filter(ch -> ch == pattern.get(5).charAt(8)).count() != 1) {
      // System.out.println("Failed pattern match for 'e'");
      return false;
    }
    // j 5-9
    if (headerStr.chars().filter(ch -> ch == pattern.get(5).charAt(9)).count() != 1) {
      // System.out.println("Failed pattern match for 'j'");
      return false;
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
    String corLengths = "[7, 7, 10, 1, 11, 10]";
    return lengthlist.toString().equals(corLengths);
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
    // get only 6 first words
    if (split.size() < 6)
      return;

    List<String> header = null;

    // get all words with 7 letters as possible pattern starters
    List<String> starterWords = split.stream().filter(x -> x.length() == 7).collect(Collectors.toList());
    for (String word : starterWords) {
      int index = split.indexOf(word);
      // System.out.println("Possible start word: `" + word + "` at index " + index);

      // end of possible patterns
      if (index + 5 >= split.size())
        return;

      header = split.subList(index, index + 6);

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
    String[] decodedWords = { "Wydział", "Fizyki,", "Astronomii", "i", "Informatyki", "Stosowanej" };
    for (int wI = 0; wI < decodedWords.length; wI++) {
      String word = header.get(wI);
      String decodedWord = decodedWords[wI];
      for (int i = 0; i < decodedWord.toCharArray().length; i++) {
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
