import java.lang.reflect.Method;

public class ClassLoad {
  public static void main(String[] args) throws Exception {
    Class klasa = Class.forName("Test"); // ładuje klasę "Test"
    Method metodaMain = klasa.getMethod("main", String[].class); // wyciągam metode o nazwie "main" i argumencie typu String[]
    metodaMain.invoke(null, new Object[1]); // uruchomienie metody na obiekcie null (metoda statyczna), z pustą talicą obiektów jako argument
  }
}
