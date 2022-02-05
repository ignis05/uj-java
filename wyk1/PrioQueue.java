import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class PrioQueue<T> {
  HashMap<Integer, List<T>> map = new HashMap<>();

  void add(T t, int prio) {
    if (map.get(prio) == null) {
      map.put(prio, new LinkedList<T>());
    }

    List<T> list = map.get(prio);
    list.add(t);
  }

  T get() {
    int maxPrio = map.keySet().stream().max(Integer::compareTo).orElseThrow();
    List<T> list = map.get(maxPrio);
    T el = list.remove(0);
    if (list.size() == 0)
      map.remove(maxPrio);

    return el;
  }

  public static void main(String[] args) {
    var pq = new PrioQueue<String>();
    pq.add("dupa1", 1);
    pq.add("dupa2", 5);
    pq.add("dupa3", 1);

    System.out.println(pq.get());
    System.out.println(pq.get());
    System.out.println(pq.get());
  }
}