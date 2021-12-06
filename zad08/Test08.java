import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test08 {

  static class Client extends Thread {
    Shop shop;
    String productName;
    int quantity;
    public Boolean expResult = null;

    public Client(Shop shop, String productName, int quantity) {
      this.shop = shop;
      this.productName = productName;
      this.quantity = quantity;
    }

    @Override
    public void run() {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
      }
      var result = shop.purchase(productName, quantity);
      System.out.println(Thread.currentThread().getName() + (result ? " purchased " : " failed to purchase ") + quantity + " " + productName);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    var threadList = new LinkedList<Client>();

    var shop = new Shop();

    // create store
    Map<String, Integer> goods = new HashMap<String, Integer>();
    goods.put("product1", 8);
    goods.put("product2", 12);
    goods.put("product3", 21);
    goods.put("product4", 4);
    shop.delivery(goods);

    // create and start threads
    threadList.add(new Client(shop, "product1", 5));
    threadList.add(new Client(shop, "product1", 5));
    threadList.add(new Client(shop, "product1", 5));
    threadList.add(new Client(shop, "product2", 4));
    threadList.add(new Client(shop, "product2", 4));
    threadList.add(new Client(shop, "product2", 4));
    for (var th : threadList)
      th.start();

    // product 1 delivery after one second
    Thread.sleep(1000);
    System.out.println("\n=== 1000 sleep ===\n");
    goods = new HashMap<String, Integer>();
    goods.put("product1", 4);
    shop.delivery(goods);

    // wait for threads
    for (var th : threadList)
      th.join();

    // results
    System.out.println("\n=== results ===");
    if (!shop.stock().toString().equals("{product2=0, product1=2, product4=4, product3=21}"))
      System.out.println("Invalid result stock");
    else
      System.out.println("Test complete - stock equals expected stock");
  }
}
