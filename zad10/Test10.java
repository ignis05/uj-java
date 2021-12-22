import java.util.List;

public class Test10 {
  public static void main(String[] args) {
    List<Pieniadz> xd = List.of(new Pieniadz(Nominal.Zł10, Rozmienialnosc.TAK), new Pieniadz(Nominal.Zł20, Rozmienialnosc.TAK), new Pieniadz(Nominal.Zł5, Rozmienialnosc.TAK),
        new Pieniadz(Nominal.Zł10, Rozmienialnosc.NIE), new Pieniadz(Nominal.Zł20, Rozmienialnosc.NIE), new Pieniadz(Nominal.Zł5, Rozmienialnosc.NIE));

    for (var p : xd) {
      System.out.println(p.numerSeryjny());
    }
    var k = new Kasjer();
    k.rozlicz(70, xd);
  }
}
