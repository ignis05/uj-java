import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class TestExtractor implements BusLineInterface {

  public static class LinesPair implements BusLineInterface.LinesPair {
    private String firstName;
    private String secondName;

    LinesPair(String firstName, String secondName) {
      this.firstName = firstName;
      this.secondName = secondName;
    }

    @Override
    public String getFirstLineName() {
      return this.firstName;
    }

    @Override
    public String getSecondLineName() {
      return this.secondName;
    }

    @Override
    public int hashCode() {
      return Objects.hash(firstName, secondName);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      LinesPair other = (LinesPair) obj;
      return this.firstName.equals(other.firstName) && this.secondName.equals(other.secondName);
    }

    @Override
    public String toString() {
      return "LinesPair (" + firstName + ", " + secondName + ")";
    }
  }

  public class Intersection {
    public final Position pos;
    public final int col;
    public final int row;

    public String horizontal = null;
    public String vertical = null;
    public String slash = null;
    public String backslash = null;
    public boolean isStraight = false;
    public boolean isDiagonal = false;

    Intersection(Position pos) {
      this.pos = pos;
      this.col = pos.getCol();
      this.row = pos.getRow();
    }

    public boolean hasLine(String lineName) {
      return lineName.equals(this.horizontal) || lineName.equals(this.vertical) || lineName.equals(this.slash)
          || lineName.equals(this.backslash);
    }

    public String intersectsWith(String lineName) {
      if (this.isStraight) {
        if (lineName.equals(this.vertical))
          return this.horizontal;
        if (lineName.equals(this.horizontal))
          return this.vertical;
      }
      if (this.isDiagonal) {
        if (lineName.equals(this.slash))
          return this.backslash;
        if (lineName.equals(this.backslash))
          return this.slash;
      }
      return null;
    }
  }

  private Map<String, LineSegment> startMap = new HashMap<String, LineSegment>();
  // raw list of all points for each line
  private Map<String, List<Position>> lineMap = new HashMap<String, List<Position>>();
  // raw list of all points for each line
  private Map<Position, List<String>> pointMap = new HashMap<Position, List<String>>();
  // list of all unpacked vectors
  private Map<String, List<List<Position>>> lineSegmentMap = new HashMap<String, List<List<Position>>>();
  // list of LineSegment vectors for each line
  private Map<String, List<LineSegment>> lineVectors = new HashMap<String, List<LineSegment>>();
  private List<Intersection> intersections;

  private List<Position> getPointsFromSegment(LineSegment lineSegment) {
    List<Position> result;
    Position first = lineSegment.getFirstPosition();
    Position last = lineSegment.getLastPosition();

    // vertical
    if (first.getCol() == last.getCol()) {
      int high;
      int low;
      if (first.getRow() > last.getRow()) {
        high = first.getRow();
        low = last.getRow();
      } else {
        high = last.getRow();
        low = first.getRow();
      }
      result = new ArrayList<Position>(high - low + 1);
      for (int i = low; i <= high; i++) {
        result.add(new Position2D(first.getCol(), i));
      }
    }
    // horizontal
    else if (first.getRow() == last.getRow()) {
      int high;
      int low;
      if (first.getCol() > last.getCol()) {
        high = first.getCol();
        low = last.getCol();
      } else {
        high = last.getCol();
        low = first.getCol();
      }
      result = new ArrayList<Position>(high - low + 1);
      for (int i = low; i <= high; i++) {
        result.add(new Position2D(i, first.getRow()));
      }
    }
    // backslash
    else if ((first.getCol() > last.getCol() && first.getRow() > last.getRow())
        || (first.getCol() < last.getCol() && first.getRow() < last.getRow())) {

      Position high;
      Position low;
      if (first.getCol() > last.getCol()) {
        high = first;
        low = last;
      } else {
        high = last;
        low = first;
      }
      result = new ArrayList<Position>(high.getCol() - low.getCol() + 1);
      for (int i = 0; i <= high.getCol() - low.getCol(); i++) {
        result.add(new Position2D(high.getCol() - i, high.getRow() - i));
      }
    }
    // slash
    else {
      Position high;
      Position low;
      if (first.getCol() > last.getCol()) {
        high = first;
        low = last;
      } else {
        high = last;
        low = first;
      }
      result = new ArrayList<Position>(high.getCol() - low.getCol() + 1);
      for (int i = 0; i <= high.getCol() - low.getCol(); i++) {
        result.add(new Position2D(low.getCol() + i, low.getRow() - i));
      }
    }
    return result;
  }

  public void printMap() {
    var min = this.lineMap.entrySet().iterator().next().getValue().get(0);
    var max = new Position2D(min.getCol(), min.getRow());
    for (var entry : this.lineMap.entrySet()) {
      for (var pos : entry.getValue()) {
        if (pos.getRow() > max.getRow())
          max = new Position2D(max.getCol(), pos.getRow());
        if (pos.getCol() > max.getCol())
          max = new Position2D(pos.getCol(), max.getRow());
        if (pos.getRow() < min.getRow())
          min = new Position2D(min.getCol(), pos.getRow());
        if (pos.getCol() < min.getCol())
          min = new Position2D(pos.getCol(), min.getRow());
      }
    }
    int offsetCol = min.getCol();
    int offsetRow = min.getRow();
    int colSize = max.getCol() - offsetCol + 1;
    int rowSize = max.getRow() - offsetRow + 1;
    String[][] res = new String[colSize][rowSize];
    for (int i = 0; i < colSize; i++) {
      for (int j = 0; j < rowSize; j++) {
        res[i][j] = " ";
      }
    }
    for (var entry : this.lineMap.entrySet()) {
      for (var pos : entry.getValue()) {
        if (!res[pos.getCol() - offsetCol][pos.getRow() - offsetRow].equals(" "))
          res[pos.getCol() - offsetCol][pos.getRow() - offsetRow] = "X";
        else
          res[pos.getCol() - offsetCol][pos.getRow() - offsetRow] = entry.getKey();
      }
    }
    StringBuilder sb = new StringBuilder();
    String[][] flipped = new String[rowSize][colSize];
    for (int i = 0; i < rowSize; i++) {
      for (int j = 0; j < colSize; j++) {
        flipped[i][j] = res[j][i];
      }
    }
    for (String[] s1 : flipped) {
      sb.append(Arrays.toString(s1)).append('\n');
    }
    System.out.println(sb.toString());
  }

  @Override
  public void addLineSegment(String busLineName, LineSegment lineSegment) {
    // generate point list from segment
    var pointList = this.getPointsFromSegment(lineSegment);

    // flip point list if the order is wrong
    if (!pointList.get(0).equals(lineSegment.getFirstPosition()))
      Collections.reverse(pointList);

    // add to point map
    if (!this.lineMap.containsKey(busLineName))
      this.lineMap.put(busLineName, new LinkedList<Position>());
    this.lineMap.get(busLineName).addAll(pointList);

    // add to segments
    if (!this.lineSegmentMap.containsKey(busLineName))
      this.lineSegmentMap.put(busLineName, new LinkedList<List<Position>>());
    this.lineSegmentMap.get(busLineName).add(pointList);

    // add to vector map
    if (!this.lineVectors.containsKey(busLineName))
      this.lineVectors.put(busLineName, new LinkedList<LineSegment>());
    this.lineVectors.get(busLineName).add(lineSegment);

    for (var point : pointList) {
      if (!this.pointMap.containsKey(point)) {
        this.pointMap.put(point, new LinkedList<String>());
      }
      this.pointMap.get(point).add(busLineName);
    }
  }

  @Override
  public void findIntersections() {

    // list of all points suspected of being an intersection
    List<Position> intersections = new LinkedList<Position>();
    for (var entry : this.pointMap.entrySet()) {
      if (entry.getValue().size() > 1) {
        intersections.add(entry.getKey());
      }
    }
    // generate detailed intersection list
    this.intersections = new ArrayList<Intersection>(intersections.size());
    for (var intPoint : intersections) {
      var linesInPoint = this.pointMap.get(intPoint);
      var intersection = new Intersection(intPoint);
      int col = intPoint.getCol();
      int row = intPoint.getRow();
      // horizontal
      var p1 = new Position2D(col + 1, row);
      var p2 = new Position2D(col - 1, row);
      if (this.pointMap.containsKey(p1) && this.pointMap.containsKey(p2)) {
        List<String> common = new ArrayList<String>(this.pointMap.get(p1));
        common.retainAll(this.pointMap.get(p2));
        common.retainAll(linesInPoint);
        if (common.size() > 0)
          intersection.horizontal = common.get(0);
      }
      // vertical
      p1 = new Position2D(col, row + 1);
      p2 = new Position2D(col, row - 1);
      if (this.pointMap.containsKey(p1) && this.pointMap.containsKey(p2)) {
        List<String> common = new ArrayList<String>(this.pointMap.get(p1));
        common.retainAll(this.pointMap.get(p2));
        common.retainAll(linesInPoint);
        if (common.size() > 0)
          intersection.vertical = common.get(0);
      }
      // backslash
      p1 = new Position2D(col - 1, row - 1);
      p2 = new Position2D(col + 1, row + 1);
      if (this.pointMap.containsKey(p1) && this.pointMap.containsKey(p2)) {
        List<String> common = new ArrayList<String>(this.pointMap.get(p1));
        common.retainAll(this.pointMap.get(p2));
        common.retainAll(linesInPoint);
        if (common.size() > 0)
          intersection.backslash = common.get(0);
      }
      // slash
      p1 = new Position2D(col + 1, row - 1);
      p2 = new Position2D(col - 1, row + 1);
      if (this.pointMap.containsKey(p1) && this.pointMap.containsKey(p2)) {
        List<String> common = new ArrayList<String>(this.pointMap.get(p1));
        common.retainAll(this.pointMap.get(p2));
        common.retainAll(linesInPoint);
        if (common.size() > 0)
          intersection.slash = common.get(0);
      }
      // check for 90deg crossings
      if (intersection.horizontal != null && intersection.vertical != null) {
        intersection.isStraight = true;
      } else {
        intersection.horizontal = null;
        intersection.vertical = null;
      }
      if (intersection.slash != null && intersection.backslash != null) {
        intersection.isDiagonal = true;
      } else {
        intersection.slash = null;
        intersection.backslash = null;
      }
      if (intersection.isStraight || intersection.isDiagonal)
        this.intersections.add(intersection);
    }
  }

  @Override
  public Map<String, List<Position>> getLines() {
    Map<String, List<Position>> result = new HashMap<String, List<Position>>();
    // for each line
    for (var entry : this.lineSegmentMap.entrySet()) {
      String lineName = entry.getKey();
      List<List<Position>> posVectors = entry.getValue();
      // skip lines with no intersections
      boolean hasIntersections = false;
      for (var inter : this.intersections) {
        if (inter.hasLine(lineName)) {
          hasIntersections = true;
          break;
        }
      }
      if (!hasIntersections)
        continue;

      var startPos = this.startMap.get(lineName).getFirstPosition();
      // var endPos = this.startMap.get(lineName).getLastPosition();
      boolean doneStart = false;
      List<Position> vector = new ArrayList<Position>(
          posVectors.stream().filter(vect -> vect.get(0).equals(startPos)).findFirst().orElseThrow());

      List<Position> orderedPoints = new LinkedList<>();
      while (true) {
        Position lastPos = vector.get(vector.size() - 1);
        // remove first element of each segment except for the first segment
        if (doneStart) {
          vector.remove(0);
        } else {
          doneStart = true;
        }
        // add points to result
        orderedPoints.addAll(vector);

        // find next vector
        var nextV = posVectors.stream().filter(vect -> vect.get(0).equals(lastPos)).findFirst();

        // end of vectors
        if (nextV.isEmpty())
          break;
        // set nextVector as vector
        vector = new ArrayList<Position>(nextV.get());
      }

      result.put(lineName, orderedPoints);
    }
    return result;
  }

  @Override
  public Map<String, List<Position>> getIntersectionPositions() {
     if (this.lineVectors.size() > 0)
      throw new RuntimeException(this.startMap.toString());

    Map<String, List<Position>> result = new HashMap<String, List<Position>>();
    // for each line
    for (var entry : this.lineSegmentMap.entrySet()) {
      String lineName = entry.getKey();
      List<List<Position>> posVectors = entry.getValue();
      // skip lines with no intersections
      boolean hasIntersections = false;
      for (var inter : this.intersections) {
        if (inter.hasLine(lineName)) {
          hasIntersections = true;
          break;
        }
      }
      if (!hasIntersections)
        continue;

      var startPos = this.startMap.get(lineName).getFirstPosition();
      var vector = posVectors.stream().filter(vect -> vect.get(0).equals(startPos)).findFirst().orElseThrow();
      List<Position> orderedInterSections = new LinkedList<>();
      while (true) {

        for (var point : vector) {
          var interO = this.intersections.stream().filter(el -> el.pos.equals(point)).findFirst();
          // if intersection exists
          if (interO.isPresent()) {
            var inter = interO.get();
            // if the correct line is intersecting
            if (inter.hasLine(lineName)) {
              orderedInterSections.add(point);
            }
          }
        }

        // find next vector
        Position lastPos = vector.get(vector.size() - 1);
        var nextV = posVectors.stream().filter(vect -> vect.get(0).equals(lastPos)).findFirst();

        // end of vectors
        if (nextV.isEmpty())
          break;
        // set nextVector as vector
        vector = nextV.get();
      }

      result.put(lineName, orderedInterSections);
    }
    return result;
  }

  @Override
  public Map<String, List<String>> getIntersectionsWithLines() {
    Map<String, List<String>> result = new HashMap<String, List<String>>();
    // for each line
    for (var entry : this.lineSegmentMap.entrySet()) {
      String lineName = entry.getKey();
      List<List<Position>> posVectors = entry.getValue();
      // skip lines with no intersections
      boolean hasIntersections = false;
      for (var inter : this.intersections) {
        if (inter.hasLine(lineName)) {
          hasIntersections = true;
          break;
        }
      }
      if (!hasIntersections)
        continue;

      var startPos = this.startMap.get(lineName).getFirstPosition();
      var vector = posVectors.stream().filter(vect -> vect.get(0).equals(startPos)).findFirst().orElseThrow();
      List<String> orderedInterSections = new LinkedList<>();
      while (true) {

        for (var point : vector) {
          var interO = this.intersections.stream().filter(el -> el.pos.equals(point)).findFirst();
          // if intersection exists
          if (interO.isPresent()) {
            var inter = interO.get();
            // if the correct line is intersecting
            if (inter.hasLine(lineName)) {
              if (inter.intersectsWith(lineName) != null)
                orderedInterSections.add(inter.intersectsWith(lineName));
            }
          }
        }

        // find next vector
        Position lastPos = vector.get(vector.size() - 1);
        var nextV = posVectors.stream().filter(vect -> vect.get(0).equals(lastPos)).findFirst();

        // end of vectors
        if (nextV.isEmpty())
          break;
        // set nextVector as vector
        vector = nextV.get();
      }

      result.put(lineName, orderedInterSections);
    }
    return result;
  }

  @Override
  public Map<BusLineInterface.LinesPair, Set<Position>> getIntersectionOfLinesPair() {
    Map<BusLineInterface.LinesPair, Set<Position>> result = new HashMap<BusLineInterface.LinesPair, Set<Position>>();
    // generate unique line pairs as result keys
    for (var lineName : this.startMap.keySet()) {
      for (var lineName2 : this.startMap.keySet()) {
        // if (lineName.equals(lineName2)) continue; // unless not paired with its own
        // copy
        BusLineInterface.LinesPair pair = new LinesPair(lineName, lineName2);
        result.putIfAbsent(pair, new HashSet<Position>());
      }
    }
    for (var pair : result.keySet()) {
      // get all intersections
      List<Intersection> inters = this.intersections.stream()
          .filter(inter -> pair.getSecondLineName().equals(inter.intersectsWith(pair.getFirstLineName())))
          .collect(Collectors.toList());
      // if any are found, map them by positions and transform to set
      if (inters.size() > 0) {
        result.put(pair, new HashSet<Position>(inters.stream().map(el -> el.pos).collect(Collectors.toList())));
      }
    }
    return result;
  }

  @Override
  public void addBusLine(String busLineName, Position firstPoint, Position lastPoint) {
    this.startMap.put(busLineName, new LineSegment(firstPoint, lastPoint));
  }

}
