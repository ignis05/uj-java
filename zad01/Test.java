public class Test {
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
    if (!result.equals(expected))
      System.err.println("Error: " + test + " => " + result + " || expected: " + expected);
    return result;
  }

  public static void main(String[] args) {
    Decode decoder = new Decode();

    testString(decoder, "000010000110010111010", "01020");
    testString(decoder, "11011110000000011011111100110", "01020");
  }

}
