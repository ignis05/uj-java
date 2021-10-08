public class GCD {
  public static int gcd(int a, int b) {
    if (a == 0)
      return b;
    return gcd(b % a, a);
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Not enough arguments");
      return;
    }
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int result = gcd(a, b);
    System.out.println("Result: " + result);
  }
}