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

        stock.get(key).notifyAll();
      }
    }
  }

  @Override
  public boolean purchase(String productName, int quantity) {
    boolean firstTry = true;
    synchronized (this.stock) {
      while (true) {
        // if stock contains key
        if (this.stock.containsKey(productName)) {
          var value = this.stock.get(productName);
          // if there is enough stock
          if (value <= quantity) {
            value -= quantity;
            return true;
          }
          // if failed to buy in the first try, wait and try agaim
          if (firstTry) {
            firstTry = false;
            try {
              value.wait();
            } catch (InterruptedException e) {
            }
            continue;
          }
          return false;
        } else // if stock doesnt contain key - ???
          return false;
      }
    }
  }

  @Override
  public Map<String, Integer> stock() {
    return this.stock;
  }

}
