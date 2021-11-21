import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesterOramusa {
  static int errorCount = 0;

  public static void inputLines(Map<String, List<LineSegment>> lines, Map<String, LineSegment> starts,
      BusLine busline) {
    for (var entry : starts.entrySet()) {
      busline.addBusLine(entry.getKey(), entry.getValue().getFirstPosition(), entry.getValue().getLastPosition());
    }
    for (var entry : lines.entrySet()) {
      for (var segment : entry.getValue()) {
        busline.addLineSegment(entry.getKey(), segment);
      }
    }
  }

  public static void main(String[] args) {
    // testy oramusa fourintersections
    var test = new HashMap<String, List<LineSegment>>();
    test.put("A",
        List.of(new LineSegment(new Position2D(6, 12), new Position2D(1, 12)),
            new LineSegment(new Position2D(1, 14), new Position2D(3, 16)),
            new LineSegment(new Position2D(6, 4), new Position2D(6, 12)),
            new LineSegment(new Position2D(1, 1), new Position2D(1, 4)),
            new LineSegment(new Position2D(1, 4), new Position2D(6, 4)),
            new LineSegment(new Position2D(1, 12), new Position2D(1, 14))));
    test.put("B", List.of(new LineSegment(new Position2D(3, 14), new Position2D(3, 2)),
        new LineSegment(new Position2D(1, 16), new Position2D(3, 14))));
    test.put("C",
        List.of(new LineSegment(new Position2D(1, 8), new Position2D(11, 8)),
            new LineSegment(new Position2D(9, 5), new Position2D(9, 12)),
            new LineSegment(new Position2D(11, 5), new Position2D(9, 5)),
            new LineSegment(new Position2D(11, 8), new Position2D(11, 5))));
    test.put("D", List.of(new LineSegment(new Position2D(1, 10), new Position2D(3, 10)),
        new LineSegment(new Position2D(3, 10), new Position2D(11, 10))));

    var start = new HashMap<String, LineSegment>();
    start.put("A", new LineSegment(new Position2D(1, 1), new Position2D(3, 16)));
    start.put("B", new LineSegment(new Position2D(1, 16), new Position2D(3, 2)));
    start.put("C", new LineSegment(new Position2D(1, 8), new Position2D(9, 12)));
    start.put("D", new LineSegment(new Position2D(1, 10), new Position2D(11, 10)));

    var b = new BusLine();
    inputLines(test, start, b);
    b.findIntersections();
    System.out.println("---- Test1 ----");
    b.printMap();
    System.out.println(b.getIntersectionPositions());

    b = new BusLine();
    test = new HashMap<String, List<LineSegment>>();
    test.put("A",
        List.of(new LineSegment(new Position2D(1, 4), new Position2D(6, 4)),
            new LineSegment(new Position2D(1, 12), new Position2D(1, 14)),
            new LineSegment(new Position2D(1, 14), new Position2D(3, 16)),
            new LineSegment(new Position2D(6, 4), new Position2D(6, 12)),
            new LineSegment(new Position2D(6, 12), new Position2D(1, 12)),
            new LineSegment(new Position2D(1, 1), new Position2D(1, 4))));
    test.put("B", List.of(new LineSegment(new Position2D(3, 14), new Position2D(3, 2)),
        new LineSegment(new Position2D(1, 16), new Position2D(3, 14))));
    test.put("C",
        List.of(new LineSegment(new Position2D(11, 8), new Position2D(11, 5)),
            new LineSegment(new Position2D(1, 8), new Position2D(11, 8)),
            new LineSegment(new Position2D(9, 5), new Position2D(9, 12)),
            new LineSegment(new Position2D(11, 5), new Position2D(9, 5))));
    test.put("D", List.of(new LineSegment(new Position2D(1, 10), new Position2D(3, 10)),
        new LineSegment(new Position2D(3, 10), new Position2D(11, 10))));
  }
}