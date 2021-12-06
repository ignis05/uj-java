import java.util.HashMap;
import java.util.Map;

class Shop implements ShopInterface {
  private Map<String, Integer> stock = new HashMap<String, Integer>();

  @Override
  public void delivery(Map<String, Integer> goods) {
    synchronized (this.stock) {
      for (var item : goods.entrySet()) {
        String key = item.getKey();
        Integer value = item.getValue();
        if (this.stock.containsKey(item.getKey()))
          this.stock.put(key, this.stock.get(key) + value);
        else
          this.stock.put(key, value);

        System.out.println("Added " + value + " " + key + " to stock");
        synchronized (key) {
          key.notifyAll();
        }
      }
    }
  }

  @Override
  public boolean purchase(String productName, int quantity) {
    System.out.println(Thread.currentThread().getName() + " is attempting to purchase " + quantity + " " + productName);
    boolean firstTry = true;
    synchronized (productName) {
      while (true) {
        // if there is enough stock
        if (quantity <= this.stock.get(productName)) {
          this.stock.put(productName, this.stock.get(productName) - quantity);
          return true;
        }
        // if failed to buy in the first try, wait and try agaim
        if (firstTry) {
          System.out.println(Thread.currentThread().getName() + " failed 1st attempt to purchase " + quantity + " " + productName + "- waiting for delivery");
          firstTry = false;
          try {
            productName.wait();
          } catch (InterruptedException e) {
          }
          System.out.println(Thread.currentThread().getName() + " notified about delivery of " + productName);
          continue;
        }
        return false;
      }
    }
  }

  @Override
  public Map<String, Integer> stock() {
    return this.stock;
  }

}
