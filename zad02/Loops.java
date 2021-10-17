import java.util.List;
import java.util.ArrayList;

/**
 * Loops class for zad02
 * 
 * @author Grzegorz Mikołajczyk
 */
class Loops implements GeneralLoops {

  private List<Integer> lowerLimits;
  private List<Integer> upperLimits;

  @Override
  public void setLowerLimits(List<Integer> limits) {
    this.lowerLimits = limits;
  }

  @Override
  public void setUpperLimits(List<Integer> limits) {
    this.upperLimits = limits;
  }

  /**
   * Calculates how many times in a row a certain value should appear on certain
   * depth. Can be used with depth -1 to calculate 1D table size
   * 
   * @param depth Depth of loop for the calculation
   * @return How many times in a row a certain value should appear on certain
   *         depth
   */
  private int getDepthFrequency(int depth) {
    int frequency = 1;
    for (int i = depth + 1; i < lowerLimits.size(); i++) {
      frequency *= (upperLimits.get(i) - lowerLimits.get(i)) + 1;
    }
    return frequency;
  }

  /**
   * Calculates list of all values that can appear on a certain depth
   * 
   * @param depth integer setting loop depth for the calculation
   * @return Return list with all values that can appear on a certain depth
   */
  private List<Integer> getDepthValues(int depth) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = lowerLimits.get(depth); i <= upperLimits.get(depth); i++) {
      result.add(i);
    }
    return result;
  }

  @Override
  public List<List<Integer>> getResult() {

    // create 2d table
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < this.getDepthFrequency(-1); i++) {
      result.add(new ArrayList<Integer>());
    }

    // fill 2d table
    for (int depth = 0; depth < lowerLimits.size(); depth++) {
      // values appearing on certain depth
      List<Integer> depthValues = this.getDepthValues(depth);
      // how many times each value appears in the row
      int depthFrequency = this.getDepthFrequency(depth);
      // number of depth values * frequency - used to calculate how many times the
      // cycle needs to be repeated on certian depth
      int serieSize = depthValues.size() * depthFrequency;
      for (int repeats = 0; repeats < this.getDepthFrequency(-1) / serieSize; repeats++) {
        for (int i = 0; i < depthValues.size(); i++) {
          int value = depthValues.get(i);
          for (int j = 0; j < depthFrequency; j++) {
            // which list in 1D table to append to
            int insertionIndex = (repeats * serieSize) + (i * depthFrequency) + j;
            List<Integer> deepList = result.get(insertionIndex);
            deepList.add(value);
          }
        }
      }
    }

    return result;
  }

}
