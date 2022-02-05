import java.io.*;
import java.net.Socket;

public class ClientExample {
  public static Socket sock;

  public static void main(String[] args) throws IOException {
    // tworzymy gniazdo I nawiazujemy polaczenie z komputerem
    // identyfikowanym przez adres args[0] na porcie args[1]
    sock = new Socket("localhost", 2137);
    // pobieramy strumienie zwiazane z gniazdem
    OutputStream os = sock.getOutputStream();
    // InputStream is = sock.getInputStream();
    // tworzymy Reader na standardowym wejsciu (klawiaturze)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Thread t = new Thread(() -> {
      byte[] bRes = new byte[100];
      InputStream is;
      int l;
      try {
        is = sock.getInputStream();
        while (true) {
          l = is.read(bRes);
          System.out.println("odebralem: " + new String(bRes, 0, l));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    t.start();

    // zmienne pomocnicze
    String sLine;
    // glowna petla programu, pobieramy dane z klawiatury
    while ((sLine = br.readLine()) != null) {
      // wysylamy je przez gniazdo
      os.write((sLine + "\n").getBytes());
      System.out.println("wyslalem: " + sLine);
    }
    // zamykamy strumien i gniazdo
    br.close();
    sock.close();
  }
} // koniec programu