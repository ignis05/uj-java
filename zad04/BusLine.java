import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class BusLine implements BusLineInterface {

  public class LinesPair implements BusLineInterface.LinesPair {
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
  }

  private Map<String, List<Position>> lineMap = new HashMap<String, List<Position>>();
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
    if (this.lineMap.containsKey(busLineName))
      this.lineMap.get(busLineName).addAll(this.getPointsFromSegment(lineSegment));
    else
      this.lineMap.put(busLineName, this.getPointsFromSegment(lineSegment));
  }

  @Override
  public void findIntersections() {
    // render 2d map
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
    List<Position> intersections = new LinkedList<Position>();
    for (var entry : this.lineMap.entrySet()) {
      for (var pos : entry.getValue()) {
        if (!res[pos.getCol() - offsetCol][pos.getRow() - offsetRow].equals(" ")) {
          res[pos.getCol() - offsetCol][pos.getRow() - offsetRow] = "X";
          intersections.add(pos);
        } else
          res[pos.getCol() - offsetCol][pos.getRow() - offsetRow] = entry.getKey();
      }
    }
    // generate detailed intersection list
    this.intersections = new ArrayList<Intersection>(intersections.size());
    for (var intPoint : intersections) {
      var intersection = new Intersection(intPoint);
      int mapCol = intPoint.getCol() - offsetCol;
      int mapRow = intPoint.getRow() - offsetRow;
      // horizontal
      try {
        if (res[mapCol - 1][mapRow].equals(res[mapCol + 1][mapRow]) && !res[mapCol - 1][mapRow].equals(" ")) {
          intersection.horizontal = res[mapCol - 1][mapRow];
        }
      } catch (IndexOutOfBoundsException i) {
      }
      // vertical
      try {
        if (res[mapCol][mapRow - 1].equals(res[mapCol][mapRow + 1]) && !res[mapCol][mapRow - 1].equals(" ")) {
          intersection.vertical = res[mapCol][mapRow - 1];
        }
      } catch (IndexOutOfBoundsException i) {
      }
      // backslash
      try {
        if (res[mapCol - 1][mapRow - 1].equals(res[mapCol + 1][mapRow + 1])
            && !res[mapCol - 1][mapRow - 1].equals(" ")) {
          intersection.backslash = res[mapCol - 1][mapRow - 1];
        }
      } catch (IndexOutOfBoundsException i) {
      }
      // slash
      try {
        if (res[mapCol + 1][mapRow - 1].equals(res[mapCol - 1][mapRow + 1])
            && !res[mapCol + 1][mapRow - 1].equals(" ")) {
          intersection.slash = res[mapCol + 1][mapRow - 1];
        }
      } catch (IndexOutOfBoundsException i) {
      }
      // check for 90deg crossings
      if (intersection.horizontal != null && intersection.vertical != null) {
        intersection.isStraight = true;
      }
      if (intersection.slash != null && intersection.backslash != null) {
        intersection.isDiagonal = true;
      }
      if (intersection.isStraight || intersection.isDiagonal)
        this.intersections.add(intersection);
    }
  }

  @Override
  public Map<String, List<Position>> getLines() {
    Map<String, List<Position>> result = new HashMap<String, List<Position>>();
    for (var entry : this.lineMap.entrySet()) {
      String lineName = entry.getKey();
      List<Position> positions = entry.getValue();
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
      List<Position> uniquePositions = positions.stream().distinct().collect(Collectors.toList());
      result.put(lineName, uniquePositions);
    }
    return result;
  }

  @Override
  public Map<String, List<Position>> getIntersectionPositions() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Map<String, List<String>> getIntersectionsWithLines() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Map<BusLineInterface.LinesPair, Set<Position>> getIntersectionOfLinesPair() {
    // TODO Auto-generated method stub
    return null;
  }

}
