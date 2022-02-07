import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;

public class Test {
  static int xd = 0;

  public static void main(String[] args) throws InterruptedException, FileNotFoundException {
    XMLEncoder e = new XMLEncoder(new FileOutputStream("jbutton.xml"));
    e.writeObject(new JButton("Hello world"));
    e.close();
  }
}
