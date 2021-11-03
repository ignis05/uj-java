public class Test04 {
  public static void main(String[] args) {
    var b = new BusLine();
    b.addLineSegment("a", new LineSegment(new Position2D(1, 1), new Position2D(5, 5)));
    b.printMap();
  }
}
