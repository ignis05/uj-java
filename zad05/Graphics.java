import java.util.LinkedList;

class Graphics implements GraphicsInterface {

  /** Position Constructor for returning new Positions */
  private static class Position2 implements Position {
    int row;
    int col;

    public Position2(int row, int col) {
      this.row = row;
      this.col = col;
    }

    @Override
    public int getRow() {
      return row;
    }

    @Override
    public int getCol() {
      return col;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Position2 other = (Position2) obj;
      return col == other.col && row == other.row;
    }
  }

  private static enum Directions {
    UP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);

    int vertical;
    int horizontal;

    Directions(int vertical, int horizontal) {
      this.vertical = vertical;
      this.horizontal = horizontal;
    }

    /**
     * Gets next position going in specified direction
     * 
     * @param pos Current position
     * @return Next Position
     */
    public Position getNextPosition(Position pos) {
      return new Position2(pos.getRow() + vertical, pos.getCol() + horizontal);
    }

    public String toString() {
      return name();
    }
  }

  private CanvasInterface canvas = null;

  @Override
  public void setCanvas(CanvasInterface canvas) {
    this.canvas = canvas;
  }

  @Override
  public void fillWithColor(Position startingPosition, Color color)
      throws GraphicsInterface.WrongStartingPosition, GraphicsInterface.NoCanvasException {

    if (this.canvas == null) {
      throw new GraphicsInterface.NoCanvasException();
    }

    boolean isFistPoint = true;

    var paintedPoints = new LinkedList<Position>();
    var pointQueue = new LinkedList<Position>();
    pointQueue.add(startingPosition);

    while (pointQueue.size() > 0) {
      var point = pointQueue.remove();

      paintedPoints.add(point); // dont paint this point again

      try {
        this.canvas.setColor(point, color);
      }
      // border end
      catch (CanvasInterface.CanvasBorderException ex) {
        if (isFistPoint)
          throw new GraphicsInterface.WrongStartingPosition();
        continue;
      }
      // painted over other color
      catch (CanvasInterface.BorderColorException ex) {
        try {
          this.canvas.setColor(point, ex.previousColor);
        } catch (Exception ex2) {
          // will throw BorderColorException again but that doesnt matter
        }
        continue;
      }
      if (isFistPoint)
        isFistPoint = false;

      // move in 4 directions
      for (var dir : Directions.values()) {
        var nextPoint = dir.getNextPosition(point);
        // but only if point hasn't been visited and isn't in a queue
        if (!paintedPoints.contains((Position2) nextPoint) && !pointQueue.contains((Position2) nextPoint)) {
          pointQueue.add(nextPoint);
        }
      }
    }
  }
}
