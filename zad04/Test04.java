public class Test04 {
  public static void main(String[] args) {
    var b = new BusLine();
    b.addBusLine("a", new Position2D(1, 1), new Position2D(1, 5));
    b.addLineSegment("a", new LineSegment(new Position2D(1, 1), new Position2D(5, 5))); // 1
    b.addLineSegment("a", new LineSegment(new Position2D(5, 1), new Position2D(1, 5))); // 3
    b.addLineSegment("a", new LineSegment(new Position2D(5, 5), new Position2D(5, 1))); // 2
    b.addBusLine("b", new Position2D(4, 3), new Position2D(6, 3));
    b.addLineSegment("b", new LineSegment(new Position2D(4, 3), new Position2D(6, 3)));
    b.printMap();
    b.findIntersections();
    System.out.println(b.getLines());
  }
}
