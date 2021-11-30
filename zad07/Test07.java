public class Test07 {
  public static class HPS implements HidingPlaceSupplier {
    private int threads;
    private int[] values;
    private Integer i = 0;

    public HPS(int threads, int... values) {
      this.threads = threads;
      this.values = values;
    }

    class HP implements HidingPlace {
      private int value;

      public HP(int value) {
        this.value = value;
      }

      @Override
      public boolean isPresent() {
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          System.err.println(e);
        }
        return this.value != 0;
      }

      @Override
      public double openAndGetValue() {
        try {
          Thread.sleep(200);
        } catch (Exception e) {
          System.err.println(e);
        }
        return this.value;
      }

    }

    @Override
    public HidingPlaceSupplier.HidingPlace get() {
      synchronized (i) {
        if (i < this.values.length)
          return new HP(this.values[i++]);
        else
          return null;
      }
    }

    @Override
    public int threads() {
      return threads;
    }

  }

  // todo: constuctor that takes all HPS values
  public static class HPSS implements HidingPlaceSupplierSupplier {

    @Override
    public HidingPlaceSupplier get(double totalValueOfPreviousObject) {
      if (totalValueOfPreviousObject == 0) {
        return new HPS(3, 5, 0, 4, 0, 1, 0, 0);
      } else if (totalValueOfPreviousObject == 10) {
        return new HPS(4, 0, 2, 0, 0, 0, 0, 0, 1, 3, 7);
      } else if (totalValueOfPreviousObject == 13) {
        System.out.println("Succesfully reached HPSS end");
        return null;
      } else
        throw new RuntimeException("invalid totalValueOfPreviousObject requested");
    }

  }

  public static void main(String[] args) {
    var hpss = new HPSS();
    var searcher = new ParallelSearcher();
    searcher.set(hpss);
  }
}
