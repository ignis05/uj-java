public class Geom {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Not enough arguments");
      return;
    }
    double product = 1;
    for (String numStr : args) {
      product *= Double.parseDouble(numStr);
    }
    System.out.println("product: " + product);
    double result = Math.pow(product, 1.0 / args.length);
    System.out.println("Result: " + result);
  }
}
