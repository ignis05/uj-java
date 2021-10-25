import java.util.HashMap;
import java.util.Map;

public class Test03 {

  public static String decryptText(Map<Character, Character> decode, String text) {
    StringBuilder result = new StringBuilder();

    for (Character ch : text.toCharArray()) {
      Character decodedChar = decode.get(ch);
      if (decodedChar != null)
        result.append(decodedChar);
      else
        result.append(ch);
    }

    return result.toString();
  }

  public static Map<Character, Character> flipMap(Map<Character, Character> original) {
    Map<Character, Character> flipped = new HashMap<>();
    for (Map.Entry<Character, Character> entry : original.entrySet()) {
      flipped.put(entry.getValue(), entry.getKey());
    }
    return flipped;
  }

  public static void main(String[] args) throws Exception {
    String res;
    Decrypter dec = new Decrypter();

    // ==== 1-1 test ====
    dec.setInputText(
        "Wydział   Fizyki, 	Astronomii \n    i\n    Informatyki 			Stosowanej\nogłasza, że i tak wszystkich na numerkach wypierdoli \nxD");
    res = dec.getCode().toString();
    if (!res.equals(
        "{a=a, A=A, ł=ł, d=d, e=e, F=F, f=f, i=i, I=I, j=j, k=k, ,=,, m=m, n=n, o=o, r=r, s=s, S=S, t=t, W=W, w=w, y=y, z=z}"))
      throw new Exception("test 1 failed, result: " + res);

    // ==== exact input test ====
    dec.setInputText("Wydział Fizyki, Astronomii i Informatyki Stosowanej");
    if (!res.equals(
        "{a=a, A=A, ł=ł, d=d, e=e, F=F, f=f, i=i, I=I, j=j, k=k, ,=,, m=m, n=n, o=o, r=r, s=s, S=S, t=t, W=W, w=w, y=y, z=z}"))
      throw new Exception("exact input test failed: " + res);

    // ==== pattern in the middle test ====
    dec.setInputText(
        "dupa Wydział Przyrodniczy xDD aaa Wydział Fizyki, Astronomii i Informatyki Stosowanej oadjsod aj alsd jals jasdl jasl djas l lsajd ;lajslaskdjalds ");
    if (!res.equals(
        "{a=a, A=A, ł=ł, d=d, e=e, F=F, f=f, i=i, I=I, j=j, k=k, ,=,, m=m, n=n, o=o, r=r, s=s, S=S, t=t, W=W, w=w, y=y, z=z}"))
      throw new Exception("pattern in the middle test failed: " + res);

    // ==== pattern in the end ====
    dec.setInputText(
        "dupa Wydział Przyrodniczy xDD aaa  oadjsod aj alsd jals jasdl jasl djas l lsajd ;lajslaskdjalds. I tak was wszystkich upierdolimy, podpisano Wydział Fizyki, Astronomii i Informatyki Stosowanej");
    if (!res.equals(
        "{a=a, A=A, ł=ł, d=d, e=e, F=F, f=f, i=i, I=I, j=j, k=k, ,=,, m=m, n=n, o=o, r=r, s=s, S=S, t=t, W=W, w=w, y=y, z=z}"))
      throw new Exception("pattern in the end failed: " + res);

    // ==== caesar's cipher ROT10 map generation ====
    String rot10 = "Ginjskł Psjius, Kcdbyxywss s Sxpybwkdius Cdycygkxot yqłkcjk, żo s dku gcjicdusmr xk xewobukmr gizsobnyvs hN";
    dec.setInputText(rot10);
    res = dec.getCode().toString();
    if (!dec.getCode().toString().equals(
        "{a=k, A=K, ł=ł, d=n, e=o, F=P, f=p, i=s, I=S, j=t, k=u, ,=,, m=w, n=x, o=y, r=b, s=c, S=C, t=d, W=G, w=g, y=i, z=j}"))
      throw new Exception("caesar's cipher map generation failed, result: " + res);

    // ==== caesar's cipher ROT10 decryption test ====
    String decodedStr = decryptText(dec.getDecode(), rot10);
    if (!decodedStr.equals(
        "Wydział Fizyki, Astronomii i Informatyki Stosowanej oqłasza, że i tak wszystkimr na nemerkamr wyzierdovi hN"))
      throw new Exception("caesar's cipher decryption failed, result: " + decodedStr);

    // ==== caesar's cipher ROT10 key flip test ====
    // checks if `code` is equal to `decode` with flipped keys and values
    Map<Character, Character> code = dec.getCode();
    if (!flipMap(code).equals(dec.getDecode()))
      throw new Exception("flipped map test failed");

    // ==== null input test ====
    dec.setInputText(null);
    if (dec.getCode().size() != 0 || dec.getDecode().size() != 0)
      throw new Exception("null input test failed");

    // ==== empty input test ====
    dec.setInputText("");
    if (dec.getCode().size() != 0 || dec.getDecode().size() != 0)
      throw new Exception("empty input test failed");

    // ==== invalid input test ====
    dec.setInputText("Dupa");
    if (dec.getCode().size() != 0 || dec.getDecode().size() != 0)
      throw new Exception("invalid input test failed");

    System.out.println("All tests passed successfully");
  }
}
