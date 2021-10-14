public class Test {
  public static int errorCount;

  public static String testString(Decode decoder, String test) {
    for (char ch : test.toCharArray()) {
      int bit = Character.getNumericValue(ch);
      decoder.input(bit);
    }
    String result = decoder.output();
    System.out.println(test + " => " + result);
    decoder.reset();
    return result;
  }

  public static String testString(Decode decoder, String test, String expected) {
    String result = testString(decoder, test);
    if (!result.equals(expected)) {
      errorCount++;
      System.err.println("Error: " + test + " => " + result + " || expected: " + expected);
    }
    return result;
  }

  public static void main(String[] args) {
    Decode decoder = new Decode();

    errorCount = 0;
    testString(decoder, "000010000110010111010", "01020");
    testString(decoder, "11011110000000011011111100110", "01020");
    testString(decoder, "", "");
    testString(decoder, "00000111111111", "");
    testString(decoder, "10", "0");
    testString(decoder, "10110111011110", "0123");
    testString(decoder, "110111101111110111111110", "0123");
    testString(decoder, "00000000000000011000000000000011110000000000000011111100000000001111111100000000000", "0123");

    if (errorCount == 0)
      System.out.println("All tests passed");
    else
      System.out.println(errorCount + " tests failed");
  }

}
