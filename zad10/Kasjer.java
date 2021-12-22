import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Kasjer implements KasjerInterface {
  private List<Pieniadz> rozmKasa = new ArrayList<Pieniadz>();
  private List<Pieniadz> nRozmKasa = new ArrayList<Pieniadz>();
  private RozmieniaczInterface rozmieniacz;

  /**
   * Puts coins in register and sorts them
   * 
   * @param rozm
   * @param nRozm
   */
  private void putCoinsInRegister(List<Pieniadz> rozm, List<Pieniadz> nRozm) {
    if (rozm != null) {
      rozmKasa.addAll(rozm);
      Collections.sort(rozmKasa, (p1, p2) -> p1.wartosc() - p2.wartosc());
    }
    if (nRozm != null) {
      nRozmKasa.addAll(nRozm);
      Collections.sort(nRozmKasa, (p1, p2) -> p1.wartosc() - p2.wartosc());
    }
  }

  /**
   * Returns coins with specified total value from the register
   * 
   * @param value
   * @return list of coins
   */
  private List<Pieniadz> getCoinsFromRegister(int value) {
    List<Pieniadz> result = new ArrayList<Pieniadz>();

    int rozmKasaVal = rozmKasa.stream().mapToInt(Pieniadz::wartosc).sum();
    int valueToCoverWithNrozm = value - rozmKasaVal; // valie - value of rozm coins in register
    int valCoveredWithNrozm = 0;

    // get as many nRomz coins as necessary
    while (valCoveredWithNrozm < valueToCoverWithNrozm) {
      // add lowest value nRozm coin to result
      var coin = nRozmKasa.remove(0);
      result.add(coin);
      valCoveredWithNrozm += coin.wartosc();
    }

    // check if some coins can be removed: ex: covering 11zl with 1+2+5+5 - remove
    // from back as many as possible
    for (int i = result.size() - 1; i >= 0; i--) {
      var coin = result.get(i);
      // coin can be removed and value will still be high enough
      if (valCoveredWithNrozm - coin.wartosc() >= valueToCoverWithNrozm) {
        result.remove(i);
        nRozmKasa.add(coin);
        valCoveredWithNrozm -= coin.wartosc();
      }
    }

    // fill the rest with rozm coins
    int toFillWithRozmCoins = value - result.stream().mapToInt(Pieniadz::wartosc).sum();
    while (toFillWithRozmCoins > 0) {
      // remove coin from pool
      var coin = rozmKasa.remove(0);
      if (coin.wartosc() <= toFillWithRozmCoins) {
        // put coin in result
        result.add(coin);
        toFillWithRozmCoins -= coin.wartosc();
      } else {
        // exchange and add coins back to front of the pool
        rozmKasa.addAll(0, rozmieniacz.rozmien(coin));
      }
    }

    Collections.sort(rozmKasa, (p1, p2) -> p1.wartosc() - p2.wartosc());

    return result;
  }

  @Override
  public List<Pieniadz> rozlicz(int cena, List<Pieniadz> pieniadze) {
    // split pieniadze into lists of changable and non-changable
    List<Pieniadz> normal = pieniadze.stream().filter(p -> p.czyMozeBycRozmieniony()).collect(Collectors.toList());
    List<Pieniadz> nRozm = pieniadze.stream().filter(p -> !p.czyMozeBycRozmieniony()).collect(Collectors.toList());
    // sort ascending from low nominal high
    Collections.sort(normal, (p1, p2) -> p1.wartosc() - p2.wartosc());
    Collections.sort(nRozm, (p1, p2) -> p1.wartosc() - p2.wartosc());
    // calculate sums
    int normalSum = normal.stream().mapToInt(Pieniadz::wartosc).sum();
    int pieniadzeSum = pieniadze.stream().mapToInt(Pieniadz::wartosc).sum();
    int doWydania = pieniadzeSum - cena;
    // clear pieniandze to prevent accidental duping
    pieniadze = new ArrayList<Pieniadz>(0);

    // result list
    List<Pieniadz> reszta = new ArrayList<Pieniadz>(doWydania);

    // paid with exact money - no rest
    if (doWydania == 0)
      return reszta;

    // wydanie reszty z logicznym rozmienieniem nrozm
    if (doWydania > normalSum) {
      // get smallest nRozm
      var coin = nRozm.remove(0);
      // coins pulled from the register
      var registerCoins = this.getCoinsFromRegister(coin.wartosc() - doWydania);
      reszta.add(coin); // nRozm moneta
      reszta.addAll(registerCoins); // reszta z kasy
    }
    // can normally give out change
    else {
      // reduce doWydania when adding money to result list
      while (doWydania > 0) {
        // remove coin from pool
        var coin = normal.remove(0);
        if (coin.wartosc() <= doWydania) {
          // put coin in result
          reszta.add(coin);
          doWydania -= coin.wartosc();
        } else {
          // exchange and add coins back to front of the pool
          normal.addAll(0, rozmieniacz.rozmien(coin));
        }
      }
    }

    // add the rest of coins to the register
    this.putCoinsInRegister(normal, nRozm);

    return reszta;
  }

  @Override
  public List<Pieniadz> stanKasy() {
    int size = rozmKasa.size() + nRozmKasa.size();
    List<Pieniadz> stanKasy = new ArrayList<Pieniadz>(size);
    stanKasy.addAll(rozmKasa);
    stanKasy.addAll(nRozmKasa);
    return stanKasy;
  }

  @Override
  public void dostępDoRozmieniacza(RozmieniaczInterface rozmieniacz) {
    this.rozmieniacz = rozmieniacz;
  }

  @Override
  public void dostępDoPoczątkowegoStanuKasy(Supplier<Pieniadz> supplier) {
    Pieniadz p;
    while ((p = supplier.get()) != null) {
      if (p.czyMozeBycRozmieniony())
        rozmKasa.add(p);
      else
        nRozmKasa.add(p);
    }
    // ascending from low to high nominals
    Collections.sort(rozmKasa, (p1, p2) -> p1.wartosc() - p2.wartosc());
    Collections.sort(nRozmKasa, (p1, p2) -> p1.wartosc() - p2.wartosc());
  }
}
