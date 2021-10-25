import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class LessOffensiveClassName {

    public static void main(String[] args) {
        ArrayList<String> good = new ArrayList<String>();
        ArrayList<Map<Character, Character>> goodDecode = new ArrayList<Map<Character, Character>>();
        ArrayList<Map<Character, Character>> goodCode = new ArrayList<Map<Character, Character>>();
        Map<Character, Character> tmp;

        // TEST 1
        good.add("          kZcbVRs\n\n,VbZWVg nSYdmamiVV        V\n\nUaJmdiRYZWV     FYmSmKRaXq\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('k', 'W'); tmp.put('Z', 'y'); tmp.put('c', 'd'); tmp.put('b', 'z'); tmp.put('V', 'i'); tmp.put('R', 'a'); tmp.put('s', 'ł'); tmp.put(',', 'F'); tmp.put('W', 'k'); tmp.put('g', ','); tmp.put('n', 'A'); tmp.put('S', 's'); tmp.put('Y', 't'); tmp.put('d', 'r'); tmp.put('m', 'o'); tmp.put('a', 'n'); tmp.put('i', 'm'); tmp.put('U', 'I'); tmp.put('J', 'f'); tmp.put('F', 'S'); tmp.put('K', 'w'); tmp.put('X', 'e'); tmp.put('q', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'k'); tmp.put('y', 'Z'); tmp.put('d', 'c'); tmp.put('z', 'b'); tmp.put('i', 'V'); tmp.put('a', 'R'); tmp.put('ł', 's'); tmp.put('F', ','); tmp.put('k', 'W'); tmp.put(',', 'g'); tmp.put('A', 'n'); tmp.put('s', 'S'); tmp.put('t', 'Y'); tmp.put('r', 'd'); tmp.put('o', 'm'); tmp.put('n', 'a'); tmp.put('m', 'i'); tmp.put('I', 'U'); tmp.put('f', 'J'); tmp.put('S', 'F'); tmp.put('w', 'K'); tmp.put('e', 'X'); tmp.put('j', 'q');
        goodDecode.add(tmp);
        // TEST 2
        good.add("\nSLryUbX\nłUyLuUJ   ET,GqoqCUU          U         VoPqGCb,LuU          v,qTqKbois ");
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('L', 'y'); tmp.put('r', 'd'); tmp.put('y', 'z'); tmp.put('U', 'i'); tmp.put('b', 'a'); tmp.put('X', 'ł'); tmp.put('ł', 'F'); tmp.put('u', 'k'); tmp.put('J', ','); tmp.put('E', 'A'); tmp.put('T', 's'); tmp.put(',', 't'); tmp.put('G', 'r'); tmp.put('q', 'o'); tmp.put('o', 'n'); tmp.put('C', 'm'); tmp.put('V', 'I'); tmp.put('P', 'f'); tmp.put('v', 'S'); tmp.put('K', 'w'); tmp.put('i', 'e'); tmp.put('s', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'L'); tmp.put('d', 'r'); tmp.put('z', 'y'); tmp.put('i', 'U'); tmp.put('a', 'b'); tmp.put('ł', 'X'); tmp.put('F', 'ł'); tmp.put('k', 'u'); tmp.put(',', 'J'); tmp.put('A', 'E'); tmp.put('s', 'T'); tmp.put('t', ','); tmp.put('r', 'G'); tmp.put('o', 'q'); tmp.put('n', 'o'); tmp.put('m', 'C'); tmp.put('I', 'V'); tmp.put('f', 'P'); tmp.put('S', 'v'); tmp.put('w', 'K'); tmp.put('e', 'i'); tmp.put('j', 's');
        goodDecode.add(tmp);
        // TEST 3
        good.add("         zhicGvM   HGchWGa     nbwoXAXeGG       G\nuA,XoevwhWG     JwXbXNvAOk   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('h', 'y'); tmp.put('i', 'd'); tmp.put('c', 'z'); tmp.put('G', 'i'); tmp.put('v', 'a'); tmp.put('M', 'ł'); tmp.put('H', 'F'); tmp.put('W', 'k'); tmp.put('a', ','); tmp.put('n', 'A'); tmp.put('b', 's'); tmp.put('w', 't'); tmp.put('o', 'r'); tmp.put('X', 'o'); tmp.put('A', 'n'); tmp.put('e', 'm'); tmp.put('u', 'I'); tmp.put(',', 'f'); tmp.put('J', 'S'); tmp.put('N', 'w'); tmp.put('O', 'e'); tmp.put('k', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'h'); tmp.put('d', 'i'); tmp.put('z', 'c'); tmp.put('i', 'G'); tmp.put('a', 'v'); tmp.put('ł', 'M'); tmp.put('F', 'H'); tmp.put('k', 'W'); tmp.put(',', 'a'); tmp.put('A', 'n'); tmp.put('s', 'b'); tmp.put('t', 'w'); tmp.put('r', 'o'); tmp.put('o', 'X'); tmp.put('n', 'A'); tmp.put('m', 'e'); tmp.put('I', 'u'); tmp.put('f', ','); tmp.put('S', 'J'); tmp.put('w', 'N'); tmp.put('e', 'O'); tmp.put('j', 'k');
        goodDecode.add(tmp);
        // TEST 4
        good.add("\n\n\nucoq,nb a,qcx,w\n\n\ntdTCrXrL,,      ,   YXvrCLnTcx,   HTrdrOnXFe       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('u', 'W'); tmp.put('c', 'y'); tmp.put('o', 'd'); tmp.put('q', 'z'); tmp.put(',', 'i'); tmp.put('n', 'a'); tmp.put('b', 'ł'); tmp.put('a', 'F'); tmp.put('x', 'k'); tmp.put('w', ','); tmp.put('t', 'A'); tmp.put('d', 's'); tmp.put('T', 't'); tmp.put('C', 'r'); tmp.put('r', 'o'); tmp.put('X', 'n'); tmp.put('L', 'm'); tmp.put('Y', 'I'); tmp.put('v', 'f'); tmp.put('H', 'S'); tmp.put('O', 'w'); tmp.put('F', 'e'); tmp.put('e', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'u'); tmp.put('y', 'c'); tmp.put('d', 'o'); tmp.put('z', 'q'); tmp.put('i', ','); tmp.put('a', 'n'); tmp.put('ł', 'b'); tmp.put('F', 'a'); tmp.put('k', 'x'); tmp.put(',', 'w'); tmp.put('A', 't'); tmp.put('s', 'd'); tmp.put('t', 'T'); tmp.put('r', 'C'); tmp.put('o', 'r'); tmp.put('n', 'X'); tmp.put('m', 'L'); tmp.put('I', 'Y'); tmp.put('f', 'v'); tmp.put('S', 'H'); tmp.put('w', 'O'); tmp.put('e', 'F'); tmp.put('j', 'e');
        goodDecode.add(tmp);
        // TEST 5
        good.add("         iUIVwDP   ewVUmwZ    fhRrAYAvww\n\nw\n\n\nSYEArvDRUmw MRAhAdDYLF     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('i', 'W'); tmp.put('U', 'y'); tmp.put('I', 'd'); tmp.put('V', 'z'); tmp.put('w', 'i'); tmp.put('D', 'a'); tmp.put('P', 'ł'); tmp.put('e', 'F'); tmp.put('m', 'k'); tmp.put('Z', ','); tmp.put('f', 'A'); tmp.put('h', 's'); tmp.put('R', 't'); tmp.put('r', 'r'); tmp.put('A', 'o'); tmp.put('Y', 'n'); tmp.put('v', 'm'); tmp.put('S', 'I'); tmp.put('E', 'f'); tmp.put('M', 'S'); tmp.put('d', 'w'); tmp.put('L', 'e'); tmp.put('F', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'i'); tmp.put('y', 'U'); tmp.put('d', 'I'); tmp.put('z', 'V'); tmp.put('i', 'w'); tmp.put('a', 'D'); tmp.put('ł', 'P'); tmp.put('F', 'e'); tmp.put('k', 'm'); tmp.put(',', 'Z'); tmp.put('A', 'f'); tmp.put('s', 'h'); tmp.put('t', 'R'); tmp.put('r', 'r'); tmp.put('o', 'A'); tmp.put('n', 'Y'); tmp.put('m', 'v'); tmp.put('I', 'S'); tmp.put('f', 'E'); tmp.put('S', 'M'); tmp.put('w', 'd'); tmp.put('e', 'L'); tmp.put('j', 'F');
        goodDecode.add(tmp);
        // TEST 6
        good.add("\n\n\nyWROFHg   ,FOWcFp          BlMTjejhFF  F  veDjThHMWcF      YMjljdHeib\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('y', 'W'); tmp.put('W', 'y'); tmp.put('R', 'd'); tmp.put('O', 'z'); tmp.put('F', 'i'); tmp.put('H', 'a'); tmp.put('g', 'ł'); tmp.put(',', 'F'); tmp.put('c', 'k'); tmp.put('p', ','); tmp.put('B', 'A'); tmp.put('l', 's'); tmp.put('M', 't'); tmp.put('T', 'r'); tmp.put('j', 'o'); tmp.put('e', 'n'); tmp.put('h', 'm'); tmp.put('v', 'I'); tmp.put('D', 'f'); tmp.put('Y', 'S'); tmp.put('d', 'w'); tmp.put('i', 'e'); tmp.put('b', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'y'); tmp.put('y', 'W'); tmp.put('d', 'R'); tmp.put('z', 'O'); tmp.put('i', 'F'); tmp.put('a', 'H'); tmp.put('ł', 'g'); tmp.put('F', ','); tmp.put('k', 'c'); tmp.put(',', 'p'); tmp.put('A', 'B'); tmp.put('s', 'l'); tmp.put('t', 'M'); tmp.put('r', 'T'); tmp.put('o', 'j'); tmp.put('n', 'e'); tmp.put('m', 'h'); tmp.put('I', 'v'); tmp.put('f', 'D'); tmp.put('S', 'Y'); tmp.put('w', 'd'); tmp.put('e', 'i'); tmp.put('j', 'b');
        goodDecode.add(tmp);
        // TEST 7
        good.add("        vuAjLZi VLjurLO\n\n\nqłKTl,lILL    L          g,clTIZKurL        BKlłlfZ,kY ");
        tmp = new HashMap<Character, Character>();
        tmp.put('v', 'W'); tmp.put('u', 'y'); tmp.put('A', 'd'); tmp.put('j', 'z'); tmp.put('L', 'i'); tmp.put('Z', 'a'); tmp.put('i', 'ł'); tmp.put('V', 'F'); tmp.put('r', 'k'); tmp.put('O', ','); tmp.put('q', 'A'); tmp.put('ł', 's'); tmp.put('K', 't'); tmp.put('T', 'r'); tmp.put('l', 'o'); tmp.put(',', 'n'); tmp.put('I', 'm'); tmp.put('g', 'I'); tmp.put('c', 'f'); tmp.put('B', 'S'); tmp.put('f', 'w'); tmp.put('k', 'e'); tmp.put('Y', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'v'); tmp.put('y', 'u'); tmp.put('d', 'A'); tmp.put('z', 'j'); tmp.put('i', 'L'); tmp.put('a', 'Z'); tmp.put('ł', 'i'); tmp.put('F', 'V'); tmp.put('k', 'r'); tmp.put(',', 'O'); tmp.put('A', 'q'); tmp.put('s', 'ł'); tmp.put('t', 'K'); tmp.put('r', 'T'); tmp.put('o', 'l'); tmp.put('n', ','); tmp.put('m', 'I'); tmp.put('I', 'g'); tmp.put('f', 'c'); tmp.put('S', 'B'); tmp.put('w', 'f'); tmp.put('e', 'k'); tmp.put('j', 'Y');
        goodDecode.add(tmp);
        // TEST 8
        good.add("     fSjKDzh\niDKSADJ\ngFQPUVU,DD\n\n\nD     YVZUP,zQSAD  xQUFUqzVsW         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('f', 'W'); tmp.put('S', 'y'); tmp.put('j', 'd'); tmp.put('K', 'z'); tmp.put('D', 'i'); tmp.put('z', 'a'); tmp.put('h', 'ł'); tmp.put('i', 'F'); tmp.put('A', 'k'); tmp.put('J', ','); tmp.put('g', 'A'); tmp.put('F', 's'); tmp.put('Q', 't'); tmp.put('P', 'r'); tmp.put('U', 'o'); tmp.put('V', 'n'); tmp.put(',', 'm'); tmp.put('Y', 'I'); tmp.put('Z', 'f'); tmp.put('x', 'S'); tmp.put('q', 'w'); tmp.put('s', 'e'); tmp.put('W', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'f'); tmp.put('y', 'S'); tmp.put('d', 'j'); tmp.put('z', 'K'); tmp.put('i', 'D'); tmp.put('a', 'z'); tmp.put('ł', 'h'); tmp.put('F', 'i'); tmp.put('k', 'A'); tmp.put(',', 'J'); tmp.put('A', 'g'); tmp.put('s', 'F'); tmp.put('t', 'Q'); tmp.put('r', 'P'); tmp.put('o', 'U'); tmp.put('n', 'V'); tmp.put('m', ','); tmp.put('I', 'Y'); tmp.put('f', 'Z'); tmp.put('S', 'x'); tmp.put('w', 'q'); tmp.put('e', 's'); tmp.put('j', 'W');
        goodDecode.add(tmp);
        // TEST 9
        good.add("       dsCwnWc\n\nGnwsunI       ykxaBhBDnn\n\n\nn LhPBaDWxsun zxBkBAWhjt   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('d', 'W'); tmp.put('s', 'y'); tmp.put('C', 'd'); tmp.put('w', 'z'); tmp.put('n', 'i'); tmp.put('W', 'a'); tmp.put('c', 'ł'); tmp.put('G', 'F'); tmp.put('u', 'k'); tmp.put('I', ','); tmp.put('y', 'A'); tmp.put('k', 's'); tmp.put('x', 't'); tmp.put('a', 'r'); tmp.put('B', 'o'); tmp.put('h', 'n'); tmp.put('D', 'm'); tmp.put('L', 'I'); tmp.put('P', 'f'); tmp.put('z', 'S'); tmp.put('A', 'w'); tmp.put('j', 'e'); tmp.put('t', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'd'); tmp.put('y', 's'); tmp.put('d', 'C'); tmp.put('z', 'w'); tmp.put('i', 'n'); tmp.put('a', 'W'); tmp.put('ł', 'c'); tmp.put('F', 'G'); tmp.put('k', 'u'); tmp.put(',', 'I'); tmp.put('A', 'y'); tmp.put('s', 'k'); tmp.put('t', 'x'); tmp.put('r', 'a'); tmp.put('o', 'B'); tmp.put('n', 'h'); tmp.put('m', 'D'); tmp.put('I', 'L'); tmp.put('f', 'P'); tmp.put('S', 'z'); tmp.put('w', 'A'); tmp.put('e', 'j'); tmp.put('j', 't');
        goodDecode.add(tmp);
        // TEST 10
        good.add("   tWUcirV\nZicWyiT    DzB,pSpvii    i       xSXp,vrBWyi    wBpzpYrSHł       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('t', 'W'); tmp.put('W', 'y'); tmp.put('U', 'd'); tmp.put('c', 'z'); tmp.put('i', 'i'); tmp.put('r', 'a'); tmp.put('V', 'ł'); tmp.put('Z', 'F'); tmp.put('y', 'k'); tmp.put('T', ','); tmp.put('D', 'A'); tmp.put('z', 's'); tmp.put('B', 't'); tmp.put(',', 'r'); tmp.put('p', 'o'); tmp.put('S', 'n'); tmp.put('v', 'm'); tmp.put('x', 'I'); tmp.put('X', 'f'); tmp.put('w', 'S'); tmp.put('Y', 'w'); tmp.put('H', 'e'); tmp.put('ł', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 't'); tmp.put('y', 'W'); tmp.put('d', 'U'); tmp.put('z', 'c'); tmp.put('i', 'i'); tmp.put('a', 'r'); tmp.put('ł', 'V'); tmp.put('F', 'Z'); tmp.put('k', 'y'); tmp.put(',', 'T'); tmp.put('A', 'D'); tmp.put('s', 'z'); tmp.put('t', 'B'); tmp.put('r', ','); tmp.put('o', 'p'); tmp.put('n', 'S'); tmp.put('m', 'v'); tmp.put('I', 'x'); tmp.put('f', 'X'); tmp.put('S', 'w'); tmp.put('w', 'Y'); tmp.put('e', 'H'); tmp.put('j', 'ł');
        goodDecode.add(tmp);
        // TEST 11
        good.add(" kyNnMwL       rMnyPMH     IRKUF,FYMM         M        X,lFUYwKyPM        łKFRFSw,ax   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('k', 'W'); tmp.put('y', 'y'); tmp.put('N', 'd'); tmp.put('n', 'z'); tmp.put('M', 'i'); tmp.put('w', 'a'); tmp.put('L', 'ł'); tmp.put('r', 'F'); tmp.put('P', 'k'); tmp.put('H', ','); tmp.put('I', 'A'); tmp.put('R', 's'); tmp.put('K', 't'); tmp.put('U', 'r'); tmp.put('F', 'o'); tmp.put(',', 'n'); tmp.put('Y', 'm'); tmp.put('X', 'I'); tmp.put('l', 'f'); tmp.put('ł', 'S'); tmp.put('S', 'w'); tmp.put('a', 'e'); tmp.put('x', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'k'); tmp.put('y', 'y'); tmp.put('d', 'N'); tmp.put('z', 'n'); tmp.put('i', 'M'); tmp.put('a', 'w'); tmp.put('ł', 'L'); tmp.put('F', 'r'); tmp.put('k', 'P'); tmp.put(',', 'H'); tmp.put('A', 'I'); tmp.put('s', 'R'); tmp.put('t', 'K'); tmp.put('r', 'U'); tmp.put('o', 'F'); tmp.put('n', ','); tmp.put('m', 'Y'); tmp.put('I', 'X'); tmp.put('f', 'l'); tmp.put('S', 'ł'); tmp.put('w', 'S'); tmp.put('e', 'a'); tmp.put('j', 'x');
        goodDecode.add(tmp);
        // TEST 12
        good.add("\n\n\nzBwLdVY\nidLBrdt covTnJnQdd     d         eJlnTQVvBrd\nsvnonhVJDG         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('B', 'y'); tmp.put('w', 'd'); tmp.put('L', 'z'); tmp.put('d', 'i'); tmp.put('V', 'a'); tmp.put('Y', 'ł'); tmp.put('i', 'F'); tmp.put('r', 'k'); tmp.put('t', ','); tmp.put('c', 'A'); tmp.put('o', 's'); tmp.put('v', 't'); tmp.put('T', 'r'); tmp.put('n', 'o'); tmp.put('J', 'n'); tmp.put('Q', 'm'); tmp.put('e', 'I'); tmp.put('l', 'f'); tmp.put('s', 'S'); tmp.put('h', 'w'); tmp.put('D', 'e'); tmp.put('G', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'B'); tmp.put('d', 'w'); tmp.put('z', 'L'); tmp.put('i', 'd'); tmp.put('a', 'V'); tmp.put('ł', 'Y'); tmp.put('F', 'i'); tmp.put('k', 'r'); tmp.put(',', 't'); tmp.put('A', 'c'); tmp.put('s', 'o'); tmp.put('t', 'v'); tmp.put('r', 'T'); tmp.put('o', 'n'); tmp.put('n', 'J'); tmp.put('m', 'Q'); tmp.put('I', 'e'); tmp.put('f', 'l'); tmp.put('S', 's'); tmp.put('w', 'h'); tmp.put('e', 'D'); tmp.put('j', 'G');
        goodDecode.add(tmp);
        // TEST 13
        good.add("   TRJWFCw     HFWReFj         YmDbIgIPFF\n\nF        UgKIbPCDReF        VDImIoCgsu  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('T', 'W'); tmp.put('R', 'y'); tmp.put('J', 'd'); tmp.put('W', 'z'); tmp.put('F', 'i'); tmp.put('C', 'a'); tmp.put('w', 'ł'); tmp.put('H', 'F'); tmp.put('e', 'k'); tmp.put('j', ','); tmp.put('Y', 'A'); tmp.put('m', 's'); tmp.put('D', 't'); tmp.put('b', 'r'); tmp.put('I', 'o'); tmp.put('g', 'n'); tmp.put('P', 'm'); tmp.put('U', 'I'); tmp.put('K', 'f'); tmp.put('V', 'S'); tmp.put('o', 'w'); tmp.put('s', 'e'); tmp.put('u', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'T'); tmp.put('y', 'R'); tmp.put('d', 'J'); tmp.put('z', 'W'); tmp.put('i', 'F'); tmp.put('a', 'C'); tmp.put('ł', 'w'); tmp.put('F', 'H'); tmp.put('k', 'e'); tmp.put(',', 'j'); tmp.put('A', 'Y'); tmp.put('s', 'm'); tmp.put('t', 'D'); tmp.put('r', 'b'); tmp.put('o', 'I'); tmp.put('n', 'g'); tmp.put('m', 'P'); tmp.put('I', 'U'); tmp.put('f', 'K'); tmp.put('S', 'V'); tmp.put('w', 'o'); tmp.put('e', 's'); tmp.put('j', 'u');
        goodDecode.add(tmp);
        // TEST 14
        good.add("    RqFuZvV fZuqHZs       iOgcPtPSZZ  Z      rtyPcSvgqHZ     EgPOPAvthn\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('R', 'W'); tmp.put('q', 'y'); tmp.put('F', 'd'); tmp.put('u', 'z'); tmp.put('Z', 'i'); tmp.put('v', 'a'); tmp.put('V', 'ł'); tmp.put('f', 'F'); tmp.put('H', 'k'); tmp.put('s', ','); tmp.put('i', 'A'); tmp.put('O', 's'); tmp.put('g', 't'); tmp.put('c', 'r'); tmp.put('P', 'o'); tmp.put('t', 'n'); tmp.put('S', 'm'); tmp.put('r', 'I'); tmp.put('y', 'f'); tmp.put('E', 'S'); tmp.put('A', 'w'); tmp.put('h', 'e'); tmp.put('n', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'R'); tmp.put('y', 'q'); tmp.put('d', 'F'); tmp.put('z', 'u'); tmp.put('i', 'Z'); tmp.put('a', 'v'); tmp.put('ł', 'V'); tmp.put('F', 'f'); tmp.put('k', 'H'); tmp.put(',', 's'); tmp.put('A', 'i'); tmp.put('s', 'O'); tmp.put('t', 'g'); tmp.put('r', 'c'); tmp.put('o', 'P'); tmp.put('n', 't'); tmp.put('m', 'S'); tmp.put('I', 'r'); tmp.put('f', 'y'); tmp.put('S', 'E'); tmp.put('w', 'A'); tmp.put('e', 'h'); tmp.put('j', 'n');
        goodDecode.add(tmp);
        // TEST 15
        good.add("       XJeKLDc\n\nOLKJbLd          lnVCoZogLL   L          vZsoCgDVJbL\n\nWVonofDZqj     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('X', 'W'); tmp.put('J', 'y'); tmp.put('e', 'd'); tmp.put('K', 'z'); tmp.put('L', 'i'); tmp.put('D', 'a'); tmp.put('c', 'ł'); tmp.put('O', 'F'); tmp.put('b', 'k'); tmp.put('d', ','); tmp.put('l', 'A'); tmp.put('n', 's'); tmp.put('V', 't'); tmp.put('C', 'r'); tmp.put('o', 'o'); tmp.put('Z', 'n'); tmp.put('g', 'm'); tmp.put('v', 'I'); tmp.put('s', 'f'); tmp.put('W', 'S'); tmp.put('f', 'w'); tmp.put('q', 'e'); tmp.put('j', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'X'); tmp.put('y', 'J'); tmp.put('d', 'e'); tmp.put('z', 'K'); tmp.put('i', 'L'); tmp.put('a', 'D'); tmp.put('ł', 'c'); tmp.put('F', 'O'); tmp.put('k', 'b'); tmp.put(',', 'd'); tmp.put('A', 'l'); tmp.put('s', 'n'); tmp.put('t', 'V'); tmp.put('r', 'C'); tmp.put('o', 'o'); tmp.put('n', 'Z'); tmp.put('m', 'g'); tmp.put('I', 'v'); tmp.put('f', 's'); tmp.put('S', 'W'); tmp.put('w', 'f'); tmp.put('e', 'q'); tmp.put('j', 'j');
        goodDecode.add(tmp);
        // TEST 16
        good.add("  CsmpZbG      nZpsrZI    VXTHNONcZZ          Z xOzNHcbTsrZ    kTNXNubOal          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('C', 'W'); tmp.put('s', 'y'); tmp.put('m', 'd'); tmp.put('p', 'z'); tmp.put('Z', 'i'); tmp.put('b', 'a'); tmp.put('G', 'ł'); tmp.put('n', 'F'); tmp.put('r', 'k'); tmp.put('I', ','); tmp.put('V', 'A'); tmp.put('X', 's'); tmp.put('T', 't'); tmp.put('H', 'r'); tmp.put('N', 'o'); tmp.put('O', 'n'); tmp.put('c', 'm'); tmp.put('x', 'I'); tmp.put('z', 'f'); tmp.put('k', 'S'); tmp.put('u', 'w'); tmp.put('a', 'e'); tmp.put('l', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'C'); tmp.put('y', 's'); tmp.put('d', 'm'); tmp.put('z', 'p'); tmp.put('i', 'Z'); tmp.put('a', 'b'); tmp.put('ł', 'G'); tmp.put('F', 'n'); tmp.put('k', 'r'); tmp.put(',', 'I'); tmp.put('A', 'V'); tmp.put('s', 'X'); tmp.put('t', 'T'); tmp.put('r', 'H'); tmp.put('o', 'N'); tmp.put('n', 'O'); tmp.put('m', 'c'); tmp.put('I', 'x'); tmp.put('f', 'z'); tmp.put('S', 'k'); tmp.put('w', 'u'); tmp.put('e', 'a'); tmp.put('j', 'l');
        goodDecode.add(tmp);
        // TEST 17
        good.add("        nsłBjHx          WjBsgjY       IdhJuyucjj    j  tyquJcHhsgj fhuduUHyT, ");
        tmp = new HashMap<Character, Character>();
        tmp.put('n', 'W'); tmp.put('s', 'y'); tmp.put('ł', 'd'); tmp.put('B', 'z'); tmp.put('j', 'i'); tmp.put('H', 'a'); tmp.put('x', 'ł'); tmp.put('W', 'F'); tmp.put('g', 'k'); tmp.put('Y', ','); tmp.put('I', 'A'); tmp.put('d', 's'); tmp.put('h', 't'); tmp.put('J', 'r'); tmp.put('u', 'o'); tmp.put('y', 'n'); tmp.put('c', 'm'); tmp.put('t', 'I'); tmp.put('q', 'f'); tmp.put('f', 'S'); tmp.put('U', 'w'); tmp.put('T', 'e'); tmp.put(',', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'n'); tmp.put('y', 's'); tmp.put('d', 'ł'); tmp.put('z', 'B'); tmp.put('i', 'j'); tmp.put('a', 'H'); tmp.put('ł', 'x'); tmp.put('F', 'W'); tmp.put('k', 'g'); tmp.put(',', 'Y'); tmp.put('A', 'I'); tmp.put('s', 'd'); tmp.put('t', 'h'); tmp.put('r', 'J'); tmp.put('o', 'u'); tmp.put('n', 'y'); tmp.put('m', 'c'); tmp.put('I', 't'); tmp.put('f', 'q'); tmp.put('S', 'f'); tmp.put('w', 'U'); tmp.put('e', 'T'); tmp.put('j', ',');
        goodDecode.add(tmp);
        // TEST 18
        good.add("        onBMCDR TCMniCg HbrXqEqICC  C   xEjqXIDrniC         LrqbqJDEpv         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('o', 'W'); tmp.put('n', 'y'); tmp.put('B', 'd'); tmp.put('M', 'z'); tmp.put('C', 'i'); tmp.put('D', 'a'); tmp.put('R', 'ł'); tmp.put('T', 'F'); tmp.put('i', 'k'); tmp.put('g', ','); tmp.put('H', 'A'); tmp.put('b', 's'); tmp.put('r', 't'); tmp.put('X', 'r'); tmp.put('q', 'o'); tmp.put('E', 'n'); tmp.put('I', 'm'); tmp.put('x', 'I'); tmp.put('j', 'f'); tmp.put('L', 'S'); tmp.put('J', 'w'); tmp.put('p', 'e'); tmp.put('v', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'o'); tmp.put('y', 'n'); tmp.put('d', 'B'); tmp.put('z', 'M'); tmp.put('i', 'C'); tmp.put('a', 'D'); tmp.put('ł', 'R'); tmp.put('F', 'T'); tmp.put('k', 'i'); tmp.put(',', 'g'); tmp.put('A', 'H'); tmp.put('s', 'b'); tmp.put('t', 'r'); tmp.put('r', 'X'); tmp.put('o', 'q'); tmp.put('n', 'E'); tmp.put('m', 'I'); tmp.put('I', 'x'); tmp.put('f', 'j'); tmp.put('S', 'L'); tmp.put('w', 'J'); tmp.put('e', 'p'); tmp.put('j', 'v');
        goodDecode.add(tmp);
        // TEST 19
        good.add("        hvTGgZt       KgGvłgC         XSlWp,pogg\n\ng  Y,UpWoZlvłg      alpSpsZ,Lu\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('h', 'W'); tmp.put('v', 'y'); tmp.put('T', 'd'); tmp.put('G', 'z'); tmp.put('g', 'i'); tmp.put('Z', 'a'); tmp.put('t', 'ł'); tmp.put('K', 'F'); tmp.put('ł', 'k'); tmp.put('C', ','); tmp.put('X', 'A'); tmp.put('S', 's'); tmp.put('l', 't'); tmp.put('W', 'r'); tmp.put('p', 'o'); tmp.put(',', 'n'); tmp.put('o', 'm'); tmp.put('Y', 'I'); tmp.put('U', 'f'); tmp.put('a', 'S'); tmp.put('s', 'w'); tmp.put('L', 'e'); tmp.put('u', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'h'); tmp.put('y', 'v'); tmp.put('d', 'T'); tmp.put('z', 'G'); tmp.put('i', 'g'); tmp.put('a', 'Z'); tmp.put('ł', 't'); tmp.put('F', 'K'); tmp.put('k', 'ł'); tmp.put(',', 'C'); tmp.put('A', 'X'); tmp.put('s', 'S'); tmp.put('t', 'l'); tmp.put('r', 'W'); tmp.put('o', 'p'); tmp.put('n', ','); tmp.put('m', 'o'); tmp.put('I', 'Y'); tmp.put('f', 'U'); tmp.put('S', 'a'); tmp.put('w', 's'); tmp.put('e', 'L'); tmp.put('j', 'u');
        goodDecode.add(tmp);
        // TEST 20
        good.add("          tuAłdDC       QdłuXdy         oMwhfqfNdd d\n\naqYfhNDwuXd   OwfMfJDqUg ");
        tmp = new HashMap<Character, Character>();
        tmp.put('t', 'W'); tmp.put('u', 'y'); tmp.put('A', 'd'); tmp.put('ł', 'z'); tmp.put('d', 'i'); tmp.put('D', 'a'); tmp.put('C', 'ł'); tmp.put('Q', 'F'); tmp.put('X', 'k'); tmp.put('y', ','); tmp.put('o', 'A'); tmp.put('M', 's'); tmp.put('w', 't'); tmp.put('h', 'r'); tmp.put('f', 'o'); tmp.put('q', 'n'); tmp.put('N', 'm'); tmp.put('a', 'I'); tmp.put('Y', 'f'); tmp.put('O', 'S'); tmp.put('J', 'w'); tmp.put('U', 'e'); tmp.put('g', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 't'); tmp.put('y', 'u'); tmp.put('d', 'A'); tmp.put('z', 'ł'); tmp.put('i', 'd'); tmp.put('a', 'D'); tmp.put('ł', 'C'); tmp.put('F', 'Q'); tmp.put('k', 'X'); tmp.put(',', 'y'); tmp.put('A', 'o'); tmp.put('s', 'M'); tmp.put('t', 'w'); tmp.put('r', 'h'); tmp.put('o', 'f'); tmp.put('n', 'q'); tmp.put('m', 'N'); tmp.put('I', 'a'); tmp.put('f', 'Y'); tmp.put('S', 'O'); tmp.put('w', 'J'); tmp.put('e', 'U'); tmp.put('j', 'g');
        goodDecode.add(tmp);
        // TEST 21
        good.add("\n\n\nztseMnJ        uMetGMg\nQRwNOLOjMM      M       aLmONjnwtGM\n\nWwOROTnLUl       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('t', 'y'); tmp.put('s', 'd'); tmp.put('e', 'z'); tmp.put('M', 'i'); tmp.put('n', 'a'); tmp.put('J', 'ł'); tmp.put('u', 'F'); tmp.put('G', 'k'); tmp.put('g', ','); tmp.put('Q', 'A'); tmp.put('R', 's'); tmp.put('w', 't'); tmp.put('N', 'r'); tmp.put('O', 'o'); tmp.put('L', 'n'); tmp.put('j', 'm'); tmp.put('a', 'I'); tmp.put('m', 'f'); tmp.put('W', 'S'); tmp.put('T', 'w'); tmp.put('U', 'e'); tmp.put('l', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 't'); tmp.put('d', 's'); tmp.put('z', 'e'); tmp.put('i', 'M'); tmp.put('a', 'n'); tmp.put('ł', 'J'); tmp.put('F', 'u'); tmp.put('k', 'G'); tmp.put(',', 'g'); tmp.put('A', 'Q'); tmp.put('s', 'R'); tmp.put('t', 'w'); tmp.put('r', 'N'); tmp.put('o', 'O'); tmp.put('n', 'L'); tmp.put('m', 'j'); tmp.put('I', 'a'); tmp.put('f', 'm'); tmp.put('S', 'W'); tmp.put('w', 'T'); tmp.put('e', 'U'); tmp.put('j', 'l');
        goodDecode.add(tmp);
        // TEST 22
        good.add("\n\nzKxiXTB    RXiKcXP     FSdECnCłXX   X   gnJCEłTdKcX\n\nfdCSCaTnrj\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('K', 'y'); tmp.put('x', 'd'); tmp.put('i', 'z'); tmp.put('X', 'i'); tmp.put('T', 'a'); tmp.put('B', 'ł'); tmp.put('R', 'F'); tmp.put('c', 'k'); tmp.put('P', ','); tmp.put('F', 'A'); tmp.put('S', 's'); tmp.put('d', 't'); tmp.put('E', 'r'); tmp.put('C', 'o'); tmp.put('n', 'n'); tmp.put('ł', 'm'); tmp.put('g', 'I'); tmp.put('J', 'f'); tmp.put('f', 'S'); tmp.put('a', 'w'); tmp.put('r', 'e'); tmp.put('j', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'K'); tmp.put('d', 'x'); tmp.put('z', 'i'); tmp.put('i', 'X'); tmp.put('a', 'T'); tmp.put('ł', 'B'); tmp.put('F', 'R'); tmp.put('k', 'c'); tmp.put(',', 'P'); tmp.put('A', 'F'); tmp.put('s', 'S'); tmp.put('t', 'd'); tmp.put('r', 'E'); tmp.put('o', 'C'); tmp.put('n', 'n'); tmp.put('m', 'ł'); tmp.put('I', 'g'); tmp.put('f', 'J'); tmp.put('S', 'f'); tmp.put('w', 'a'); tmp.put('e', 'r'); tmp.put('j', 'j');
        goodDecode.add(tmp);
        // TEST 23
        good.add("\n\nlrtjHfD\n\nUHjrIHi\n\nbLBGhAhOHH          H          yAMhGOfBrIH     TBhLhxfAJC      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('l', 'W'); tmp.put('r', 'y'); tmp.put('t', 'd'); tmp.put('j', 'z'); tmp.put('H', 'i'); tmp.put('f', 'a'); tmp.put('D', 'ł'); tmp.put('U', 'F'); tmp.put('I', 'k'); tmp.put('i', ','); tmp.put('b', 'A'); tmp.put('L', 's'); tmp.put('B', 't'); tmp.put('G', 'r'); tmp.put('h', 'o'); tmp.put('A', 'n'); tmp.put('O', 'm'); tmp.put('y', 'I'); tmp.put('M', 'f'); tmp.put('T', 'S'); tmp.put('x', 'w'); tmp.put('J', 'e'); tmp.put('C', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'l'); tmp.put('y', 'r'); tmp.put('d', 't'); tmp.put('z', 'j'); tmp.put('i', 'H'); tmp.put('a', 'f'); tmp.put('ł', 'D'); tmp.put('F', 'U'); tmp.put('k', 'I'); tmp.put(',', 'i'); tmp.put('A', 'b'); tmp.put('s', 'L'); tmp.put('t', 'B'); tmp.put('r', 'G'); tmp.put('o', 'h'); tmp.put('n', 'A'); tmp.put('m', 'O'); tmp.put('I', 'y'); tmp.put('f', 'M'); tmp.put('S', 'T'); tmp.put('w', 'x'); tmp.put('e', 'J'); tmp.put('j', 'C');
        goodDecode.add(tmp);
        // TEST 24
        good.add("  WMzZmtr\npmZM,mF  PJHDYnYOmm\n\nm     NnEYDOtHM,m  THYJYatnKx     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'W'); tmp.put('M', 'y'); tmp.put('z', 'd'); tmp.put('Z', 'z'); tmp.put('m', 'i'); tmp.put('t', 'a'); tmp.put('r', 'ł'); tmp.put('p', 'F'); tmp.put(',', 'k'); tmp.put('F', ','); tmp.put('P', 'A'); tmp.put('J', 's'); tmp.put('H', 't'); tmp.put('D', 'r'); tmp.put('Y', 'o'); tmp.put('n', 'n'); tmp.put('O', 'm'); tmp.put('N', 'I'); tmp.put('E', 'f'); tmp.put('T', 'S'); tmp.put('a', 'w'); tmp.put('K', 'e'); tmp.put('x', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'W'); tmp.put('y', 'M'); tmp.put('d', 'z'); tmp.put('z', 'Z'); tmp.put('i', 'm'); tmp.put('a', 't'); tmp.put('ł', 'r'); tmp.put('F', 'p'); tmp.put('k', ','); tmp.put(',', 'F'); tmp.put('A', 'P'); tmp.put('s', 'J'); tmp.put('t', 'H'); tmp.put('r', 'D'); tmp.put('o', 'Y'); tmp.put('n', 'n'); tmp.put('m', 'O'); tmp.put('I', 'N'); tmp.put('f', 'E'); tmp.put('S', 'T'); tmp.put('w', 'a'); tmp.put('e', 'K'); tmp.put('j', 'x');
        goodDecode.add(tmp);
        // TEST 25
        good.add("       kypjfxA  DfjyJfL  OWtinZnGff  f   QZHniGxtyJf     UtnWnPxZrR ");
        tmp = new HashMap<Character, Character>();
        tmp.put('k', 'W'); tmp.put('y', 'y'); tmp.put('p', 'd'); tmp.put('j', 'z'); tmp.put('f', 'i'); tmp.put('x', 'a'); tmp.put('A', 'ł'); tmp.put('D', 'F'); tmp.put('J', 'k'); tmp.put('L', ','); tmp.put('O', 'A'); tmp.put('W', 's'); tmp.put('t', 't'); tmp.put('i', 'r'); tmp.put('n', 'o'); tmp.put('Z', 'n'); tmp.put('G', 'm'); tmp.put('Q', 'I'); tmp.put('H', 'f'); tmp.put('U', 'S'); tmp.put('P', 'w'); tmp.put('r', 'e'); tmp.put('R', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'k'); tmp.put('y', 'y'); tmp.put('d', 'p'); tmp.put('z', 'j'); tmp.put('i', 'f'); tmp.put('a', 'x'); tmp.put('ł', 'A'); tmp.put('F', 'D'); tmp.put('k', 'J'); tmp.put(',', 'L'); tmp.put('A', 'O'); tmp.put('s', 'W'); tmp.put('t', 't'); tmp.put('r', 'i'); tmp.put('o', 'n'); tmp.put('n', 'Z'); tmp.put('m', 'G'); tmp.put('I', 'Q'); tmp.put('f', 'H'); tmp.put('S', 'U'); tmp.put('w', 'P'); tmp.put('e', 'r'); tmp.put('j', 'R');
        goodDecode.add(tmp);
        // TEST 26
        good.add("    xAJlira\nXilAZie         ngzRfmfLii\n\n\ni     dmPfRLrzAZi\n\nDzfgfVrmCs      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('x', 'W'); tmp.put('A', 'y'); tmp.put('J', 'd'); tmp.put('l', 'z'); tmp.put('i', 'i'); tmp.put('r', 'a'); tmp.put('a', 'ł'); tmp.put('X', 'F'); tmp.put('Z', 'k'); tmp.put('e', ','); tmp.put('n', 'A'); tmp.put('g', 's'); tmp.put('z', 't'); tmp.put('R', 'r'); tmp.put('f', 'o'); tmp.put('m', 'n'); tmp.put('L', 'm'); tmp.put('d', 'I'); tmp.put('P', 'f'); tmp.put('D', 'S'); tmp.put('V', 'w'); tmp.put('C', 'e'); tmp.put('s', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'x'); tmp.put('y', 'A'); tmp.put('d', 'J'); tmp.put('z', 'l'); tmp.put('i', 'i'); tmp.put('a', 'r'); tmp.put('ł', 'a'); tmp.put('F', 'X'); tmp.put('k', 'Z'); tmp.put(',', 'e'); tmp.put('A', 'n'); tmp.put('s', 'g'); tmp.put('t', 'z'); tmp.put('r', 'R'); tmp.put('o', 'f'); tmp.put('n', 'm'); tmp.put('m', 'L'); tmp.put('I', 'd'); tmp.put('f', 'P'); tmp.put('S', 'D'); tmp.put('w', 'V'); tmp.put('e', 'C'); tmp.put('j', 's');
        goodDecode.add(tmp);
        // TEST 27
        good.add("\n\n\nzHoxEZn         iExHdEk   wcFłWAWQEE        E lAjWłQZFHdE  sFWcWNZAKy\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('H', 'y'); tmp.put('o', 'd'); tmp.put('x', 'z'); tmp.put('E', 'i'); tmp.put('Z', 'a'); tmp.put('n', 'ł'); tmp.put('i', 'F'); tmp.put('d', 'k'); tmp.put('k', ','); tmp.put('w', 'A'); tmp.put('c', 's'); tmp.put('F', 't'); tmp.put('ł', 'r'); tmp.put('W', 'o'); tmp.put('A', 'n'); tmp.put('Q', 'm'); tmp.put('l', 'I'); tmp.put('j', 'f'); tmp.put('s', 'S'); tmp.put('N', 'w'); tmp.put('K', 'e'); tmp.put('y', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'H'); tmp.put('d', 'o'); tmp.put('z', 'x'); tmp.put('i', 'E'); tmp.put('a', 'Z'); tmp.put('ł', 'n'); tmp.put('F', 'i'); tmp.put('k', 'd'); tmp.put(',', 'k'); tmp.put('A', 'w'); tmp.put('s', 'c'); tmp.put('t', 'F'); tmp.put('r', 'ł'); tmp.put('o', 'W'); tmp.put('n', 'A'); tmp.put('m', 'Q'); tmp.put('I', 'l'); tmp.put('f', 'j'); tmp.put('S', 's'); tmp.put('w', 'N'); tmp.put('e', 'K'); tmp.put('j', 'y');
        goodDecode.add(tmp);
        // TEST 28
        good.add("     AUmMknF        xkMUTkq     ,zZvHQHgkk\nk\nRQBHvgnZUTk   GZHzHhnQfb    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('A', 'W'); tmp.put('U', 'y'); tmp.put('m', 'd'); tmp.put('M', 'z'); tmp.put('k', 'i'); tmp.put('n', 'a'); tmp.put('F', 'ł'); tmp.put('x', 'F'); tmp.put('T', 'k'); tmp.put('q', ','); tmp.put(',', 'A'); tmp.put('z', 's'); tmp.put('Z', 't'); tmp.put('v', 'r'); tmp.put('H', 'o'); tmp.put('Q', 'n'); tmp.put('g', 'm'); tmp.put('R', 'I'); tmp.put('B', 'f'); tmp.put('G', 'S'); tmp.put('h', 'w'); tmp.put('f', 'e'); tmp.put('b', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'A'); tmp.put('y', 'U'); tmp.put('d', 'm'); tmp.put('z', 'M'); tmp.put('i', 'k'); tmp.put('a', 'n'); tmp.put('ł', 'F'); tmp.put('F', 'x'); tmp.put('k', 'T'); tmp.put(',', 'q'); tmp.put('A', ','); tmp.put('s', 'z'); tmp.put('t', 'Z'); tmp.put('r', 'v'); tmp.put('o', 'H'); tmp.put('n', 'Q'); tmp.put('m', 'g'); tmp.put('I', 'R'); tmp.put('f', 'B'); tmp.put('S', 'G'); tmp.put('w', 'h'); tmp.put('e', 'f'); tmp.put('j', 'b');
        goodDecode.add(tmp);
        // TEST 29
        good.add("          ZMztIwł       yItMHI,     TaFSbubNII   I    punbSNwFMHI      vFbabRwusJ    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('Z', 'W'); tmp.put('M', 'y'); tmp.put('z', 'd'); tmp.put('t', 'z'); tmp.put('I', 'i'); tmp.put('w', 'a'); tmp.put('ł', 'ł'); tmp.put('y', 'F'); tmp.put('H', 'k'); tmp.put(',', ','); tmp.put('T', 'A'); tmp.put('a', 's'); tmp.put('F', 't'); tmp.put('S', 'r'); tmp.put('b', 'o'); tmp.put('u', 'n'); tmp.put('N', 'm'); tmp.put('p', 'I'); tmp.put('n', 'f'); tmp.put('v', 'S'); tmp.put('R', 'w'); tmp.put('s', 'e'); tmp.put('J', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'Z'); tmp.put('y', 'M'); tmp.put('d', 'z'); tmp.put('z', 't'); tmp.put('i', 'I'); tmp.put('a', 'w'); tmp.put('ł', 'ł'); tmp.put('F', 'y'); tmp.put('k', 'H'); tmp.put(',', ','); tmp.put('A', 'T'); tmp.put('s', 'a'); tmp.put('t', 'F'); tmp.put('r', 'S'); tmp.put('o', 'b'); tmp.put('n', 'u'); tmp.put('m', 'N'); tmp.put('I', 'p'); tmp.put('f', 'n'); tmp.put('S', 'v'); tmp.put('w', 'R'); tmp.put('e', 's'); tmp.put('j', 'J');
        goodDecode.add(tmp);
        // TEST 30
        good.add("\n\nlwKEnbM    WnEwfnA\n\ntzPiYHYenn         n   CHLYiebPwfn     oPYzYsbHpT    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('l', 'W'); tmp.put('w', 'y'); tmp.put('K', 'd'); tmp.put('E', 'z'); tmp.put('n', 'i'); tmp.put('b', 'a'); tmp.put('M', 'ł'); tmp.put('W', 'F'); tmp.put('f', 'k'); tmp.put('A', ','); tmp.put('t', 'A'); tmp.put('z', 's'); tmp.put('P', 't'); tmp.put('i', 'r'); tmp.put('Y', 'o'); tmp.put('H', 'n'); tmp.put('e', 'm'); tmp.put('C', 'I'); tmp.put('L', 'f'); tmp.put('o', 'S'); tmp.put('s', 'w'); tmp.put('p', 'e'); tmp.put('T', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'l'); tmp.put('y', 'w'); tmp.put('d', 'K'); tmp.put('z', 'E'); tmp.put('i', 'n'); tmp.put('a', 'b'); tmp.put('ł', 'M'); tmp.put('F', 'W'); tmp.put('k', 'f'); tmp.put(',', 'A'); tmp.put('A', 't'); tmp.put('s', 'z'); tmp.put('t', 'P'); tmp.put('r', 'i'); tmp.put('o', 'Y'); tmp.put('n', 'H'); tmp.put('m', 'e'); tmp.put('I', 'C'); tmp.put('f', 'L'); tmp.put('S', 'o'); tmp.put('w', 's'); tmp.put('e', 'p'); tmp.put('j', 'T');
        goodDecode.add(tmp);
        // TEST 31
        good.add("\n\n\nFłsBGYZ\n\nPGBłWGi     yajVbQbqGG\n\nG\nEQAbVqYjłWG         gjbabpYQof        ");
        tmp = new HashMap<Character, Character>();
        tmp.put('F', 'W'); tmp.put('ł', 'y'); tmp.put('s', 'd'); tmp.put('B', 'z'); tmp.put('G', 'i'); tmp.put('Y', 'a'); tmp.put('Z', 'ł'); tmp.put('P', 'F'); tmp.put('W', 'k'); tmp.put('i', ','); tmp.put('y', 'A'); tmp.put('a', 's'); tmp.put('j', 't'); tmp.put('V', 'r'); tmp.put('b', 'o'); tmp.put('Q', 'n'); tmp.put('q', 'm'); tmp.put('E', 'I'); tmp.put('A', 'f'); tmp.put('g', 'S'); tmp.put('p', 'w'); tmp.put('o', 'e'); tmp.put('f', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'F'); tmp.put('y', 'ł'); tmp.put('d', 's'); tmp.put('z', 'B'); tmp.put('i', 'G'); tmp.put('a', 'Y'); tmp.put('ł', 'Z'); tmp.put('F', 'P'); tmp.put('k', 'W'); tmp.put(',', 'i'); tmp.put('A', 'y'); tmp.put('s', 'a'); tmp.put('t', 'j'); tmp.put('r', 'V'); tmp.put('o', 'b'); tmp.put('n', 'Q'); tmp.put('m', 'q'); tmp.put('I', 'E'); tmp.put('f', 'A'); tmp.put('S', 'g'); tmp.put('w', 'p'); tmp.put('e', 'o'); tmp.put('j', 'f');
        goodDecode.add(tmp);
        // TEST 32
        good.add("        FoPRTHr uTRołT,  dJGLEKEgTT       T          bKBELgHGołT     pGEJESHKMe       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('F', 'W'); tmp.put('o', 'y'); tmp.put('P', 'd'); tmp.put('R', 'z'); tmp.put('T', 'i'); tmp.put('H', 'a'); tmp.put('r', 'ł'); tmp.put('u', 'F'); tmp.put('ł', 'k'); tmp.put(',', ','); tmp.put('d', 'A'); tmp.put('J', 's'); tmp.put('G', 't'); tmp.put('L', 'r'); tmp.put('E', 'o'); tmp.put('K', 'n'); tmp.put('g', 'm'); tmp.put('b', 'I'); tmp.put('B', 'f'); tmp.put('p', 'S'); tmp.put('S', 'w'); tmp.put('M', 'e'); tmp.put('e', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'F'); tmp.put('y', 'o'); tmp.put('d', 'P'); tmp.put('z', 'R'); tmp.put('i', 'T'); tmp.put('a', 'H'); tmp.put('ł', 'r'); tmp.put('F', 'u'); tmp.put('k', 'ł'); tmp.put(',', ','); tmp.put('A', 'd'); tmp.put('s', 'J'); tmp.put('t', 'G'); tmp.put('r', 'L'); tmp.put('o', 'E'); tmp.put('n', 'K'); tmp.put('m', 'g'); tmp.put('I', 'b'); tmp.put('f', 'B'); tmp.put('S', 'p'); tmp.put('w', 'S'); tmp.put('e', 'M'); tmp.put('j', 'e');
        goodDecode.add(tmp);
        // TEST 33
        good.add("         SgLUCfP          GCUgcCd\nQłnARaRjCC        C        lawRAjfngcC xnRłREfasz    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('g', 'y'); tmp.put('L', 'd'); tmp.put('U', 'z'); tmp.put('C', 'i'); tmp.put('f', 'a'); tmp.put('P', 'ł'); tmp.put('G', 'F'); tmp.put('c', 'k'); tmp.put('d', ','); tmp.put('Q', 'A'); tmp.put('ł', 's'); tmp.put('n', 't'); tmp.put('A', 'r'); tmp.put('R', 'o'); tmp.put('a', 'n'); tmp.put('j', 'm'); tmp.put('l', 'I'); tmp.put('w', 'f'); tmp.put('x', 'S'); tmp.put('E', 'w'); tmp.put('s', 'e'); tmp.put('z', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'g'); tmp.put('d', 'L'); tmp.put('z', 'U'); tmp.put('i', 'C'); tmp.put('a', 'f'); tmp.put('ł', 'P'); tmp.put('F', 'G'); tmp.put('k', 'c'); tmp.put(',', 'd'); tmp.put('A', 'Q'); tmp.put('s', 'ł'); tmp.put('t', 'n'); tmp.put('r', 'A'); tmp.put('o', 'R'); tmp.put('n', 'a'); tmp.put('m', 'j'); tmp.put('I', 'l'); tmp.put('f', 'w'); tmp.put('S', 'x'); tmp.put('w', 'E'); tmp.put('e', 's'); tmp.put('j', 'z');
        goodDecode.add(tmp);
        // TEST 34
        good.add("  dłI,BoH    gB,łuBe          CplhOvOQBB         B\nFvXOhQolłuB    AlOpOLovKY         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('d', 'W'); tmp.put('ł', 'y'); tmp.put('I', 'd'); tmp.put(',', 'z'); tmp.put('B', 'i'); tmp.put('o', 'a'); tmp.put('H', 'ł'); tmp.put('g', 'F'); tmp.put('u', 'k'); tmp.put('e', ','); tmp.put('C', 'A'); tmp.put('p', 's'); tmp.put('l', 't'); tmp.put('h', 'r'); tmp.put('O', 'o'); tmp.put('v', 'n'); tmp.put('Q', 'm'); tmp.put('F', 'I'); tmp.put('X', 'f'); tmp.put('A', 'S'); tmp.put('L', 'w'); tmp.put('K', 'e'); tmp.put('Y', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'd'); tmp.put('y', 'ł'); tmp.put('d', 'I'); tmp.put('z', ','); tmp.put('i', 'B'); tmp.put('a', 'o'); tmp.put('ł', 'H'); tmp.put('F', 'g'); tmp.put('k', 'u'); tmp.put(',', 'e'); tmp.put('A', 'C'); tmp.put('s', 'p'); tmp.put('t', 'l'); tmp.put('r', 'h'); tmp.put('o', 'O'); tmp.put('n', 'v'); tmp.put('m', 'Q'); tmp.put('I', 'F'); tmp.put('f', 'X'); tmp.put('S', 'A'); tmp.put('w', 'L'); tmp.put('e', 'K'); tmp.put('j', 'Y');
        goodDecode.add(tmp);
        // TEST 35
        good.add(" ycNFitv        biFcsir QkGChIhMii        i          AIlhCMtGcsi OGhkhKtIo,       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('y', 'W'); tmp.put('c', 'y'); tmp.put('N', 'd'); tmp.put('F', 'z'); tmp.put('i', 'i'); tmp.put('t', 'a'); tmp.put('v', 'ł'); tmp.put('b', 'F'); tmp.put('s', 'k'); tmp.put('r', ','); tmp.put('Q', 'A'); tmp.put('k', 's'); tmp.put('G', 't'); tmp.put('C', 'r'); tmp.put('h', 'o'); tmp.put('I', 'n'); tmp.put('M', 'm'); tmp.put('A', 'I'); tmp.put('l', 'f'); tmp.put('O', 'S'); tmp.put('K', 'w'); tmp.put('o', 'e'); tmp.put(',', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'y'); tmp.put('y', 'c'); tmp.put('d', 'N'); tmp.put('z', 'F'); tmp.put('i', 'i'); tmp.put('a', 't'); tmp.put('ł', 'v'); tmp.put('F', 'b'); tmp.put('k', 's'); tmp.put(',', 'r'); tmp.put('A', 'Q'); tmp.put('s', 'k'); tmp.put('t', 'G'); tmp.put('r', 'C'); tmp.put('o', 'h'); tmp.put('n', 'I'); tmp.put('m', 'M'); tmp.put('I', 'A'); tmp.put('f', 'l'); tmp.put('S', 'O'); tmp.put('w', 'K'); tmp.put('e', 'o'); tmp.put('j', ',');
        goodDecode.add(tmp);
        // TEST 36
        good.add("\n\n\nTFsdZcN EZdFUZp\njvngPhPqZZ\nZ       Ch,PgqcnFUZ       QnPvPYchtk ");
        tmp = new HashMap<Character, Character>();
        tmp.put('T', 'W'); tmp.put('F', 'y'); tmp.put('s', 'd'); tmp.put('d', 'z'); tmp.put('Z', 'i'); tmp.put('c', 'a'); tmp.put('N', 'ł'); tmp.put('E', 'F'); tmp.put('U', 'k'); tmp.put('p', ','); tmp.put('j', 'A'); tmp.put('v', 's'); tmp.put('n', 't'); tmp.put('g', 'r'); tmp.put('P', 'o'); tmp.put('h', 'n'); tmp.put('q', 'm'); tmp.put('C', 'I'); tmp.put(',', 'f'); tmp.put('Q', 'S'); tmp.put('Y', 'w'); tmp.put('t', 'e'); tmp.put('k', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'T'); tmp.put('y', 'F'); tmp.put('d', 's'); tmp.put('z', 'd'); tmp.put('i', 'Z'); tmp.put('a', 'c'); tmp.put('ł', 'N'); tmp.put('F', 'E'); tmp.put('k', 'U'); tmp.put(',', 'p'); tmp.put('A', 'j'); tmp.put('s', 'v'); tmp.put('t', 'n'); tmp.put('r', 'g'); tmp.put('o', 'P'); tmp.put('n', 'h'); tmp.put('m', 'q'); tmp.put('I', 'C'); tmp.put('f', ','); tmp.put('S', 'Q'); tmp.put('w', 'Y'); tmp.put('e', 't'); tmp.put('j', 'k');
        goodDecode.add(tmp);
        // TEST 37
        good.add("         zvopZGA     DZpvlZK  VRFjOrOdZZ       Z          PrSOjdGFvlZ\n\nTFOROLGrUB\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('v', 'y'); tmp.put('o', 'd'); tmp.put('p', 'z'); tmp.put('Z', 'i'); tmp.put('G', 'a'); tmp.put('A', 'ł'); tmp.put('D', 'F'); tmp.put('l', 'k'); tmp.put('K', ','); tmp.put('V', 'A'); tmp.put('R', 's'); tmp.put('F', 't'); tmp.put('j', 'r'); tmp.put('O', 'o'); tmp.put('r', 'n'); tmp.put('d', 'm'); tmp.put('P', 'I'); tmp.put('S', 'f'); tmp.put('T', 'S'); tmp.put('L', 'w'); tmp.put('U', 'e'); tmp.put('B', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'v'); tmp.put('d', 'o'); tmp.put('z', 'p'); tmp.put('i', 'Z'); tmp.put('a', 'G'); tmp.put('ł', 'A'); tmp.put('F', 'D'); tmp.put('k', 'l'); tmp.put(',', 'K'); tmp.put('A', 'V'); tmp.put('s', 'R'); tmp.put('t', 'F'); tmp.put('r', 'j'); tmp.put('o', 'O'); tmp.put('n', 'r'); tmp.put('m', 'd'); tmp.put('I', 'P'); tmp.put('f', 'S'); tmp.put('S', 'T'); tmp.put('w', 'L'); tmp.put('e', 'U'); tmp.put('j', 'B');
        goodDecode.add(tmp);
        // TEST 38
        good.add("       XDOLUHF    PULDeUS     łE,udjdTUU      U ljBduTH,DeU q,dEdIHjWi          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('X', 'W'); tmp.put('D', 'y'); tmp.put('O', 'd'); tmp.put('L', 'z'); tmp.put('U', 'i'); tmp.put('H', 'a'); tmp.put('F', 'ł'); tmp.put('P', 'F'); tmp.put('e', 'k'); tmp.put('S', ','); tmp.put('ł', 'A'); tmp.put('E', 's'); tmp.put(',', 't'); tmp.put('u', 'r'); tmp.put('d', 'o'); tmp.put('j', 'n'); tmp.put('T', 'm'); tmp.put('l', 'I'); tmp.put('B', 'f'); tmp.put('q', 'S'); tmp.put('I', 'w'); tmp.put('W', 'e'); tmp.put('i', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'X'); tmp.put('y', 'D'); tmp.put('d', 'O'); tmp.put('z', 'L'); tmp.put('i', 'U'); tmp.put('a', 'H'); tmp.put('ł', 'F'); tmp.put('F', 'P'); tmp.put('k', 'e'); tmp.put(',', 'S'); tmp.put('A', 'ł'); tmp.put('s', 'E'); tmp.put('t', ','); tmp.put('r', 'u'); tmp.put('o', 'd'); tmp.put('n', 'j'); tmp.put('m', 'T'); tmp.put('I', 'l'); tmp.put('f', 'B'); tmp.put('S', 'q'); tmp.put('w', 'I'); tmp.put('e', 'W'); tmp.put('j', 'i');
        goodDecode.add(tmp);
        // TEST 39
        good.add("         KuS,Rkm  LR,uMRX         FCOzNeNwRR R      reHNzwkOuMR         sONCNPkehv     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('K', 'W'); tmp.put('u', 'y'); tmp.put('S', 'd'); tmp.put(',', 'z'); tmp.put('R', 'i'); tmp.put('k', 'a'); tmp.put('m', 'ł'); tmp.put('L', 'F'); tmp.put('M', 'k'); tmp.put('X', ','); tmp.put('F', 'A'); tmp.put('C', 's'); tmp.put('O', 't'); tmp.put('z', 'r'); tmp.put('N', 'o'); tmp.put('e', 'n'); tmp.put('w', 'm'); tmp.put('r', 'I'); tmp.put('H', 'f'); tmp.put('s', 'S'); tmp.put('P', 'w'); tmp.put('h', 'e'); tmp.put('v', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'K'); tmp.put('y', 'u'); tmp.put('d', 'S'); tmp.put('z', ','); tmp.put('i', 'R'); tmp.put('a', 'k'); tmp.put('ł', 'm'); tmp.put('F', 'L'); tmp.put('k', 'M'); tmp.put(',', 'X'); tmp.put('A', 'F'); tmp.put('s', 'C'); tmp.put('t', 'O'); tmp.put('r', 'z'); tmp.put('o', 'N'); tmp.put('n', 'e'); tmp.put('m', 'w'); tmp.put('I', 'r'); tmp.put('f', 'H'); tmp.put('S', 's'); tmp.put('w', 'P'); tmp.put('e', 'h'); tmp.put('j', 'v');
        goodDecode.add(tmp);
        // TEST 40
        good.add("        NnTbVSQ  dVbnIVt       FyłrXYXfVV    V          AYUXrfSłnIV\n\nGłXyXmSYRe          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('N', 'W'); tmp.put('n', 'y'); tmp.put('T', 'd'); tmp.put('b', 'z'); tmp.put('V', 'i'); tmp.put('S', 'a'); tmp.put('Q', 'ł'); tmp.put('d', 'F'); tmp.put('I', 'k'); tmp.put('t', ','); tmp.put('F', 'A'); tmp.put('y', 's'); tmp.put('ł', 't'); tmp.put('r', 'r'); tmp.put('X', 'o'); tmp.put('Y', 'n'); tmp.put('f', 'm'); tmp.put('A', 'I'); tmp.put('U', 'f'); tmp.put('G', 'S'); tmp.put('m', 'w'); tmp.put('R', 'e'); tmp.put('e', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'N'); tmp.put('y', 'n'); tmp.put('d', 'T'); tmp.put('z', 'b'); tmp.put('i', 'V'); tmp.put('a', 'S'); tmp.put('ł', 'Q'); tmp.put('F', 'd'); tmp.put('k', 'I'); tmp.put(',', 't'); tmp.put('A', 'F'); tmp.put('s', 'y'); tmp.put('t', 'ł'); tmp.put('r', 'r'); tmp.put('o', 'X'); tmp.put('n', 'Y'); tmp.put('m', 'f'); tmp.put('I', 'A'); tmp.put('f', 'U'); tmp.put('S', 'G'); tmp.put('w', 'm'); tmp.put('e', 'R'); tmp.put('j', 'e');
        goodDecode.add(tmp);
        // TEST 41
        good.add(" SpzBsml\n\n\nfsBpisn       IbZcJoJrss  s          XoVJcrmZpis   PZJbJemo,Y ");
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('p', 'y'); tmp.put('z', 'd'); tmp.put('B', 'z'); tmp.put('s', 'i'); tmp.put('m', 'a'); tmp.put('l', 'ł'); tmp.put('f', 'F'); tmp.put('i', 'k'); tmp.put('n', ','); tmp.put('I', 'A'); tmp.put('b', 's'); tmp.put('Z', 't'); tmp.put('c', 'r'); tmp.put('J', 'o'); tmp.put('o', 'n'); tmp.put('r', 'm'); tmp.put('X', 'I'); tmp.put('V', 'f'); tmp.put('P', 'S'); tmp.put('e', 'w'); tmp.put(',', 'e'); tmp.put('Y', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'p'); tmp.put('d', 'z'); tmp.put('z', 'B'); tmp.put('i', 's'); tmp.put('a', 'm'); tmp.put('ł', 'l'); tmp.put('F', 'f'); tmp.put('k', 'i'); tmp.put(',', 'n'); tmp.put('A', 'I'); tmp.put('s', 'b'); tmp.put('t', 'Z'); tmp.put('r', 'c'); tmp.put('o', 'J'); tmp.put('n', 'o'); tmp.put('m', 'r'); tmp.put('I', 'X'); tmp.put('f', 'V'); tmp.put('S', 'P'); tmp.put('w', 'e'); tmp.put('e', ','); tmp.put('j', 'Y');
        goodDecode.add(tmp);
        // TEST 42
        good.add("    MmCd,yb  I,dmU,L\nonFSrfrW,,        ,      xfprSWyFmU,     aFrnrByfct  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('M', 'W'); tmp.put('m', 'y'); tmp.put('C', 'd'); tmp.put('d', 'z'); tmp.put(',', 'i'); tmp.put('y', 'a'); tmp.put('b', 'ł'); tmp.put('I', 'F'); tmp.put('U', 'k'); tmp.put('L', ','); tmp.put('o', 'A'); tmp.put('n', 's'); tmp.put('F', 't'); tmp.put('S', 'r'); tmp.put('r', 'o'); tmp.put('f', 'n'); tmp.put('W', 'm'); tmp.put('x', 'I'); tmp.put('p', 'f'); tmp.put('a', 'S'); tmp.put('B', 'w'); tmp.put('c', 'e'); tmp.put('t', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'M'); tmp.put('y', 'm'); tmp.put('d', 'C'); tmp.put('z', 'd'); tmp.put('i', ','); tmp.put('a', 'y'); tmp.put('ł', 'b'); tmp.put('F', 'I'); tmp.put('k', 'U'); tmp.put(',', 'L'); tmp.put('A', 'o'); tmp.put('s', 'n'); tmp.put('t', 'F'); tmp.put('r', 'S'); tmp.put('o', 'r'); tmp.put('n', 'f'); tmp.put('m', 'W'); tmp.put('I', 'x'); tmp.put('f', 'p'); tmp.put('S', 'a'); tmp.put('w', 'B'); tmp.put('e', 'c'); tmp.put('j', 't');
        goodDecode.add(tmp);
        // TEST 43
        good.add("        g,Bhadt         Vah,uaY  HcnWmomRaa  a    losmWRdn,ua\n\n\nxnmcmQdorN          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('g', 'W'); tmp.put(',', 'y'); tmp.put('B', 'd'); tmp.put('h', 'z'); tmp.put('a', 'i'); tmp.put('d', 'a'); tmp.put('t', 'ł'); tmp.put('V', 'F'); tmp.put('u', 'k'); tmp.put('Y', ','); tmp.put('H', 'A'); tmp.put('c', 's'); tmp.put('n', 't'); tmp.put('W', 'r'); tmp.put('m', 'o'); tmp.put('o', 'n'); tmp.put('R', 'm'); tmp.put('l', 'I'); tmp.put('s', 'f'); tmp.put('x', 'S'); tmp.put('Q', 'w'); tmp.put('r', 'e'); tmp.put('N', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'g'); tmp.put('y', ','); tmp.put('d', 'B'); tmp.put('z', 'h'); tmp.put('i', 'a'); tmp.put('a', 'd'); tmp.put('ł', 't'); tmp.put('F', 'V'); tmp.put('k', 'u'); tmp.put(',', 'Y'); tmp.put('A', 'H'); tmp.put('s', 'c'); tmp.put('t', 'n'); tmp.put('r', 'W'); tmp.put('o', 'm'); tmp.put('n', 'o'); tmp.put('m', 'R'); tmp.put('I', 'l'); tmp.put('f', 's'); tmp.put('S', 'x'); tmp.put('w', 'Q'); tmp.put('e', 'r'); tmp.put('j', 'N');
        goodDecode.add(tmp);
        // TEST 44
        good.add("  eJQFVIv\n\n\nAVFJoVs     ufqbWXWzVV\n\nV        pXPWbzIqJoV      SqWfWmIXLC       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('e', 'W'); tmp.put('J', 'y'); tmp.put('Q', 'd'); tmp.put('F', 'z'); tmp.put('V', 'i'); tmp.put('I', 'a'); tmp.put('v', 'ł'); tmp.put('A', 'F'); tmp.put('o', 'k'); tmp.put('s', ','); tmp.put('u', 'A'); tmp.put('f', 's'); tmp.put('q', 't'); tmp.put('b', 'r'); tmp.put('W', 'o'); tmp.put('X', 'n'); tmp.put('z', 'm'); tmp.put('p', 'I'); tmp.put('P', 'f'); tmp.put('S', 'S'); tmp.put('m', 'w'); tmp.put('L', 'e'); tmp.put('C', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'e'); tmp.put('y', 'J'); tmp.put('d', 'Q'); tmp.put('z', 'F'); tmp.put('i', 'V'); tmp.put('a', 'I'); tmp.put('ł', 'v'); tmp.put('F', 'A'); tmp.put('k', 'o'); tmp.put(',', 's'); tmp.put('A', 'u'); tmp.put('s', 'f'); tmp.put('t', 'q'); tmp.put('r', 'b'); tmp.put('o', 'W'); tmp.put('n', 'X'); tmp.put('m', 'z'); tmp.put('I', 'p'); tmp.put('f', 'P'); tmp.put('S', 'S'); tmp.put('w', 'm'); tmp.put('e', 'L'); tmp.put('j', 'C');
        goodDecode.add(tmp);
        // TEST 45
        good.add("  KdQCmłl\n\n\nHmCdNmR          VoEAYZYMmm     m        sZWYAMłEdNm\npEYoYkłZvz     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('K', 'W'); tmp.put('d', 'y'); tmp.put('Q', 'd'); tmp.put('C', 'z'); tmp.put('m', 'i'); tmp.put('ł', 'a'); tmp.put('l', 'ł'); tmp.put('H', 'F'); tmp.put('N', 'k'); tmp.put('R', ','); tmp.put('V', 'A'); tmp.put('o', 's'); tmp.put('E', 't'); tmp.put('A', 'r'); tmp.put('Y', 'o'); tmp.put('Z', 'n'); tmp.put('M', 'm'); tmp.put('s', 'I'); tmp.put('W', 'f'); tmp.put('p', 'S'); tmp.put('k', 'w'); tmp.put('v', 'e'); tmp.put('z', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'K'); tmp.put('y', 'd'); tmp.put('d', 'Q'); tmp.put('z', 'C'); tmp.put('i', 'm'); tmp.put('a', 'ł'); tmp.put('ł', 'l'); tmp.put('F', 'H'); tmp.put('k', 'N'); tmp.put(',', 'R'); tmp.put('A', 'V'); tmp.put('s', 'o'); tmp.put('t', 'E'); tmp.put('r', 'A'); tmp.put('o', 'Y'); tmp.put('n', 'Z'); tmp.put('m', 'M'); tmp.put('I', 's'); tmp.put('f', 'W'); tmp.put('S', 'p'); tmp.put('w', 'k'); tmp.put('e', 'v'); tmp.put('j', 'z');
        goodDecode.add(tmp);
        // TEST 46
        good.add("\n\nOxuboHe\n\n\nwobxWoz       PlTikrkYoo o\n\n\nBrgkiYHTxWo         hTklkaHrnd\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('O', 'W'); tmp.put('x', 'y'); tmp.put('u', 'd'); tmp.put('b', 'z'); tmp.put('o', 'i'); tmp.put('H', 'a'); tmp.put('e', 'ł'); tmp.put('w', 'F'); tmp.put('W', 'k'); tmp.put('z', ','); tmp.put('P', 'A'); tmp.put('l', 's'); tmp.put('T', 't'); tmp.put('i', 'r'); tmp.put('k', 'o'); tmp.put('r', 'n'); tmp.put('Y', 'm'); tmp.put('B', 'I'); tmp.put('g', 'f'); tmp.put('h', 'S'); tmp.put('a', 'w'); tmp.put('n', 'e'); tmp.put('d', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'O'); tmp.put('y', 'x'); tmp.put('d', 'u'); tmp.put('z', 'b'); tmp.put('i', 'o'); tmp.put('a', 'H'); tmp.put('ł', 'e'); tmp.put('F', 'w'); tmp.put('k', 'W'); tmp.put(',', 'z'); tmp.put('A', 'P'); tmp.put('s', 'l'); tmp.put('t', 'T'); tmp.put('r', 'i'); tmp.put('o', 'k'); tmp.put('n', 'r'); tmp.put('m', 'Y'); tmp.put('I', 'B'); tmp.put('f', 'g'); tmp.put('S', 'h'); tmp.put('w', 'a'); tmp.put('e', 'n'); tmp.put('j', 'd');
        goodDecode.add(tmp);
        // TEST 47
        good.add("     OgFEWHw\n\n\nzWEgPWa         lIujtstqWW        W   NsGtjqHugPW   hutItDHsmc   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('O', 'W'); tmp.put('g', 'y'); tmp.put('F', 'd'); tmp.put('E', 'z'); tmp.put('W', 'i'); tmp.put('H', 'a'); tmp.put('w', 'ł'); tmp.put('z', 'F'); tmp.put('P', 'k'); tmp.put('a', ','); tmp.put('l', 'A'); tmp.put('I', 's'); tmp.put('u', 't'); tmp.put('j', 'r'); tmp.put('t', 'o'); tmp.put('s', 'n'); tmp.put('q', 'm'); tmp.put('N', 'I'); tmp.put('G', 'f'); tmp.put('h', 'S'); tmp.put('D', 'w'); tmp.put('m', 'e'); tmp.put('c', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'O'); tmp.put('y', 'g'); tmp.put('d', 'F'); tmp.put('z', 'E'); tmp.put('i', 'W'); tmp.put('a', 'H'); tmp.put('ł', 'w'); tmp.put('F', 'z'); tmp.put('k', 'P'); tmp.put(',', 'a'); tmp.put('A', 'l'); tmp.put('s', 'I'); tmp.put('t', 'u'); tmp.put('r', 'j'); tmp.put('o', 't'); tmp.put('n', 's'); tmp.put('m', 'q'); tmp.put('I', 'N'); tmp.put('f', 'G'); tmp.put('S', 'h'); tmp.put('w', 'D'); tmp.put('e', 'm'); tmp.put('j', 'c');
        goodDecode.add(tmp);
        // TEST 48
        good.add("       OdxBMWa\nVMBdTMł      AfFNwpwhMM         M          XpRwNhWFdTM    gFwfwvWpks\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('O', 'W'); tmp.put('d', 'y'); tmp.put('x', 'd'); tmp.put('B', 'z'); tmp.put('M', 'i'); tmp.put('W', 'a'); tmp.put('a', 'ł'); tmp.put('V', 'F'); tmp.put('T', 'k'); tmp.put('ł', ','); tmp.put('A', 'A'); tmp.put('f', 's'); tmp.put('F', 't'); tmp.put('N', 'r'); tmp.put('w', 'o'); tmp.put('p', 'n'); tmp.put('h', 'm'); tmp.put('X', 'I'); tmp.put('R', 'f'); tmp.put('g', 'S'); tmp.put('v', 'w'); tmp.put('k', 'e'); tmp.put('s', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'O'); tmp.put('y', 'd'); tmp.put('d', 'x'); tmp.put('z', 'B'); tmp.put('i', 'M'); tmp.put('a', 'W'); tmp.put('ł', 'a'); tmp.put('F', 'V'); tmp.put('k', 'T'); tmp.put(',', 'ł'); tmp.put('A', 'A'); tmp.put('s', 'f'); tmp.put('t', 'F'); tmp.put('r', 'N'); tmp.put('o', 'w'); tmp.put('n', 'p'); tmp.put('m', 'h'); tmp.put('I', 'X'); tmp.put('f', 'R'); tmp.put('S', 'g'); tmp.put('w', 'v'); tmp.put('e', 'k'); tmp.put('j', 's');
        goodDecode.add(tmp);
        // TEST 49
        good.add("          nEWłLNM      PLłECLO      gfbyaRaqLL       L\n\njRiayqNbECL          AbafauNRwd\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('n', 'W'); tmp.put('E', 'y'); tmp.put('W', 'd'); tmp.put('ł', 'z'); tmp.put('L', 'i'); tmp.put('N', 'a'); tmp.put('M', 'ł'); tmp.put('P', 'F'); tmp.put('C', 'k'); tmp.put('O', ','); tmp.put('g', 'A'); tmp.put('f', 's'); tmp.put('b', 't'); tmp.put('y', 'r'); tmp.put('a', 'o'); tmp.put('R', 'n'); tmp.put('q', 'm'); tmp.put('j', 'I'); tmp.put('i', 'f'); tmp.put('A', 'S'); tmp.put('u', 'w'); tmp.put('w', 'e'); tmp.put('d', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'n'); tmp.put('y', 'E'); tmp.put('d', 'W'); tmp.put('z', 'ł'); tmp.put('i', 'L'); tmp.put('a', 'N'); tmp.put('ł', 'M'); tmp.put('F', 'P'); tmp.put('k', 'C'); tmp.put(',', 'O'); tmp.put('A', 'g'); tmp.put('s', 'f'); tmp.put('t', 'b'); tmp.put('r', 'y'); tmp.put('o', 'a'); tmp.put('n', 'R'); tmp.put('m', 'q'); tmp.put('I', 'j'); tmp.put('f', 'i'); tmp.put('S', 'A'); tmp.put('w', 'u'); tmp.put('e', 'w'); tmp.put('j', 'd');
        goodDecode.add(tmp);
        // TEST 50
        good.add("\n\nSnhciFV\n\n\nTicnWib        sXvdoQoYii\ni\naQCodYFvnWi       mvoXofFQlI          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('n', 'y'); tmp.put('h', 'd'); tmp.put('c', 'z'); tmp.put('i', 'i'); tmp.put('F', 'a'); tmp.put('V', 'ł'); tmp.put('T', 'F'); tmp.put('W', 'k'); tmp.put('b', ','); tmp.put('s', 'A'); tmp.put('X', 's'); tmp.put('v', 't'); tmp.put('d', 'r'); tmp.put('o', 'o'); tmp.put('Q', 'n'); tmp.put('Y', 'm'); tmp.put('a', 'I'); tmp.put('C', 'f'); tmp.put('m', 'S'); tmp.put('f', 'w'); tmp.put('l', 'e'); tmp.put('I', 'j');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'n'); tmp.put('d', 'h'); tmp.put('z', 'c'); tmp.put('i', 'i'); tmp.put('a', 'F'); tmp.put('ł', 'V'); tmp.put('F', 'T'); tmp.put('k', 'W'); tmp.put(',', 'b'); tmp.put('A', 's'); tmp.put('s', 'X'); tmp.put('t', 'v'); tmp.put('r', 'd'); tmp.put('o', 'o'); tmp.put('n', 'Q'); tmp.put('m', 'Y'); tmp.put('I', 'a'); tmp.put('f', 'C'); tmp.put('S', 'm'); tmp.put('w', 'f'); tmp.put('e', 'l'); tmp.put('j', 'I');
        goodDecode.add(tmp);


        int passed = 0;
        int failed = 0;
        for (int i = 0; i < good.size(); ++i) {
            Decrypter dec = new Decrypter();
            dec.setInputText(good.get(i));
            if (!dec.getDecode().equals(goodCode.get(i))) {
                System.out.println("Code test " + (i + 1) + "failed.");
                System.out.println("Expected: " + goodCode.get(i));
                System.out.println("Got: " + dec.getDecode());
                ++failed;
            } else {
                ++passed;
            }
            if (!dec.getCode().equals(goodDecode.get(i))) {
                System.out.println("Decode test " + (i + 1) + "failed.");
                System.out.println("Expected: " + goodDecode.get(i));
                System.out.println("Got: " + dec.getCode());
                ++failed;
            } else {
                ++passed;
            }
        }
        System.out.println(passed + " tests passed, " + failed + " failed.");
    }
}
