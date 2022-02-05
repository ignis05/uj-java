import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;

public class XMLEncoderExample {
  public static void main(String[] args) throws FileNotFoundException {
    XMLEncoder e = new XMLEncoder(new FileOutputStream("jbutton.xml"));
    e.writeObject(new JButton("Hello world"));
    e.close();
  }
}