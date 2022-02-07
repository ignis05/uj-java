import java.lang.reflect.Field;

public class FieldExample {
  public static String s;
  public int i;

  public static void main(String[] args) throws Exception {
    FieldExample fex = FieldExample.class.newInstance();//new FieldExample()
    Field f;
    f = FieldExample.class.getField("s");

    // modyfikacja pola static
    f.get(null); // zwróci null bo s nie zainicjowane
    f.set(null, "Ala");
    // FieldExamle.s = “Ala”
    System.out.println(FieldExample.s);
    System.out.println(f.get(null));

    // modyfikacja normalnego pola
    f = fex.getClass().getField("i");
    f.set(fex, 10);
    // fex.i = 10
    System.out.println(fex.i);
    System.out.println(f.get(fex));
  }
}