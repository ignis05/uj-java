import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner odczyt = new Scanner(new File("output.txt"));
    while (odczyt.hasNext()) {
      System.out.println(odczyt.nextLine());
    }
  }

}
