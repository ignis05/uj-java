import java.util.HashMap;
import java.util.Map;

class Shop implements ShopInterface {
  private volatile Map<String, Integer> stock = new HashMap<String, Integer>();
  private volatile Map<String, Object> latches = new HashMap<String, Object>();

  private void unlockThreads(String key) {
    synchronized (latches) {
      if (latches.containsKey(key)) {
        var latch = latches.get(key);
        synchronized (latch) {
          latch.notifyAll();
        }
      }
    }
  }

  private Object getLatch(String key) {
    synchronized (latches) {
      if (latches.containsKey(key)) {
        return latches.get(key);
      }

      Object o = new Object();
      latches.put(key, o);
      return o;
    }
  }

  @Override
  public void delivery(Map<String, Integer> goods) {

    for (var item : goods.entrySet()) {
      String key = item.getKey();
      Integer value = item.getValue();

      // update stock
      synchronized (this.stock) {
        synchronized (getLatch(key)) {
          if (this.stock.containsKey(item.getKey()))
            this.stock.put(key, this.stock.get(key) + value);
          else
            this.stock.put(key, value);
        }
      }
      System.out.println("Added " + value + " " + key + " to stock");

      // unlock threads
      unlockThreads(key);

    }
  }

  @Override
  public boolean purchase(String key, int quantity) {
    System.out.println(Thread.currentThread().getName() + " is attempting to purchase " + quantity + " " + key);
    boolean firstTry = true;
    var latch = getLatch(key);
    synchronized (latch) {
      while (true) {
        // key exists
        if (this.stock.containsKey(key)) {
          var val = this.stock.get(key);
          // can buy
          if (val >= quantity) {
            this.stock.put(key, val - quantity);
            return true;
          }
        }

        // not first try
        if (!firstTry)
          return false;

        firstTry = false;

        try {
          latch.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  @Override
  public Map<String, Integer> stock() {
    return this.stock;
  }

}
