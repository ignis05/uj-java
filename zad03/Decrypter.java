import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Decrypter implements DecrypterInterface {

  private Map<Character, Character> code = new HashMap<>();;
  private Map<Character, Character> decode = new HashMap<>();;

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
    List<String> header = split.subList(0, 6);
    // compare lenghts of 6 first words to determine if header is valid
    List<Integer> lengthlist = header.stream().map(elt -> elt.length()).collect(Collectors.toList());
    String validHeaderLenghts = "[7, 7, 10, 1, 11, 10]";
    if (!lengthlist.toString().equals(validHeaderLenghts)) {
      System.out.println(
          "Header length check failed:\nexpected: " + validHeaderLenghts + "\nreceived: " + lengthlist.toString());
      return;
    }

    String headerStr = String.join(" ", header);
    // Wydział Fizyki, Astronomii i Informatyki Stosowanej
    // W 0-0
    if (headerStr.chars().filter(ch -> ch == header.get(0).charAt(0)).count() != 1) {
      System.out.println("Failed pattern match for 'W'");
      return;
    }
    // y 0-1 1-3 4-8
    if (header.get(0).charAt(1) != header.get(1).charAt(3) || header.get(1).charAt(3) != header.get(4).charAt(8)
        || headerStr.chars().filter(ch -> ch == header.get(0).charAt(1)).count() != 3) {
      System.out.println("Failed pattern match for 'y'");
      return;
    }
    // d 0-2
    if (headerStr.chars().filter(ch -> ch == header.get(0).charAt(2)).count() != 1) {
      System.out.println("Failed pattern match for 'd'");
      return;
    }
    // z 0-3 1-2
    if (header.get(0).charAt(3) != header.get(1).charAt(2)
        || headerStr.chars().filter(ch -> ch == header.get(0).charAt(3)).count() != 2) {
      System.out.println("Failed pattern match for 'z'");
      return;
    }
    // i 0-4 1-1 1-5 2-8 2-9 3-0 4-10
    if (header.get(0).charAt(4) != header.get(1).charAt(1) || header.get(1).charAt(1) != header.get(1).charAt(5)
        || header.get(1).charAt(5) != header.get(2).charAt(8) || header.get(2).charAt(8) != header.get(2).charAt(9)
        || header.get(2).charAt(9) != header.get(3).charAt(0) || header.get(3).charAt(0) != header.get(4).charAt(10)
        || headerStr.chars().filter(ch -> ch == header.get(0).charAt(4)).count() != 7) {
      System.out.println("Failed pattern match for 'i'");
      return;
    }
    // a 0-5 4-6 5-6
    if (header.get(0).charAt(5) != header.get(4).charAt(6) || header.get(4).charAt(6) != header.get(5).charAt(6)
        || headerStr.chars().filter(ch -> ch == header.get(0).charAt(5)).count() != 3) {
      System.out.println("Failed pattern match for 'a'");
      return;
    }
    // ł 0-6
    if (headerStr.chars().filter(ch -> ch == header.get(0).charAt(6)).count() != 1) {
      System.out.println("Failed pattern match for 'ł'");
      return;
    }
    // F 1-0
    if (headerStr.chars().filter(ch -> ch == header.get(1).charAt(0)).count() != 1) {
      System.out.println("Failed pattern match for 'F'");
      return;
    }
    // k 1-4 4-9
    if (header.get(1).charAt(4) != header.get(4).charAt(9)
        || headerStr.chars().filter(ch -> ch == header.get(1).charAt(4)).count() != 2) {
      System.out.println("Failed pattern match for 'k'");
      return;
    }
    // , 1-6
    if (headerStr.chars().filter(ch -> ch == header.get(1).charAt(6)).count() != 1) {
      System.out.println("Failed pattern match for ','");
      return;
    }
    // A 2-0
    if (headerStr.chars().filter(ch -> ch == header.get(2).charAt(0)).count() != 1) {
      System.out.println("Failed pattern match for 'A'");
      return;
    }
    // s 2-1 5-3
    if (header.get(2).charAt(1) != header.get(5).charAt(3)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(1)).count() != 2) {
      System.out.println("Failed pattern match for 's'");
      return;
    }
    // t 2-2 4-7 5-1
    if (header.get(2).charAt(2) != header.get(4).charAt(7) || header.get(4).charAt(7) != header.get(5).charAt(1)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(2)).count() != 3) {
      System.out.println("Failed pattern match for 't'");
      return;
    }
    // r 2-3 4-4
    if (header.get(2).charAt(3) != header.get(4).charAt(4)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(3)).count() != 2) {
      System.out.println("Failed pattern match for 'r'");
      return;
    }
    // o 2-4 2-6 4-3 5-2 5-4
    if (header.get(2).charAt(4) != header.get(2).charAt(6) || header.get(2).charAt(6) != header.get(4).charAt(3)
        || header.get(4).charAt(3) != header.get(5).charAt(2) || header.get(5).charAt(2) != header.get(5).charAt(4)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(4)).count() != 5) {
      System.out.println("Failed pattern match for 'o'");
      return;
    }
    // n 2-5 4-1 5-7
    if (header.get(2).charAt(5) != header.get(4).charAt(1) || header.get(4).charAt(1) != header.get(5).charAt(7)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(5)).count() != 3) {
      System.out.println("Failed pattern match for 'n'");
      return;
    }
    // m 2-7 4-5
    if (header.get(2).charAt(7) != header.get(4).charAt(5)
        || headerStr.chars().filter(ch -> ch == header.get(2).charAt(7)).count() != 2) {
      System.out.println("Failed pattern match for 'm'");
      return;
    }
    // I 4-0
    if (headerStr.chars().filter(ch -> ch == header.get(4).charAt(0)).count() != 1) {
      System.out.println("Failed pattern match for 'I'");
      return;
    }
    // f 4-2
    if (headerStr.chars().filter(ch -> ch == header.get(4).charAt(2)).count() != 1) {
      System.out.println("Failed pattern match for 'f'");
      return;
    }
    // S 5-0
    if (headerStr.chars().filter(ch -> ch == header.get(5).charAt(0)).count() != 1) {
      System.out.println("Failed pattern match for 'S'");
      return;
    }
    // w 5-5
    if (headerStr.chars().filter(ch -> ch == header.get(5).charAt(5)).count() != 1) {
      System.out.println("Failed pattern match for 'w'");
      return;
    }
    // e 5-8
    if (headerStr.chars().filter(ch -> ch == header.get(5).charAt(8)).count() != 1) {
      System.out.println("Failed pattern match for 'e'");
      return;
    }
    // j 5-9
    if (headerStr.chars().filter(ch -> ch == header.get(5).charAt(9)).count() != 1) {
      System.out.println("Failed pattern match for 'j'");
      return;
    }

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
