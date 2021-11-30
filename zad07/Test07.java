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
    private List<Double> values;
    private Integer i = 0;

    public HPS(List<Double> values) {
      this.threads = (int) ((double) (values.remove(0)));
      this.values = values;
    }

    class HP implements HidingPlace {
      private double value;
      private volatile boolean isOpened = false;

      public HP(double value) {
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
    List<List<Double>> hpsValues;
    double expValue = 0;
    volatile int counter = 0;

    HPSS(List<List<Double>> hpsValues) {
      this.hpsValues = hpsValues;
    }

    public boolean isEmpty() {
      return this.hpsValues.size() == 0;
    }

    @Override
    public HidingPlaceSupplier get(double totalValueOfPreviousObject) {
      if (totalValueOfPreviousObject == expValue) {
        System.out.println("Requested new valid HPS (" + counter++ + ") by requesting value " + expValue);
        if (hpsValues.size() == 0)
          return null;
        var hpValues = hpsValues.remove(0);
        expValue = hpValues.stream().mapToDouble(Double::doubleValue).sum() - hpValues.get(0); // subtract thread count
        return new HPS(hpValues);
      } else
        throw new RuntimeException("Invalid totalValueOfPreviousObject:\nExpected: " + expValue + ", Received: " + totalValueOfPreviousObject);
    }

  }

  final static int testSize = 10;

  public static void main(String[] args) {
    List<List<Double>> hpsValues = new ArrayList<List<Double>>(testSize);
    for (int i = 0; i < testSize; i++) {
      int boxCount = 8 + random.nextInt(13);
      List<Double> innerValues = new ArrayList<Double>(boxCount + 1);
      innerValues.add((double) (3 + random.nextInt(5)));
      for (int j = 0; j < boxCount; j++) {
        // weighted for more zeros
        if (random.nextInt(10) < 3)
          innerValues.add(0.);
        else
          innerValues.add((double) (1 + random.nextInt(30)));
      }
      hpsValues.add(innerValues);
    }
    var hpss = new HPSS(hpsValues);
    var searcher = new ParallelSearcher();
    searcher.set(hpss);
    if (hpss.isEmpty())
      System.out.println("Succesfully emptied HPSS");
    else
      System.out.println("Failed to empty HPSS");
  }
}
