import java.io.*;
import java.net.*;

class XD implements Runnable {
  ServerSocket ss;

  XD(ServerSocket ss) {
    this.ss = ss;
  }

  public void run() {
    // akceptujemy polaczenie, dostajemy gniazdo do komunikacji
    // z klientem
    try {
      Socket s = ss.accept();
      System.out.println("accepted connection in " + Thread.currentThread().getName());
      // strumienie
      InputStream is = s.getInputStream();
      OutputStream os = s.getOutputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));

      String sLine;
      while ((sLine = br.readLine()) != null) {
        System.out.print(Thread.currentThread().getName() + " : " + sLine + "\n");
        os.write(sLine.getBytes());
      }
      s.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}

public class ServerExample {
  // gniazdo oczekujace na polaczenia
  private static ServerSocket ss;

  public static void main(String[] args) throws IOException, InterruptedException {

    // tworzymy gniazdo, ktore oczekuje na przychodzace polaczenia
    // na porcie przekazanym jako argument wywolania programu
    ss = new ServerSocket(2137);

    Thread th1 = new Thread(new XD(ss));
    Thread th2 = new Thread(new XD(ss));

    th1.start();
    th2.start();

    th1.join();
    th2.join();
  }
}