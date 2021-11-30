
class ParallelSearcher implements ParallelSearcherInterface {

  class BoxOpener extends Thread {
    private boolean printLogs = false;

    public BoxOpener(boolean printLogs) {
      this.printLogs = printLogs;
    }

    @Override
    public void run() {
      HidingPlaceSupplier.HidingPlace box;
      while ((box = supplier.get()) != null) {
        if (printLogs)
          System.out.println(Thread.currentThread().getName() + " retrieved box");
        if (box.isPresent()) {
          double value;
          synchronized (supplier) {
            if (printLogs)
              System.out.println(Thread.currentThread().getName() + "'s box is full, opening (total=" + totalValue + ")");
            value = box.openAndGetValue();
            if (printLogs)
              System.out.println(Thread.currentThread().getName() + "'s box's value is: " + value);
          }
          synchronized (totalValue) {
            totalValue += value;
            if (printLogs)
              System.out.println(Thread.currentThread().getName() + "'s box's value (" + value + ") added to total: " + totalValue);
          }
        } else if (printLogs)
          System.out.println(Thread.currentThread().getName() + "'s box is empty");
      }
    }
  }

  HidingPlaceSupplier supplier;
  Double totalValue = 0.;
  boolean printLogs = false;

  @Override
  public void set(HidingPlaceSupplierSupplier HPSSupplier) {
    int counter = 0;
    while ((supplier = HPSSupplier.get(totalValue)) != null) {
      System.out.println("=== Retrieved new HPS (" + counter++ + ") ===");
      // reset value
      totalValue = 0.;
      // launch searching threads
      BoxOpener[] openers = new BoxOpener[supplier.threads()];
      for (int i = 0; i < supplier.threads(); i++) {
        var opener = new BoxOpener(printLogs);
        opener.setName("Opener " + i);
        opener.start();
        openers[i] = opener;
      }
      // wait for threads to finish
      for (var thread : openers) {
        try {
          thread.join();
        } catch (Exception e) {
          System.err.println(e);
        }
      }
    }
  }

}
