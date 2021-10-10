class Decode extends DecoderInterface {
  private int oneC;
  private int xSize;
  private String out;

  public Decode() {
    reset();
  }

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

  @Override
  public String output() {
    return out;
  }

  @Override
  public void reset() {
    oneC = 0;
    xSize = 0;
    out = "";
  }

}