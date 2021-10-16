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

    testString(decoder, "101011011100101110111", "001202");
    testString(decoder, "000000001110000000111111111000111", "02");
    testString(decoder, "1111111111111111111011111111111111111110", "00");
    testString(decoder, "110111111110111111011110110", "03210");
    testString(decoder, "111111111111110111111111111111111111111111111111111111111111111111111110", "03");
    testString(decoder, "0000111111111111110000000000111111111111111111111111111111111111111111111111111111110000000", "03");

    if (errorCount == 0)
      System.out.println("All tests passed");
    else
      System.out.println(errorCount + " tests failed");

    Decode decoder2 = new Decode();
    decoder.input(1);
    decoder2.input(1);
    decoder.input(0);
    decoder2.input(0);
    decoder.input(1);
    decoder2.input(1);
    decoder.input(1);
    decoder2.input(1);
    decoder.input(0);
    decoder2.input(0);
    if (!decoder.output().equals(decoder2.output()))
      System.err.println("Error: test 1 failed");
    if (!decoder.output().equals("01"))
      System.err.println("Error: test 2 failed");
    decoder.reset();
    if (!decoder.output().equals(""))
      System.err.println("Error: test 3 failed");
    if (decoder.output().equals(decoder2.output()))
      System.err.println("Error: test 4 failed");

  }

}
