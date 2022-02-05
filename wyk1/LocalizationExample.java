import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LocalizationExample {
  public static void main(String[] args) throws IOException {
    DataOutputStream dos = new DataOutputStream(System.out);
    dos.writeDouble(123.12);
    dos.writeUTF("Grzegrz\u00f3\u0142ka");
    dos.writeInt(12345);
    dos.close();
    // ObjectOutputStream oos = new ObjectOutputStream(System.out);
    // oos.writeObject("Grzegrz\u00f3\u0142ka");
    // oos.close();
  }
}
