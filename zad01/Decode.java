/**
 * Decoder class for zad01
 */
class Decode extends DecoderInterface {
  /** Counts length of sequence of 1's */
  private int oneC;
  /** Defines size of X sequence */
  private int xSize;
  /** Holds partial result string */
  private String out;

  /** Calls reset() method on Object initialization */
  public Decode() {
    reset();
  }

  /**
   * Reads a single bit and processes it.
   * 
   * @param bit Integer holding a single bit
   */
  @Override
  public void input(int bit) {
    // sequence before X size is decoded
    if (xSize == 0) {
      // 0 that ends the X sequence
      if (bit == 0 && oneC > 0) {
        xSize = oneC;
        oneC = 0;
        out += "0";
      }
      // 1 - increase X size
      else if (bit == 1) {
        oneC += 1;
      }
      // leading 0 sequence - do nothing
      else {
      }
    }

    // after X size is determined
    else {
      // sequence termination
      if (bit == 0 && oneC > 0) {
        int xCount = oneC / xSize;
        out += String.valueOf(xCount - 1);
        oneC = 0;
      }
      // another 1 in sequence
      else if (bit == 1) {
        oneC += 1;
      }
    }

  }

  /**
   * Returns decoded String
   * 
   * @return String with decoded sequence
   */
  @Override
  public String output() {
    return out;
  }

  /**
   * Sets all properties to their initial values
   */
  @Override
  public void reset() {
    oneC = 0;
    xSize = 0;
    out = "";
  }

}