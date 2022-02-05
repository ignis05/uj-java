import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationTest implements Serializable {
  public int id;
  public String name;

  public SerialisationTest(int i, String s) {
    this.id = i;
    this.name = s;
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

    SerialisationTest st1 = new SerialisationTest(7, "Ala");

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output_object"));
    oos.writeObject(st1);
    oos.close();
    SerialisationTest st2;
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output_object"));
    st2 = (SerialisationTest) ois.readObject();
    ois.close();
    System.out.println(st2.id + "\t" + st2.name);
  }
}
