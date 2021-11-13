public class Test04 {
  public static void main(String[] args) {
    var b = new BusLine();
    b.addBusLine("a", new Position2D(1, 1), new Position2D(2, 6));
    b.addLineSegment("a", new LineSegment(new Position2D(1, 1), new Position2D(7, 7))); // 1
    b.addLineSegment("a", new LineSegment(new Position2D(7, 1), new Position2D(2, 6))); // 3
    b.addLineSegment("a", new LineSegment(new Position2D(7, 7), new Position2D(7, 1))); // 2
    b.addBusLine("b", new Position2D(4, 7), new Position2D(7, 7));
    b.addLineSegment("b", new LineSegment(new Position2D(4, 7), new Position2D(7, 7)));
    b.addBusLine("c", new Position2D(1, 1), new Position2D(4, 2));
    b.addLineSegment("c", new LineSegment(new Position2D(1, 1), new Position2D(1, 4)));
    b.addLineSegment("c", new LineSegment(new Position2D(1, 4), new Position2D(4, 4)));
    b.addLineSegment("c", new LineSegment(new Position2D(4, 4), new Position2D(8, 4)));
    b.addLineSegment("c", new LineSegment(new Position2D(8, 4), new Position2D(8, 2)));
    b.addLineSegment("c", new LineSegment(new Position2D(8, 2), new Position2D(4, 2)));

    b.findIntersections();
    System.out.println(b.getLines());
    System.out.println("\n");
    System.out.println(b.getIntersectionPositions());
    System.out.println("\n");
    System.out.println(b.getIntersectionsWithLines());
    System.out.println("\n");
    System.out.println(b.getIntersectionOfLinesPair());
  }
}