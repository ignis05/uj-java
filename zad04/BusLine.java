import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

  private Map<String, List<Position>> lineMap = new HashMap<String, List<Position>>();

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
      for (int i = low; i < high; i++) {
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
      for (int i = low; i < high; i++) {
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
    for (String[] s1 : res) {
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
    // TODO Auto-generated method stub

  }

  @Override
  public Map<String, List<Position>> getLines() {
    // TODO Auto-generated method stub
    return null;
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
