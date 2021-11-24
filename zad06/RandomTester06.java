import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomTester06 {
  static Random rand = new Random(21372137l);

  // imputs words separated with spaces
  public static void inputSequence(String sequence, Compression comp) {
    for (var word : sequence.split(" "))
      comp.addWord(word);
  }

  // joins output words into single string
  public static String outputSequence(Compression comp, int size) {
    List<String> ls = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      ls.add(comp.getWord());
    }
    return String.join(" ", ls);
  }

  // calculates header bit length
  public static int getHeaderLength(Map<String, String> header) {
    var entry1 = header.entrySet().iterator().next();
    return (entry1.getKey().length() + entry1.getValue().length()) * header.size();
  }

  // calculates sequence length
  public static int getSequenceLenght(String sequence) {
    return List.of(sequence.split(" ")).stream().mapToInt(String::length).sum();
  }

  public static void main(String[] args) {
    int testCount = 1000;

    List<Integer> results = new ArrayList<Integer>(testCount);
    for (int i = 1; i <= testCount; i++) {
      var comp = new Compression();

      // random size list 10-31
      int testSize = 10 + rand.nextInt(21);
      List<String> wordList = new ArrayList<String>(testSize);
      // random word size 2-8
      int wordSize = 2 + rand.nextInt(7);

      for (int j = 0; j < testSize; j++) {
        int limit = (int) Math.pow(2, wordSize);
        // weighted random numbers to make it more likely that compression is possible
        int randInt = (int) Math.floor(Math.pow(rand.nextDouble() * Math.pow(limit, 5), 1.0 / 5));
        String word = Integer.toBinaryString(limit | randInt).substring(1);
        wordList.add(word);
        comp.addWord(word);
      }

      // System.out.println(wordList);

      comp.compress();
      var header = comp.getHeader();

      // compression failed - skip
      if (header.size() == 0) {
        continue;
      }

      String sequence = outputSequence(comp, testSize);

      results.add(getSequenceLenght(sequence) + getHeaderLength(header));
    }

    System.out.println(results);

    List<Integer> expectedArray = List.of(155, 41, 32, 63, 130, 124, 47, 38, 49, 86, 34, 103, 49, 105, 100, 25, 37, 40, 65, 24, 24, 69, 115, 60, 96, 142, 42, 47, 69, 97, 35, 35,
        87, 36, 111, 69, 36, 50, 106, 26, 31, 46, 57, 22, 90, 32, 52, 88, 55, 56, 70, 20, 128, 62, 205, 34, 39, 34, 59, 57, 29, 36, 28, 22, 43, 41, 52, 70, 60, 65, 38, 70, 83, 69,
        82, 62, 39, 53, 17, 43, 72, 85, 35, 22, 44, 104, 29, 88, 22, 40, 29, 99, 48, 107, 17, 38, 167, 115, 64, 35, 71, 164, 56, 92, 105, 37, 58, 72, 25, 35, 107, 51, 31, 43, 109,
        35, 125, 53, 102, 112, 69, 60, 60, 21, 105, 40, 26, 16, 54, 36, 57, 18, 116, 22, 56, 72, 30, 29, 25, 75, 118, 75, 48, 50, 53, 78, 50, 43, 85, 17, 39, 49, 40, 29, 109, 44,
        49, 49, 39, 48, 94, 30, 112, 33, 58, 54, 102, 85, 84, 50, 27, 73, 46, 97, 59, 101, 32, 124, 25, 104, 29, 25, 51, 38, 35, 124, 26, 57, 27, 51, 132, 85, 88, 36, 50, 39, 70,
        75, 31, 93, 107, 40, 47, 53, 24, 66, 34, 18, 55, 83, 20, 72, 88, 57, 98, 133, 56, 34, 55, 79, 104, 74, 76, 29, 25, 39, 30, 106, 42, 176, 33, 25, 88, 58, 27, 81, 32, 15, 57,
        71, 45, 73, 28, 23, 23, 36, 72, 34, 91, 72, 132, 40, 56, 34, 83, 57, 142, 167, 167, 22, 88, 31, 39, 43, 59, 68, 68, 30, 63, 82, 53, 138, 85, 78, 24, 40, 75, 52, 74, 19, 32,
        28, 39, 124, 116, 70, 42, 67, 33, 55, 67, 72, 111, 47, 30, 66, 29, 56, 75, 29, 65, 52, 35, 128, 40, 52, 86, 51, 118, 72, 62, 43, 16, 35, 43, 80, 36, 41, 104, 28, 67, 95,
        92, 88, 24, 80, 66, 23, 67, 28, 70, 28, 85, 67, 82, 37, 70, 89, 45, 58, 104, 41, 65, 55, 20, 88, 74, 39, 27, 146, 74, 43, 39, 58, 51, 17, 29, 76, 37, 34, 95, 71, 41, 38,
        47, 124, 34, 64, 112, 44);

    System.out.println("Results " + (expectedArray.equals(results) ? "" : "do not") + "match expected values");
  }

}
