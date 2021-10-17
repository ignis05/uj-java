import java.util.List;

public class Test {
  public static void main(String[] args) {
    Loops loopTest = new Loops();
    loopTest.setLowerLimits(List.of(0, 0, 1));
    loopTest.setUpperLimits(List.of(1, 2, 2));
    System.out.println(loopTest.getResult());
  }
}
