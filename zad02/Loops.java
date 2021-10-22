import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * Loops class for zad02
 */
class Loops implements GeneralLoops {

  private List<Integer> lowerLimits;
  private List<Integer> upperLimits;

  Loops() {
    lowerLimits = new LinkedList<Integer>();
    upperLimits = new LinkedList<Integer>();
  }

  @Override
  public void setLowerLimits(List<Integer> limits) {
    this.lowerLimits = new ArrayList<>(limits);
  }

  @Override
  public void setUpperLimits(List<Integer> limits) {
    this.upperLimits = new ArrayList<>(limits);
  }

  /**
   * Calculates how many times in a row a certain value should appear on certain
   * depth. Can be used with depth -1 to calculate 1D table size
   * 
   * @param depth Depth of loop for the calculation
   * @return How many times in a row a certain value should appear on certain
   *         depth
   */
  private long getDepthFrequency(int depth) {
    if (depth == -1) {
      long frequency = 1;
      for (int i = 0; i < lowerLimits.size(); i++) {
        frequency *= (upperLimits.get(i) - lowerLimits.get(i)) + 1;
        if (frequency <= 0) {
          System.err.println("partfreq invalid: " + frequency);
          System.exit(1);
        }
      }
      return frequency;
    } else {
      return getDepthFrequency(depth - 1) / this.getDepthValues(depth).size();
    }
  }

  /**
   * Calculates list of all values that can appear on a certain depth
   * 
   * @param depth integer setting loop depth for the calculation
   * @return Return list with all values that can appear on a certain depth
   */
  private List<Integer> getDepthValues(int depth) {
    List<Integer> result = new LinkedList<Integer>();
    for (int i = lowerLimits.get(depth); i <= upperLimits.get(depth); i++) {
      result.add(i);
    }
    return result;
  }

  @Override
  public List<List<Integer>> getResult() {
    // make limits list same size - used when only one of the lists is set
    while (lowerLimits.size() < upperLimits.size()) {
      lowerLimits.add(0);
    }
    while (upperLimits.size() < lowerLimits.size()) {
      upperLimits.add(0);
    }

    // return empty list when both sizes are 0
    if (lowerLimits.size() == 0 && upperLimits.size() == 0)
      return Arrays.asList(Arrays.asList(0));

    long axisSize = this.getDepthFrequency(-1);

    List<List<Integer>> result = new ArrayList<List<Integer>>((int) axisSize);
    // create 2d table
    for (int i = 0; i < axisSize; i++) {
      result.add(new ArrayList<Integer>(0));
    }

    // fill 2d table
    for (int depth = 0; depth < lowerLimits.size(); depth++) {
      // values appearing on certain depth
      List<Integer> depthValues = this.getDepthValues(depth);
      // how many times each value appears in the row
      long depthFrequency = this.getDepthFrequency(depth);
      // number of depth values * frequency - used to calculate how many times the
      // cycle needs to be repeated on certian depth
      long serieSize = depthValues.size() * depthFrequency;
      for (int repeats = 0; repeats < axisSize / serieSize; repeats++) {
        for (int i = 0; i < depthValues.size(); i++) {
          int value = depthValues.get(i);
          for (int j = 0; j < depthFrequency; j++) {
            // which list in 1D table to append to
            int insertionIndex = (int) ((repeats * serieSize) + (i * depthFrequency) + j);
            List<Integer> deepList = result.get(insertionIndex);
            deepList.add(value);
          }
        }
      }
    }

    return result;
  }

}
