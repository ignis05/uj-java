public class Test04 {
  public static void main(String[] args) {
    var b = new BusLine();
    b.addLineSegment("a", new LineSegment(new Position2D(2, 1), new Position2D(11, 10)));
    b.addLineSegment("a", new LineSegment(new Position2D(10, 9), new Position2D(10, 1)));
    b.addLineSegment("a", new LineSegment(new Position2D(9, 2), new Position2D(4, 7)));
    b.addLineSegment("b", new LineSegment(new Position2D(8, 6), new Position2D(12, 6)));
    b.printMap();
    b.findIntersections();
    System.out.println(b.getLines());
  }
}
