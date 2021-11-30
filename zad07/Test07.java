import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

public class Test07 {
  static Random random = new Random();

  public static class HPS implements HidingPlaceSupplier {
    private AtomicBoolean isOpening = new AtomicBoolean(false); // if a place is being opened atm
    private AtomicInteger detectedThreads = new AtomicInteger(0);
    private AtomicInteger maxDetThreads = new AtomicInteger(0);
    private int threads;
    private List<Integer> values;
    private Integer i = 0;

    public HPS(List<Integer> values) {
      this.threads = values.remove(0);
      this.values = values;
    }

    class HP implements HidingPlace {
      private int value;
      private boolean isOpened = false;

      public HP(int value) {
        this.value = value;
      }

      @Override
      public boolean isPresent() {
        // check thread limit
        if (detectedThreads.incrementAndGet() > threads)
          throw new RuntimeException("Detected more threads than maximum allowed");
        // save max thread count
        if (detectedThreads.get() > maxDetThreads.get())
          maxDetThreads.set(detectedThreads.get());
        try {
          Thread.sleep(100 + random.nextInt(1000));
        } catch (Exception e) {
          System.err.println(e);
        }
        detectedThreads.decrementAndGet();
        return this.value != 0;
      }

      @Override
      public double openAndGetValue() {
        if (!isOpening.compareAndSet(false, true))
          throw new RuntimeException("Attempted to open multiple boxes at the same time");
        if (this.isOpened)
          throw new RuntimeException("Attempted to open the same box more than once");
        try {
          Thread.sleep(100 + random.nextInt(200));
        } catch (Exception e) {
          System.err.println(e);
        }
        isOpening.set(false);
        this.isOpened = true;
        return this.value;
      }

    }

    @Override
    public HidingPlaceSupplier.HidingPlace get() {
      synchronized (i) {
        if (i < this.values.size())
          return new HP(this.values.get(i++));
        else {
          if (maxDetThreads.get() < this.threads)
            throw new RuntimeException("Less concurent threads detected than the expected thread count");
          return null;
        }
      }
    }

    @Override
    public int threads() {
      return threads;
    }

  }

  public static class HPSS implements HidingPlaceSupplierSupplier {
    List<List<Integer>> hpsValues;
    double expValue = 0;

    HPSS(List<List<Integer>> hpsValues) {
      this.hpsValues = hpsValues;
    }

    public boolean isEmpty() {
      return this.hpsValues.size() == 0;
    }

    @Override
    public HidingPlaceSupplier get(double totalValueOfPreviousObject) {
      if (totalValueOfPreviousObject == expValue) {
        if (hpsValues.size() == 0)
          return null;
        var hpValues = hpsValues.remove(0);
        expValue = hpValues.stream().mapToInt(Integer::intValue).sum() - hpValues.get(0); // subtract thread count
        return new HPS(hpValues);
      } else
        throw new RuntimeException("Invalid totalValueOfPreviousObject:\nExpected: " + expValue + ", Received: " + totalValueOfPreviousObject);
    }

  }

  public static void main(String[] args) {
    List<List<Integer>> hpsValues = new ArrayList<List<Integer>>(2);
    hpsValues.add(new ArrayList<Integer>(List.of(3, 5, 0, 4, 0, 1, 0, 0)));
    hpsValues.add(new ArrayList<Integer>(List.of(4, 0, 2, 0, 0, 0, 0, 0, 1, 3, 7)));
    var hpss = new HPSS(hpsValues);
    var searcher = new ParallelSearcher();
    searcher.set(hpss);
    System.out.println(hpss.isEmpty());
  }
}
