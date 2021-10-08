public class NthRoot {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Not enough arguments");
      return;
    }
    int number = Integer.parseInt(args[0]);
    double n = Double.parseDouble(args[1]);
    double result = Math.pow(number, 1.0 / n);
    System.out.println("Result: " + result);
  }
}
