
class ParallelSearcher implements ParallelSearcherInterface {

  class BoxOpener extends Thread {
    @Override
    public void run() {
      HidingPlaceSupplier.HidingPlace box;
      while ((box = supplier.get()) != null) {
        System.out.println(Thread.currentThread().getName() + " retrieved box");
        if (box.isPresent()) {
          double value;
          synchronized (supplier) {
            System.out.println(Thread.currentThread().getName() + "'s box is full, opening (total=" + totalValue + ")");
            value = box.openAndGetValue();
            System.out.println(Thread.currentThread().getName() + "'s box's value is: " + value);
          }
          synchronized (totalValue) {
            totalValue += value;
            System.out.println(Thread.currentThread().getName() + "'s box's value (" + value + ") added to total: " + totalValue);
          }
        } else
          System.out.println(Thread.currentThread().getName() + "'s box is empty");
      }
    }
  }

  HidingPlaceSupplier supplier;
  Double totalValue = 0.;

  @Override
  public void set(HidingPlaceSupplierSupplier HPSSupplier) {
    while ((supplier = HPSSupplier.get(totalValue)) != null) {
      System.out.println("Getting new HPS");
      // reset value
      totalValue = 0.;
      // launch searching threads
      BoxOpener[] openers = new BoxOpener[supplier.threads()];
      for (int i = 0; i < supplier.threads(); i++) {
        var opener = new BoxOpener();
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
