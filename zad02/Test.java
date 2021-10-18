import java.util.List;

public class Test {

  // if false skips test with 15 nested loops
  static final boolean doLargeTest = true;

  static int errorCount = 0;
  static int testCount = 0;

  public static void testString(List<Integer> lower, List<Integer> upper, String expected) {
    Loops loopTest = new Loops();
    if (lower != null)
      loopTest.setLowerLimits(lower);
    if (upper != null)
      loopTest.setUpperLimits(upper);
    String result = loopTest.getResult().toString();
    if (!result.equals(expected)) {
      System.err.println("Error: test " + testCount + " failed:");
      System.err.println("lower:\t" + lower);
      System.err.println("upper:\t" + upper);
      System.err.println("result: \t" + result);
      System.err.println("expected: \t" + expected);
      errorCount++;
    } else {
      testCount++;
    }
  }

  public static void main(String[] args) {
    // test from docs
    testString(List.of(0, 0, 1), List.of(1, 2, 2),
        "[[0, 0, 1], [0, 0, 2], [0, 1, 1], [0, 1, 2], [0, 2, 1], [0, 2, 2], [1, 0, 1], [1, 0, 2], [1, 1, 1], [1, 1, 2], [1, 2, 1], [1, 2, 2]]");

    // positive numbers test
    testString(List.of(0, 1, 2), List.of(3, 3, 3),
        "[[0, 1, 2], [0, 1, 3], [0, 2, 2], [0, 2, 3], [0, 3, 2], [0, 3, 3], [1, 1, 2], [1, 1, 3], [1, 2, 2], [1, 2, 3], [1, 3, 2], [1, 3, 3], [2, 1, 2], [2, 1, 3], [2, 2, 2], [2, 2, 3], [2, 3, 2], [2, 3, 3], [3, 1, 2], [3, 1, 3], [3, 2, 2], [3, 2, 3], [3, 3, 2], [3, 3, 3]]");
    // negative number test
    testString(List.of(-1, -1, -1), List.of(0, 1, 0),
        "[[-1, -1, -1], [-1, -1, 0], [-1, 0, -1], [-1, 0, 0], [-1, 1, -1], [-1, 1, 0], [0, -1, -1], [0, -1, 0], [0, 0, -1], [0, 0, 0], [0, 1, -1], [0, 1, 0]]");
    testString(List.of(-10, -11, -12), List.of(-9, -10, -11),
        "[[-10, -11, -12], [-10, -11, -11], [-10, -10, -12], [-10, -10, -11], [-9, -11, -12], [-9, -11, -11], [-9, -10, -12], [-9, -10, -11]]");
    // no setLowerLimits call
    testString(null, List.of(2, 2), "[[0, 0], [0, 1], [0, 2], [1, 0], [1, 1], [1, 2], [2, 0], [2, 1], [2, 2]]");
    testString(null, List.of(2, 1, 0), "[[0, 0, 0], [0, 1, 0], [1, 0, 0], [1, 1, 0], [2, 0, 0], [2, 1, 0]]");
    testString(null, List.of(0, 0, 0), "[[0, 0, 0]]");
    testString(null, List.of(0, 0, 2), "[[0, 0, 0], [0, 0, 1], [0, 0, 2]]");
    // no setUpperLimits call
    testString(List.of(0, 0, 0), null, "[[0, 0, 0]]");
    testString(List.of(-1, -1, -2), null,
        "[[-1, -1, -2], [-1, -1, -1], [-1, -1, 0], [-1, 0, -2], [-1, 0, -1], [-1, 0, 0], [0, -1, -2], [0, -1, -1], [0, -1, 0], [0, 0, -2], [0, 0, -1], [0, 0, 0]]");
    testString(List.of(-3, -2, -1), null,
        "[[-3, -2, -1], [-3, -2, 0], [-3, -1, -1], [-3, -1, 0], [-3, 0, -1], [-3, 0, 0], [-2, -2, -1], [-2, -2, 0], [-2, -1, -1], [-2, -1, 0], [-2, 0, -1], [-2, 0, 0], [-1, -2, -1], [-1, -2, 0], [-1, -1, -1], [-1, -1, 0], [-1, 0, -1], [-1, 0, 0], [0, -2, -1], [0, -2, 0], [0, -1, -1], [0, -1, 0], [0, 0, -1], [0, 0, 0]]");
    // no method calls
    testString(null, null, "[[0]]");

    // print results
    if (errorCount == 0)
      System.out.println("All " + testCount + " tests passed succesfully");
    else
      System.out.println(errorCount + " Tests failed");

    if (!doLargeTest)
      return;
    // test with 15 nested loops
    System.out.println("\n------\nTesting with 15 nested loops - this might take a moment");
    Loops loopTest = new Loops();
    loopTest.setLowerLimits(List.of(1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1));
    loopTest.setUpperLimits(List.of(3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2));
    if (loopTest.getResult().toString().length() != 473651712) {
      System.err.println("15 loops test failed, but program managed to not crash");
    } else {
      System.out.println("Program managed to not crash with 15 loops and the result length seems ok ¯\\_(ツ)_/¯");
    }
  }
}
