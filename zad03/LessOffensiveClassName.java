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
        good.add(" ACkDfsw   łfDCTfQ      vuUbKRKMff       f     FREKbMsUCTf\n\nSUKuKGsRlm\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'A'); tmp.put('y', 'C'); tmp.put('d', 'k'); tmp.put('z', 'D'); tmp.put('i', 'f'); tmp.put('a', 's'); tmp.put('ł', 'w'); tmp.put('F', 'ł'); tmp.put('k', 'T'); tmp.put(',', 'Q'); tmp.put('A', 'v'); tmp.put('s', 'u'); tmp.put('t', 'U'); tmp.put('r', 'b'); tmp.put('o', 'K'); tmp.put('n', 'R'); tmp.put('m', 'M'); tmp.put('I', 'F'); tmp.put('f', 'E'); tmp.put('S', 'S'); tmp.put('w', 'G'); tmp.put('e', 'l'); tmp.put('j', 'm');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('A', 'W'); tmp.put('C', 'y'); tmp.put('k', 'd'); tmp.put('D', 'z'); tmp.put('f', 'i'); tmp.put('s', 'a'); tmp.put('w', 'ł'); tmp.put('ł', 'F'); tmp.put('T', 'k'); tmp.put('Q', ','); tmp.put('v', 'A'); tmp.put('u', 's'); tmp.put('U', 't'); tmp.put('b', 'r'); tmp.put('K', 'o'); tmp.put('R', 'n'); tmp.put('M', 'm'); tmp.put('F', 'I'); tmp.put('E', 'f'); tmp.put('S', 'S'); tmp.put('G', 'w'); tmp.put('l', 'e'); tmp.put('m', 'j');
        goodDecode.add(tmp);
// TEST 2
        good.add("  SubZoDI     GoZumoY      wLA,nlnyoo         o     Blpn,yDAumo   VAnLnKDlci       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'u'); tmp.put('d', 'b'); tmp.put('z', 'Z'); tmp.put('i', 'o'); tmp.put('a', 'D'); tmp.put('ł', 'I'); tmp.put('F', 'G'); tmp.put('k', 'm'); tmp.put(',', 'Y'); tmp.put('A', 'w'); tmp.put('s', 'L'); tmp.put('t', 'A'); tmp.put('r', ','); tmp.put('o', 'n'); tmp.put('n', 'l'); tmp.put('m', 'y'); tmp.put('I', 'B'); tmp.put('f', 'p'); tmp.put('S', 'V'); tmp.put('w', 'K'); tmp.put('e', 'c'); tmp.put('j', 'i');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('u', 'y'); tmp.put('b', 'd'); tmp.put('Z', 'z'); tmp.put('o', 'i'); tmp.put('D', 'a'); tmp.put('I', 'ł'); tmp.put('G', 'F'); tmp.put('m', 'k'); tmp.put('Y', ','); tmp.put('w', 'A'); tmp.put('L', 's'); tmp.put('A', 't'); tmp.put(',', 'r'); tmp.put('n', 'o'); tmp.put('l', 'n'); tmp.put('y', 'm'); tmp.put('B', 'I'); tmp.put('p', 'f'); tmp.put('V', 'S'); tmp.put('K', 'w'); tmp.put('c', 'e'); tmp.put('i', 'j');
        goodDecode.add(tmp);
// TEST 3
        good.add("\n\n\npMbCvz,    ovCMHvu        łIkxrarwvv       v          jaSrxwzkMHv WkrIrYzadn        ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'p'); tmp.put('y', 'M'); tmp.put('d', 'b'); tmp.put('z', 'C'); tmp.put('i', 'v'); tmp.put('a', 'z'); tmp.put('ł', ','); tmp.put('F', 'o'); tmp.put('k', 'H'); tmp.put(',', 'u'); tmp.put('A', 'ł'); tmp.put('s', 'I'); tmp.put('t', 'k'); tmp.put('r', 'x'); tmp.put('o', 'r'); tmp.put('n', 'a'); tmp.put('m', 'w'); tmp.put('I', 'j'); tmp.put('f', 'S'); tmp.put('S', 'W'); tmp.put('w', 'Y'); tmp.put('e', 'd'); tmp.put('j', 'n');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('p', 'W'); tmp.put('M', 'y'); tmp.put('b', 'd'); tmp.put('C', 'z'); tmp.put('v', 'i'); tmp.put('z', 'a'); tmp.put(',', 'ł'); tmp.put('o', 'F'); tmp.put('H', 'k'); tmp.put('u', ','); tmp.put('ł', 'A'); tmp.put('I', 's'); tmp.put('k', 't'); tmp.put('x', 'r'); tmp.put('r', 'o'); tmp.put('a', 'n'); tmp.put('w', 'm'); tmp.put('j', 'I'); tmp.put('S', 'f'); tmp.put('W', 'S'); tmp.put('Y', 'w'); tmp.put('d', 'e'); tmp.put('n', 'j');
        goodDecode.add(tmp);
// TEST 4
        good.add("  xjqemHQ       Ymejbmf  SIKtyryimm\n\nm         UruytiHKjbm     XKyIywHrdV   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'x'); tmp.put('y', 'j'); tmp.put('d', 'q'); tmp.put('z', 'e'); tmp.put('i', 'm'); tmp.put('a', 'H'); tmp.put('ł', 'Q'); tmp.put('F', 'Y'); tmp.put('k', 'b'); tmp.put(',', 'f'); tmp.put('A', 'S'); tmp.put('s', 'I'); tmp.put('t', 'K'); tmp.put('r', 't'); tmp.put('o', 'y'); tmp.put('n', 'r'); tmp.put('m', 'i'); tmp.put('I', 'U'); tmp.put('f', 'u'); tmp.put('S', 'X'); tmp.put('w', 'w'); tmp.put('e', 'd'); tmp.put('j', 'V');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('x', 'W'); tmp.put('j', 'y'); tmp.put('q', 'd'); tmp.put('e', 'z'); tmp.put('m', 'i'); tmp.put('H', 'a'); tmp.put('Q', 'ł'); tmp.put('Y', 'F'); tmp.put('b', 'k'); tmp.put('f', ','); tmp.put('S', 'A'); tmp.put('I', 's'); tmp.put('K', 't'); tmp.put('t', 'r'); tmp.put('y', 'o'); tmp.put('r', 'n'); tmp.put('i', 'm'); tmp.put('U', 'I'); tmp.put('u', 'f'); tmp.put('X', 'S'); tmp.put('w', 'w'); tmp.put('d', 'e'); tmp.put('V', 'j');
        goodDecode.add(tmp);
// TEST 5
        good.add(" łC,DpEd\nepDCvpb      tuBGVFVQpp p      RFoVGQEBCvp  iBVuVhEFMS        ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'ł'); tmp.put('y', 'C'); tmp.put('d', ','); tmp.put('z', 'D'); tmp.put('i', 'p'); tmp.put('a', 'E'); tmp.put('ł', 'd'); tmp.put('F', 'e'); tmp.put('k', 'v'); tmp.put(',', 'b'); tmp.put('A', 't'); tmp.put('s', 'u'); tmp.put('t', 'B'); tmp.put('r', 'G'); tmp.put('o', 'V'); tmp.put('n', 'F'); tmp.put('m', 'Q'); tmp.put('I', 'R'); tmp.put('f', 'o'); tmp.put('S', 'i'); tmp.put('w', 'h'); tmp.put('e', 'M'); tmp.put('j', 'S');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('ł', 'W'); tmp.put('C', 'y'); tmp.put(',', 'd'); tmp.put('D', 'z'); tmp.put('p', 'i'); tmp.put('E', 'a'); tmp.put('d', 'ł'); tmp.put('e', 'F'); tmp.put('v', 'k'); tmp.put('b', ','); tmp.put('t', 'A'); tmp.put('u', 's'); tmp.put('B', 't'); tmp.put('G', 'r'); tmp.put('V', 'o'); tmp.put('F', 'n'); tmp.put('Q', 'm'); tmp.put('R', 'I'); tmp.put('o', 'f'); tmp.put('i', 'S'); tmp.put('h', 'w'); tmp.put('M', 'e'); tmp.put('S', 'j');
        goodDecode.add(tmp);
// TEST 6
        good.add("\n\n\nVJMZKUD     lKZJyKF      wum,tgtbKK    K          vgHt,bUmJyK        nmtutrUgfB\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'V'); tmp.put('y', 'J'); tmp.put('d', 'M'); tmp.put('z', 'Z'); tmp.put('i', 'K'); tmp.put('a', 'U'); tmp.put('ł', 'D'); tmp.put('F', 'l'); tmp.put('k', 'y'); tmp.put(',', 'F'); tmp.put('A', 'w'); tmp.put('s', 'u'); tmp.put('t', 'm'); tmp.put('r', ','); tmp.put('o', 't'); tmp.put('n', 'g'); tmp.put('m', 'b'); tmp.put('I', 'v'); tmp.put('f', 'H'); tmp.put('S', 'n'); tmp.put('w', 'r'); tmp.put('e', 'f'); tmp.put('j', 'B');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('V', 'W'); tmp.put('J', 'y'); tmp.put('M', 'd'); tmp.put('Z', 'z'); tmp.put('K', 'i'); tmp.put('U', 'a'); tmp.put('D', 'ł'); tmp.put('l', 'F'); tmp.put('y', 'k'); tmp.put('F', ','); tmp.put('w', 'A'); tmp.put('u', 's'); tmp.put('m', 't'); tmp.put(',', 'r'); tmp.put('t', 'o'); tmp.put('g', 'n'); tmp.put('b', 'm'); tmp.put('v', 'I'); tmp.put('H', 'f'); tmp.put('n', 'S'); tmp.put('r', 'w'); tmp.put('f', 'e'); tmp.put('B', 'j');
        goodDecode.add(tmp);
// TEST 7
        good.add("        SNhRYxe       jYRNMYł          VbZrLELFYY\n\n\nY\n\nkEDLrFxZNMY\ndZLbLnxEXB    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'N'); tmp.put('d', 'h'); tmp.put('z', 'R'); tmp.put('i', 'Y'); tmp.put('a', 'x'); tmp.put('ł', 'e'); tmp.put('F', 'j'); tmp.put('k', 'M'); tmp.put(',', 'ł'); tmp.put('A', 'V'); tmp.put('s', 'b'); tmp.put('t', 'Z'); tmp.put('r', 'r'); tmp.put('o', 'L'); tmp.put('n', 'E'); tmp.put('m', 'F'); tmp.put('I', 'k'); tmp.put('f', 'D'); tmp.put('S', 'd'); tmp.put('w', 'n'); tmp.put('e', 'X'); tmp.put('j', 'B');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('N', 'y'); tmp.put('h', 'd'); tmp.put('R', 'z'); tmp.put('Y', 'i'); tmp.put('x', 'a'); tmp.put('e', 'ł'); tmp.put('j', 'F'); tmp.put('M', 'k'); tmp.put('ł', ','); tmp.put('V', 'A'); tmp.put('b', 's'); tmp.put('Z', 't'); tmp.put('r', 'r'); tmp.put('L', 'o'); tmp.put('E', 'n'); tmp.put('F', 'm'); tmp.put('k', 'I'); tmp.put('D', 'f'); tmp.put('d', 'S'); tmp.put('n', 'w'); tmp.put('X', 'e'); tmp.put('B', 'j');
        goodDecode.add(tmp);
// TEST 8
        good.add("\n\nBHXWMJp         wMWHTMb vcntikiPMM    M        EkFitPJnHTM\nAniciqJkIe    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'B'); tmp.put('y', 'H'); tmp.put('d', 'X'); tmp.put('z', 'W'); tmp.put('i', 'M'); tmp.put('a', 'J'); tmp.put('ł', 'p'); tmp.put('F', 'w'); tmp.put('k', 'T'); tmp.put(',', 'b'); tmp.put('A', 'v'); tmp.put('s', 'c'); tmp.put('t', 'n'); tmp.put('r', 't'); tmp.put('o', 'i'); tmp.put('n', 'k'); tmp.put('m', 'P'); tmp.put('I', 'E'); tmp.put('f', 'F'); tmp.put('S', 'A'); tmp.put('w', 'q'); tmp.put('e', 'I'); tmp.put('j', 'e');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('B', 'W'); tmp.put('H', 'y'); tmp.put('X', 'd'); tmp.put('W', 'z'); tmp.put('M', 'i'); tmp.put('J', 'a'); tmp.put('p', 'ł'); tmp.put('w', 'F'); tmp.put('T', 'k'); tmp.put('b', ','); tmp.put('v', 'A'); tmp.put('c', 's'); tmp.put('n', 't'); tmp.put('t', 'r'); tmp.put('i', 'o'); tmp.put('k', 'n'); tmp.put('P', 'm'); tmp.put('E', 'I'); tmp.put('F', 'f'); tmp.put('A', 'S'); tmp.put('q', 'w'); tmp.put('I', 'e'); tmp.put('e', 'j');
        goodDecode.add(tmp);
// TEST 9
        good.add("   kdrSwmV  XwSdcwC          ioZhTpTQww          w   GpyThQmZdcw          OZToTvmpJq     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'k'); tmp.put('y', 'd'); tmp.put('d', 'r'); tmp.put('z', 'S'); tmp.put('i', 'w'); tmp.put('a', 'm'); tmp.put('ł', 'V'); tmp.put('F', 'X'); tmp.put('k', 'c'); tmp.put(',', 'C'); tmp.put('A', 'i'); tmp.put('s', 'o'); tmp.put('t', 'Z'); tmp.put('r', 'h'); tmp.put('o', 'T'); tmp.put('n', 'p'); tmp.put('m', 'Q'); tmp.put('I', 'G'); tmp.put('f', 'y'); tmp.put('S', 'O'); tmp.put('w', 'v'); tmp.put('e', 'J'); tmp.put('j', 'q');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('k', 'W'); tmp.put('d', 'y'); tmp.put('r', 'd'); tmp.put('S', 'z'); tmp.put('w', 'i'); tmp.put('m', 'a'); tmp.put('V', 'ł'); tmp.put('X', 'F'); tmp.put('c', 'k'); tmp.put('C', ','); tmp.put('i', 'A'); tmp.put('o', 's'); tmp.put('Z', 't'); tmp.put('h', 'r'); tmp.put('T', 'o'); tmp.put('p', 'n'); tmp.put('Q', 'm'); tmp.put('G', 'I'); tmp.put('y', 'f'); tmp.put('O', 'S'); tmp.put('v', 'w'); tmp.put('J', 'e'); tmp.put('q', 'j');
        goodDecode.add(tmp);
// TEST 10
        good.add("       ejiwbld      DbwjJbW       rRKGOoOgbb       b\nZoaOGglKjJb         TKOROłlotu     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'e'); tmp.put('y', 'j'); tmp.put('d', 'i'); tmp.put('z', 'w'); tmp.put('i', 'b'); tmp.put('a', 'l'); tmp.put('ł', 'd'); tmp.put('F', 'D'); tmp.put('k', 'J'); tmp.put(',', 'W'); tmp.put('A', 'r'); tmp.put('s', 'R'); tmp.put('t', 'K'); tmp.put('r', 'G'); tmp.put('o', 'O'); tmp.put('n', 'o'); tmp.put('m', 'g'); tmp.put('I', 'Z'); tmp.put('f', 'a'); tmp.put('S', 'T'); tmp.put('w', 'ł'); tmp.put('e', 't'); tmp.put('j', 'u');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('e', 'W'); tmp.put('j', 'y'); tmp.put('i', 'd'); tmp.put('w', 'z'); tmp.put('b', 'i'); tmp.put('l', 'a'); tmp.put('d', 'ł'); tmp.put('D', 'F'); tmp.put('J', 'k'); tmp.put('W', ','); tmp.put('r', 'A'); tmp.put('R', 's'); tmp.put('K', 't'); tmp.put('G', 'r'); tmp.put('O', 'o'); tmp.put('o', 'n'); tmp.put('g', 'm'); tmp.put('Z', 'I'); tmp.put('a', 'f'); tmp.put('T', 'S'); tmp.put('ł', 'w'); tmp.put('t', 'e'); tmp.put('u', 'j');
        goodDecode.add(tmp);
// TEST 11
        good.add("\nNYkb,on O,bYx,U       IJhSVpVm,,  ,    KpGVSmohYx,    DhVJVLopXA          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'N'); tmp.put('y', 'Y'); tmp.put('d', 'k'); tmp.put('z', 'b'); tmp.put('i', ','); tmp.put('a', 'o'); tmp.put('ł', 'n'); tmp.put('F', 'O'); tmp.put('k', 'x'); tmp.put(',', 'U'); tmp.put('A', 'I'); tmp.put('s', 'J'); tmp.put('t', 'h'); tmp.put('r', 'S'); tmp.put('o', 'V'); tmp.put('n', 'p'); tmp.put('m', 'm'); tmp.put('I', 'K'); tmp.put('f', 'G'); tmp.put('S', 'D'); tmp.put('w', 'L'); tmp.put('e', 'X'); tmp.put('j', 'A');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('N', 'W'); tmp.put('Y', 'y'); tmp.put('k', 'd'); tmp.put('b', 'z'); tmp.put(',', 'i'); tmp.put('o', 'a'); tmp.put('n', 'ł'); tmp.put('O', 'F'); tmp.put('x', 'k'); tmp.put('U', ','); tmp.put('I', 'A'); tmp.put('J', 's'); tmp.put('h', 't'); tmp.put('S', 'r'); tmp.put('V', 'o'); tmp.put('p', 'n'); tmp.put('m', 'm'); tmp.put('K', 'I'); tmp.put('G', 'f'); tmp.put('D', 'S'); tmp.put('L', 'w'); tmp.put('X', 'e'); tmp.put('A', 'j');
        goodDecode.add(tmp);
// TEST 12
        good.add("    xCsnujS     BunCPuD     WeoygigJuu      u\n\n\nEipgyJjoCPu     rogegtjiUL         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'x'); tmp.put('y', 'C'); tmp.put('d', 's'); tmp.put('z', 'n'); tmp.put('i', 'u'); tmp.put('a', 'j'); tmp.put('ł', 'S'); tmp.put('F', 'B'); tmp.put('k', 'P'); tmp.put(',', 'D'); tmp.put('A', 'W'); tmp.put('s', 'e'); tmp.put('t', 'o'); tmp.put('r', 'y'); tmp.put('o', 'g'); tmp.put('n', 'i'); tmp.put('m', 'J'); tmp.put('I', 'E'); tmp.put('f', 'p'); tmp.put('S', 'r'); tmp.put('w', 't'); tmp.put('e', 'U'); tmp.put('j', 'L');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('x', 'W'); tmp.put('C', 'y'); tmp.put('s', 'd'); tmp.put('n', 'z'); tmp.put('u', 'i'); tmp.put('j', 'a'); tmp.put('S', 'ł'); tmp.put('B', 'F'); tmp.put('P', 'k'); tmp.put('D', ','); tmp.put('W', 'A'); tmp.put('e', 's'); tmp.put('o', 't'); tmp.put('y', 'r'); tmp.put('g', 'o'); tmp.put('i', 'n'); tmp.put('J', 'm'); tmp.put('E', 'I'); tmp.put('p', 'f'); tmp.put('r', 'S'); tmp.put('t', 'w'); tmp.put('U', 'e'); tmp.put('L', 'j');
        goodDecode.add(tmp);
// TEST 13
        good.add("         IdFaAEC     fAadSAn\nMxyONsNUAA         A   VsGNOUEydSA\n\n\nwyNxNTEspe  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'I'); tmp.put('y', 'd'); tmp.put('d', 'F'); tmp.put('z', 'a'); tmp.put('i', 'A'); tmp.put('a', 'E'); tmp.put('ł', 'C'); tmp.put('F', 'f'); tmp.put('k', 'S'); tmp.put(',', 'n'); tmp.put('A', 'M'); tmp.put('s', 'x'); tmp.put('t', 'y'); tmp.put('r', 'O'); tmp.put('o', 'N'); tmp.put('n', 's'); tmp.put('m', 'U'); tmp.put('I', 'V'); tmp.put('f', 'G'); tmp.put('S', 'w'); tmp.put('w', 'T'); tmp.put('e', 'p'); tmp.put('j', 'e');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('I', 'W'); tmp.put('d', 'y'); tmp.put('F', 'd'); tmp.put('a', 'z'); tmp.put('A', 'i'); tmp.put('E', 'a'); tmp.put('C', 'ł'); tmp.put('f', 'F'); tmp.put('S', 'k'); tmp.put('n', ','); tmp.put('M', 'A'); tmp.put('x', 's'); tmp.put('y', 't'); tmp.put('O', 'r'); tmp.put('N', 'o'); tmp.put('s', 'n'); tmp.put('U', 'm'); tmp.put('V', 'I'); tmp.put('G', 'f'); tmp.put('w', 'S'); tmp.put('T', 'w'); tmp.put('p', 'e'); tmp.put('e', 'j');
        goodDecode.add(tmp);
// TEST 14
        good.add("         dphlmBK   umlpjmJ\n\n\nADHxbtbXmm m        ntfbxXBHpjm   RHbDbNBtyc         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'd'); tmp.put('y', 'p'); tmp.put('d', 'h'); tmp.put('z', 'l'); tmp.put('i', 'm'); tmp.put('a', 'B'); tmp.put('ł', 'K'); tmp.put('F', 'u'); tmp.put('k', 'j'); tmp.put(',', 'J'); tmp.put('A', 'A'); tmp.put('s', 'D'); tmp.put('t', 'H'); tmp.put('r', 'x'); tmp.put('o', 'b'); tmp.put('n', 't'); tmp.put('m', 'X'); tmp.put('I', 'n'); tmp.put('f', 'f'); tmp.put('S', 'R'); tmp.put('w', 'N'); tmp.put('e', 'y'); tmp.put('j', 'c');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('d', 'W'); tmp.put('p', 'y'); tmp.put('h', 'd'); tmp.put('l', 'z'); tmp.put('m', 'i'); tmp.put('B', 'a'); tmp.put('K', 'ł'); tmp.put('u', 'F'); tmp.put('j', 'k'); tmp.put('J', ','); tmp.put('A', 'A'); tmp.put('D', 's'); tmp.put('H', 't'); tmp.put('x', 'r'); tmp.put('b', 'o'); tmp.put('t', 'n'); tmp.put('X', 'm'); tmp.put('n', 'I'); tmp.put('f', 'f'); tmp.put('R', 'S'); tmp.put('N', 'w'); tmp.put('y', 'e'); tmp.put('c', 'j');
        goodDecode.add(tmp);
// TEST 15
        good.add("        nfdhaly    DahfVaU   CLbuEQEłaa     a        BQXEułlbfVa      TbELEKlQHR          ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'n'); tmp.put('y', 'f'); tmp.put('d', 'd'); tmp.put('z', 'h'); tmp.put('i', 'a'); tmp.put('a', 'l'); tmp.put('ł', 'y'); tmp.put('F', 'D'); tmp.put('k', 'V'); tmp.put(',', 'U'); tmp.put('A', 'C'); tmp.put('s', 'L'); tmp.put('t', 'b'); tmp.put('r', 'u'); tmp.put('o', 'E'); tmp.put('n', 'Q'); tmp.put('m', 'ł'); tmp.put('I', 'B'); tmp.put('f', 'X'); tmp.put('S', 'T'); tmp.put('w', 'K'); tmp.put('e', 'H'); tmp.put('j', 'R');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('n', 'W'); tmp.put('f', 'y'); tmp.put('d', 'd'); tmp.put('h', 'z'); tmp.put('a', 'i'); tmp.put('l', 'a'); tmp.put('y', 'ł'); tmp.put('D', 'F'); tmp.put('V', 'k'); tmp.put('U', ','); tmp.put('C', 'A'); tmp.put('L', 's'); tmp.put('b', 't'); tmp.put('u', 'r'); tmp.put('E', 'o'); tmp.put('Q', 'n'); tmp.put('ł', 'm'); tmp.put('B', 'I'); tmp.put('X', 'f'); tmp.put('T', 'S'); tmp.put('K', 'w'); tmp.put('H', 'e'); tmp.put('R', 'j');
        goodDecode.add(tmp);
// TEST 16
        good.add("  ncUGwps        kwGcFwJ\n\nBTq,QuQbww  w\n\nduhQ,bpqcFw\nXqQTQZpuVP       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'n'); tmp.put('y', 'c'); tmp.put('d', 'U'); tmp.put('z', 'G'); tmp.put('i', 'w'); tmp.put('a', 'p'); tmp.put('ł', 's'); tmp.put('F', 'k'); tmp.put('k', 'F'); tmp.put(',', 'J'); tmp.put('A', 'B'); tmp.put('s', 'T'); tmp.put('t', 'q'); tmp.put('r', ','); tmp.put('o', 'Q'); tmp.put('n', 'u'); tmp.put('m', 'b'); tmp.put('I', 'd'); tmp.put('f', 'h'); tmp.put('S', 'X'); tmp.put('w', 'Z'); tmp.put('e', 'V'); tmp.put('j', 'P');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('n', 'W'); tmp.put('c', 'y'); tmp.put('U', 'd'); tmp.put('G', 'z'); tmp.put('w', 'i'); tmp.put('p', 'a'); tmp.put('s', 'ł'); tmp.put('k', 'F'); tmp.put('F', 'k'); tmp.put('J', ','); tmp.put('B', 'A'); tmp.put('T', 's'); tmp.put('q', 't'); tmp.put(',', 'r'); tmp.put('Q', 'o'); tmp.put('u', 'n'); tmp.put('b', 'm'); tmp.put('d', 'I'); tmp.put('h', 'f'); tmp.put('X', 'S'); tmp.put('Z', 'w'); tmp.put('V', 'e'); tmp.put('P', 'j');
        goodDecode.add(tmp);
// TEST 17
        good.add("         Vl,sMZA    jMslEMb UQkJzuzpMM         M\n\n\nouFzJpZklEM     rkzQzgZuRh  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'V'); tmp.put('y', 'l'); tmp.put('d', ','); tmp.put('z', 's'); tmp.put('i', 'M'); tmp.put('a', 'Z'); tmp.put('ł', 'A'); tmp.put('F', 'j'); tmp.put('k', 'E'); tmp.put(',', 'b'); tmp.put('A', 'U'); tmp.put('s', 'Q'); tmp.put('t', 'k'); tmp.put('r', 'J'); tmp.put('o', 'z'); tmp.put('n', 'u'); tmp.put('m', 'p'); tmp.put('I', 'o'); tmp.put('f', 'F'); tmp.put('S', 'r'); tmp.put('w', 'g'); tmp.put('e', 'R'); tmp.put('j', 'h');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('V', 'W'); tmp.put('l', 'y'); tmp.put(',', 'd'); tmp.put('s', 'z'); tmp.put('M', 'i'); tmp.put('Z', 'a'); tmp.put('A', 'ł'); tmp.put('j', 'F'); tmp.put('E', 'k'); tmp.put('b', ','); tmp.put('U', 'A'); tmp.put('Q', 's'); tmp.put('k', 't'); tmp.put('J', 'r'); tmp.put('z', 'o'); tmp.put('u', 'n'); tmp.put('p', 'm'); tmp.put('o', 'I'); tmp.put('F', 'f'); tmp.put('r', 'S'); tmp.put('g', 'w'); tmp.put('R', 'e'); tmp.put('h', 'j');
        goodDecode.add(tmp);
// TEST 18
        good.add("         BDwvXOR     cXvDkXz       U,MCSjSQXX   X pjLSCQOMDkX\n\n\nFMS,SuOjTo ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'B'); tmp.put('y', 'D'); tmp.put('d', 'w'); tmp.put('z', 'v'); tmp.put('i', 'X'); tmp.put('a', 'O'); tmp.put('ł', 'R'); tmp.put('F', 'c'); tmp.put('k', 'k'); tmp.put(',', 'z'); tmp.put('A', 'U'); tmp.put('s', ','); tmp.put('t', 'M'); tmp.put('r', 'C'); tmp.put('o', 'S'); tmp.put('n', 'j'); tmp.put('m', 'Q'); tmp.put('I', 'p'); tmp.put('f', 'L'); tmp.put('S', 'F'); tmp.put('w', 'u'); tmp.put('e', 'T'); tmp.put('j', 'o');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('B', 'W'); tmp.put('D', 'y'); tmp.put('w', 'd'); tmp.put('v', 'z'); tmp.put('X', 'i'); tmp.put('O', 'a'); tmp.put('R', 'ł'); tmp.put('c', 'F'); tmp.put('k', 'k'); tmp.put('z', ','); tmp.put('U', 'A'); tmp.put(',', 's'); tmp.put('M', 't'); tmp.put('C', 'r'); tmp.put('S', 'o'); tmp.put('j', 'n'); tmp.put('Q', 'm'); tmp.put('p', 'I'); tmp.put('L', 'f'); tmp.put('F', 'S'); tmp.put('u', 'w'); tmp.put('T', 'e'); tmp.put('o', 'j');
        goodDecode.add(tmp);
// TEST 19
        good.add("          zRKcsfJ XscRSsH\n\n\nAixgUbUess         s      FbuUgefxRSs  wxUiUdfbrI   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'z'); tmp.put('y', 'R'); tmp.put('d', 'K'); tmp.put('z', 'c'); tmp.put('i', 's'); tmp.put('a', 'f'); tmp.put('ł', 'J'); tmp.put('F', 'X'); tmp.put('k', 'S'); tmp.put(',', 'H'); tmp.put('A', 'A'); tmp.put('s', 'i'); tmp.put('t', 'x'); tmp.put('r', 'g'); tmp.put('o', 'U'); tmp.put('n', 'b'); tmp.put('m', 'e'); tmp.put('I', 'F'); tmp.put('f', 'u'); tmp.put('S', 'w'); tmp.put('w', 'd'); tmp.put('e', 'r'); tmp.put('j', 'I');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('z', 'W'); tmp.put('R', 'y'); tmp.put('K', 'd'); tmp.put('c', 'z'); tmp.put('s', 'i'); tmp.put('f', 'a'); tmp.put('J', 'ł'); tmp.put('X', 'F'); tmp.put('S', 'k'); tmp.put('H', ','); tmp.put('A', 'A'); tmp.put('i', 's'); tmp.put('x', 't'); tmp.put('g', 'r'); tmp.put('U', 'o'); tmp.put('b', 'n'); tmp.put('e', 'm'); tmp.put('F', 'I'); tmp.put('u', 'f'); tmp.put('w', 'S'); tmp.put('d', 'w'); tmp.put('r', 'e'); tmp.put('I', 'j');
        goodDecode.add(tmp);
// TEST 20
        good.add("          xADMETK  oEMASEe        XcWdRURiEE\nE   vUIRdiTWASE         NWRcRYTUyh    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'x'); tmp.put('y', 'A'); tmp.put('d', 'D'); tmp.put('z', 'M'); tmp.put('i', 'E'); tmp.put('a', 'T'); tmp.put('ł', 'K'); tmp.put('F', 'o'); tmp.put('k', 'S'); tmp.put(',', 'e'); tmp.put('A', 'X'); tmp.put('s', 'c'); tmp.put('t', 'W'); tmp.put('r', 'd'); tmp.put('o', 'R'); tmp.put('n', 'U'); tmp.put('m', 'i'); tmp.put('I', 'v'); tmp.put('f', 'I'); tmp.put('S', 'N'); tmp.put('w', 'Y'); tmp.put('e', 'y'); tmp.put('j', 'h');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('x', 'W'); tmp.put('A', 'y'); tmp.put('D', 'd'); tmp.put('M', 'z'); tmp.put('E', 'i'); tmp.put('T', 'a'); tmp.put('K', 'ł'); tmp.put('o', 'F'); tmp.put('S', 'k'); tmp.put('e', ','); tmp.put('X', 'A'); tmp.put('c', 's'); tmp.put('W', 't'); tmp.put('d', 'r'); tmp.put('R', 'o'); tmp.put('U', 'n'); tmp.put('i', 'm'); tmp.put('v', 'I'); tmp.put('I', 'f'); tmp.put('N', 'S'); tmp.put('Y', 'w'); tmp.put('y', 'e'); tmp.put('h', 'j');
        goodDecode.add(tmp);
// TEST 21
        good.add("      błUpZq,         tZpłDZH      mGFcJoJEZZ        Z          aofJcEqFłDZ  XFJGJgqoxs     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'b'); tmp.put('y', 'ł'); tmp.put('d', 'U'); tmp.put('z', 'p'); tmp.put('i', 'Z'); tmp.put('a', 'q'); tmp.put('ł', ','); tmp.put('F', 't'); tmp.put('k', 'D'); tmp.put(',', 'H'); tmp.put('A', 'm'); tmp.put('s', 'G'); tmp.put('t', 'F'); tmp.put('r', 'c'); tmp.put('o', 'J'); tmp.put('n', 'o'); tmp.put('m', 'E'); tmp.put('I', 'a'); tmp.put('f', 'f'); tmp.put('S', 'X'); tmp.put('w', 'g'); tmp.put('e', 'x'); tmp.put('j', 's');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('b', 'W'); tmp.put('ł', 'y'); tmp.put('U', 'd'); tmp.put('p', 'z'); tmp.put('Z', 'i'); tmp.put('q', 'a'); tmp.put(',', 'ł'); tmp.put('t', 'F'); tmp.put('D', 'k'); tmp.put('H', ','); tmp.put('m', 'A'); tmp.put('G', 's'); tmp.put('F', 't'); tmp.put('c', 'r'); tmp.put('J', 'o'); tmp.put('o', 'n'); tmp.put('E', 'm'); tmp.put('a', 'I'); tmp.put('f', 'f'); tmp.put('X', 'S'); tmp.put('g', 'w'); tmp.put('x', 'e'); tmp.put('s', 'j');
        goodDecode.add(tmp);
// TEST 22
        good.add(" NKcudil      MduKmdv        hyfZJłJHdd       d         ołBJZHifKmd          bfJyJxiłGR   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'N'); tmp.put('y', 'K'); tmp.put('d', 'c'); tmp.put('z', 'u'); tmp.put('i', 'd'); tmp.put('a', 'i'); tmp.put('ł', 'l'); tmp.put('F', 'M'); tmp.put('k', 'm'); tmp.put(',', 'v'); tmp.put('A', 'h'); tmp.put('s', 'y'); tmp.put('t', 'f'); tmp.put('r', 'Z'); tmp.put('o', 'J'); tmp.put('n', 'ł'); tmp.put('m', 'H'); tmp.put('I', 'o'); tmp.put('f', 'B'); tmp.put('S', 'b'); tmp.put('w', 'x'); tmp.put('e', 'G'); tmp.put('j', 'R');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('N', 'W'); tmp.put('K', 'y'); tmp.put('c', 'd'); tmp.put('u', 'z'); tmp.put('d', 'i'); tmp.put('i', 'a'); tmp.put('l', 'ł'); tmp.put('M', 'F'); tmp.put('m', 'k'); tmp.put('v', ','); tmp.put('h', 'A'); tmp.put('y', 's'); tmp.put('f', 't'); tmp.put('Z', 'r'); tmp.put('J', 'o'); tmp.put('ł', 'n'); tmp.put('H', 'm'); tmp.put('o', 'I'); tmp.put('B', 'f'); tmp.put('b', 'S'); tmp.put('x', 'w'); tmp.put('G', 'e'); tmp.put('R', 'j');
        goodDecode.add(tmp);
// TEST 23
        good.add("     RtaOzjK        szOthzD       JlndHrHQzz       z krBHdQjnthz wnHlHojrLi  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'R'); tmp.put('y', 't'); tmp.put('d', 'a'); tmp.put('z', 'O'); tmp.put('i', 'z'); tmp.put('a', 'j'); tmp.put('ł', 'K'); tmp.put('F', 's'); tmp.put('k', 'h'); tmp.put(',', 'D'); tmp.put('A', 'J'); tmp.put('s', 'l'); tmp.put('t', 'n'); tmp.put('r', 'd'); tmp.put('o', 'H'); tmp.put('n', 'r'); tmp.put('m', 'Q'); tmp.put('I', 'k'); tmp.put('f', 'B'); tmp.put('S', 'w'); tmp.put('w', 'o'); tmp.put('e', 'L'); tmp.put('j', 'i');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('R', 'W'); tmp.put('t', 'y'); tmp.put('a', 'd'); tmp.put('O', 'z'); tmp.put('z', 'i'); tmp.put('j', 'a'); tmp.put('K', 'ł'); tmp.put('s', 'F'); tmp.put('h', 'k'); tmp.put('D', ','); tmp.put('J', 'A'); tmp.put('l', 's'); tmp.put('n', 't'); tmp.put('d', 'r'); tmp.put('H', 'o'); tmp.put('r', 'n'); tmp.put('Q', 'm'); tmp.put('k', 'I'); tmp.put('B', 'f'); tmp.put('w', 'S'); tmp.put('o', 'w'); tmp.put('L', 'e'); tmp.put('i', 'j');
        goodDecode.add(tmp);
// TEST 24
        good.add(" qLiYSPG\n\n\nUSYLMSf       psCjVEVgSS  S\n\nwEyVjgPCLMS          ,CVsVdPEQc         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'q'); tmp.put('y', 'L'); tmp.put('d', 'i'); tmp.put('z', 'Y'); tmp.put('i', 'S'); tmp.put('a', 'P'); tmp.put('ł', 'G'); tmp.put('F', 'U'); tmp.put('k', 'M'); tmp.put(',', 'f'); tmp.put('A', 'p'); tmp.put('s', 's'); tmp.put('t', 'C'); tmp.put('r', 'j'); tmp.put('o', 'V'); tmp.put('n', 'E'); tmp.put('m', 'g'); tmp.put('I', 'w'); tmp.put('f', 'y'); tmp.put('S', ','); tmp.put('w', 'd'); tmp.put('e', 'Q'); tmp.put('j', 'c');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('q', 'W'); tmp.put('L', 'y'); tmp.put('i', 'd'); tmp.put('Y', 'z'); tmp.put('S', 'i'); tmp.put('P', 'a'); tmp.put('G', 'ł'); tmp.put('U', 'F'); tmp.put('M', 'k'); tmp.put('f', ','); tmp.put('p', 'A'); tmp.put('s', 's'); tmp.put('C', 't'); tmp.put('j', 'r'); tmp.put('V', 'o'); tmp.put('E', 'n'); tmp.put('g', 'm'); tmp.put('w', 'I'); tmp.put('y', 'f'); tmp.put(',', 'S'); tmp.put('d', 'w'); tmp.put('Q', 'e'); tmp.put('c', 'j');
        goodDecode.add(tmp);
// TEST 25
        good.add("         fTxmNDa\n\n\nhNmTdNz    vqwGEbE,NN    N          UbeEG,DwTdN          PwEqEYDbrp\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'f'); tmp.put('y', 'T'); tmp.put('d', 'x'); tmp.put('z', 'm'); tmp.put('i', 'N'); tmp.put('a', 'D'); tmp.put('ł', 'a'); tmp.put('F', 'h'); tmp.put('k', 'd'); tmp.put(',', 'z'); tmp.put('A', 'v'); tmp.put('s', 'q'); tmp.put('t', 'w'); tmp.put('r', 'G'); tmp.put('o', 'E'); tmp.put('n', 'b'); tmp.put('m', ','); tmp.put('I', 'U'); tmp.put('f', 'e'); tmp.put('S', 'P'); tmp.put('w', 'Y'); tmp.put('e', 'r'); tmp.put('j', 'p');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('f', 'W'); tmp.put('T', 'y'); tmp.put('x', 'd'); tmp.put('m', 'z'); tmp.put('N', 'i'); tmp.put('D', 'a'); tmp.put('a', 'ł'); tmp.put('h', 'F'); tmp.put('d', 'k'); tmp.put('z', ','); tmp.put('v', 'A'); tmp.put('q', 's'); tmp.put('w', 't'); tmp.put('G', 'r'); tmp.put('E', 'o'); tmp.put('b', 'n'); tmp.put(',', 'm'); tmp.put('U', 'I'); tmp.put('e', 'f'); tmp.put('P', 'S'); tmp.put('Y', 'w'); tmp.put('r', 'e'); tmp.put('p', 'j');
        goodDecode.add(tmp);
// TEST 26
        good.add("      SMHLkNq dkLMPkb   EjAumemfkk\n\nk TeamufNAMPk   lAmjmZNeBz\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'M'); tmp.put('d', 'H'); tmp.put('z', 'L'); tmp.put('i', 'k'); tmp.put('a', 'N'); tmp.put('ł', 'q'); tmp.put('F', 'd'); tmp.put('k', 'P'); tmp.put(',', 'b'); tmp.put('A', 'E'); tmp.put('s', 'j'); tmp.put('t', 'A'); tmp.put('r', 'u'); tmp.put('o', 'm'); tmp.put('n', 'e'); tmp.put('m', 'f'); tmp.put('I', 'T'); tmp.put('f', 'a'); tmp.put('S', 'l'); tmp.put('w', 'Z'); tmp.put('e', 'B'); tmp.put('j', 'z');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('M', 'y'); tmp.put('H', 'd'); tmp.put('L', 'z'); tmp.put('k', 'i'); tmp.put('N', 'a'); tmp.put('q', 'ł'); tmp.put('d', 'F'); tmp.put('P', 'k'); tmp.put('b', ','); tmp.put('E', 'A'); tmp.put('j', 's'); tmp.put('A', 't'); tmp.put('u', 'r'); tmp.put('m', 'o'); tmp.put('e', 'n'); tmp.put('f', 'm'); tmp.put('T', 'I'); tmp.put('a', 'f'); tmp.put('l', 'S'); tmp.put('Z', 'w'); tmp.put('B', 'e'); tmp.put('z', 'j');
        goodDecode.add(tmp);
// TEST 27
        good.add("  UavPmNd HmPazmL      wjMCpbpEmm\nm\n\n\ncbVpCENMazm    sMpjpqNbQg   ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'U'); tmp.put('y', 'a'); tmp.put('d', 'v'); tmp.put('z', 'P'); tmp.put('i', 'm'); tmp.put('a', 'N'); tmp.put('ł', 'd'); tmp.put('F', 'H'); tmp.put('k', 'z'); tmp.put(',', 'L'); tmp.put('A', 'w'); tmp.put('s', 'j'); tmp.put('t', 'M'); tmp.put('r', 'C'); tmp.put('o', 'p'); tmp.put('n', 'b'); tmp.put('m', 'E'); tmp.put('I', 'c'); tmp.put('f', 'V'); tmp.put('S', 's'); tmp.put('w', 'q'); tmp.put('e', 'Q'); tmp.put('j', 'g');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('U', 'W'); tmp.put('a', 'y'); tmp.put('v', 'd'); tmp.put('P', 'z'); tmp.put('m', 'i'); tmp.put('N', 'a'); tmp.put('d', 'ł'); tmp.put('H', 'F'); tmp.put('z', 'k'); tmp.put('L', ','); tmp.put('w', 'A'); tmp.put('j', 's'); tmp.put('M', 't'); tmp.put('C', 'r'); tmp.put('p', 'o'); tmp.put('b', 'n'); tmp.put('E', 'm'); tmp.put('c', 'I'); tmp.put('V', 'f'); tmp.put('s', 'S'); tmp.put('q', 'w'); tmp.put('Q', 'e'); tmp.put('g', 'j');
        goodDecode.add(tmp);
// TEST 28
        good.add("         ITVFtdł          ltFTMtS        meQ,oJoGtt  t    aJfo,GdQTMt   nQoeoLdJqc\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'I'); tmp.put('y', 'T'); tmp.put('d', 'V'); tmp.put('z', 'F'); tmp.put('i', 't'); tmp.put('a', 'd'); tmp.put('ł', 'ł'); tmp.put('F', 'l'); tmp.put('k', 'M'); tmp.put(',', 'S'); tmp.put('A', 'm'); tmp.put('s', 'e'); tmp.put('t', 'Q'); tmp.put('r', ','); tmp.put('o', 'o'); tmp.put('n', 'J'); tmp.put('m', 'G'); tmp.put('I', 'a'); tmp.put('f', 'f'); tmp.put('S', 'n'); tmp.put('w', 'L'); tmp.put('e', 'q'); tmp.put('j', 'c');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('I', 'W'); tmp.put('T', 'y'); tmp.put('V', 'd'); tmp.put('F', 'z'); tmp.put('t', 'i'); tmp.put('d', 'a'); tmp.put('ł', 'ł'); tmp.put('l', 'F'); tmp.put('M', 'k'); tmp.put('S', ','); tmp.put('m', 'A'); tmp.put('e', 's'); tmp.put('Q', 't'); tmp.put(',', 'r'); tmp.put('o', 'o'); tmp.put('J', 'n'); tmp.put('G', 'm'); tmp.put('a', 'I'); tmp.put('f', 'f'); tmp.put('n', 'S'); tmp.put('L', 'w'); tmp.put('q', 'e'); tmp.put('c', 'j');
        goodDecode.add(tmp);
// TEST 29
        good.add("      QKbgUM,       wUgKhUW        nNxfFLFcUU\nU\nVLrFfcMxKhU\n\naxFNFsMLOZ\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'Q'); tmp.put('y', 'K'); tmp.put('d', 'b'); tmp.put('z', 'g'); tmp.put('i', 'U'); tmp.put('a', 'M'); tmp.put('ł', ','); tmp.put('F', 'w'); tmp.put('k', 'h'); tmp.put(',', 'W'); tmp.put('A', 'n'); tmp.put('s', 'N'); tmp.put('t', 'x'); tmp.put('r', 'f'); tmp.put('o', 'F'); tmp.put('n', 'L'); tmp.put('m', 'c'); tmp.put('I', 'V'); tmp.put('f', 'r'); tmp.put('S', 'a'); tmp.put('w', 's'); tmp.put('e', 'O'); tmp.put('j', 'Z');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('Q', 'W'); tmp.put('K', 'y'); tmp.put('b', 'd'); tmp.put('g', 'z'); tmp.put('U', 'i'); tmp.put('M', 'a'); tmp.put(',', 'ł'); tmp.put('w', 'F'); tmp.put('h', 'k'); tmp.put('W', ','); tmp.put('n', 'A'); tmp.put('N', 's'); tmp.put('x', 't'); tmp.put('f', 'r'); tmp.put('F', 'o'); tmp.put('L', 'n'); tmp.put('c', 'm'); tmp.put('V', 'I'); tmp.put('r', 'f'); tmp.put('a', 'S'); tmp.put('s', 'w'); tmp.put('O', 'e'); tmp.put('Z', 'j');
        goodDecode.add(tmp);
// TEST 30
        good.add("         kMGZrPN         lrZMjrA   aEqOVTVprr   r      yTHVOpPqMjr      RqVEVfPTvL\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'k'); tmp.put('y', 'M'); tmp.put('d', 'G'); tmp.put('z', 'Z'); tmp.put('i', 'r'); tmp.put('a', 'P'); tmp.put('ł', 'N'); tmp.put('F', 'l'); tmp.put('k', 'j'); tmp.put(',', 'A'); tmp.put('A', 'a'); tmp.put('s', 'E'); tmp.put('t', 'q'); tmp.put('r', 'O'); tmp.put('o', 'V'); tmp.put('n', 'T'); tmp.put('m', 'p'); tmp.put('I', 'y'); tmp.put('f', 'H'); tmp.put('S', 'R'); tmp.put('w', 'f'); tmp.put('e', 'v'); tmp.put('j', 'L');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('k', 'W'); tmp.put('M', 'y'); tmp.put('G', 'd'); tmp.put('Z', 'z'); tmp.put('r', 'i'); tmp.put('P', 'a'); tmp.put('N', 'ł'); tmp.put('l', 'F'); tmp.put('j', 'k'); tmp.put('A', ','); tmp.put('a', 'A'); tmp.put('E', 's'); tmp.put('q', 't'); tmp.put('O', 'r'); tmp.put('V', 'o'); tmp.put('T', 'n'); tmp.put('p', 'm'); tmp.put('y', 'I'); tmp.put('H', 'f'); tmp.put('R', 'S'); tmp.put('f', 'w'); tmp.put('v', 'e'); tmp.put('L', 'j');
        goodDecode.add(tmp);
// TEST 31
        good.add("\n\n\nrxCEvhT         SvExpvW          yAHgLeLYvv     v          kenLgYhHxpv\ndHLALlhebQ    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'r'); tmp.put('y', 'x'); tmp.put('d', 'C'); tmp.put('z', 'E'); tmp.put('i', 'v'); tmp.put('a', 'h'); tmp.put('ł', 'T'); tmp.put('F', 'S'); tmp.put('k', 'p'); tmp.put(',', 'W'); tmp.put('A', 'y'); tmp.put('s', 'A'); tmp.put('t', 'H'); tmp.put('r', 'g'); tmp.put('o', 'L'); tmp.put('n', 'e'); tmp.put('m', 'Y'); tmp.put('I', 'k'); tmp.put('f', 'n'); tmp.put('S', 'd'); tmp.put('w', 'l'); tmp.put('e', 'b'); tmp.put('j', 'Q');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('r', 'W'); tmp.put('x', 'y'); tmp.put('C', 'd'); tmp.put('E', 'z'); tmp.put('v', 'i'); tmp.put('h', 'a'); tmp.put('T', 'ł'); tmp.put('S', 'F'); tmp.put('p', 'k'); tmp.put('W', ','); tmp.put('y', 'A'); tmp.put('A', 's'); tmp.put('H', 't'); tmp.put('g', 'r'); tmp.put('L', 'o'); tmp.put('e', 'n'); tmp.put('Y', 'm'); tmp.put('k', 'I'); tmp.put('n', 'f'); tmp.put('d', 'S'); tmp.put('l', 'w'); tmp.put('b', 'e'); tmp.put('Q', 'j');
        goodDecode.add(tmp);
// TEST 32
        good.add("    sUCvgqJ          QgvUngX      pxOTPjPfgg         g\n\n\nrjGPTfqOUng     oOPxPkqjtB      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 's'); tmp.put('y', 'U'); tmp.put('d', 'C'); tmp.put('z', 'v'); tmp.put('i', 'g'); tmp.put('a', 'q'); tmp.put('ł', 'J'); tmp.put('F', 'Q'); tmp.put('k', 'n'); tmp.put(',', 'X'); tmp.put('A', 'p'); tmp.put('s', 'x'); tmp.put('t', 'O'); tmp.put('r', 'T'); tmp.put('o', 'P'); tmp.put('n', 'j'); tmp.put('m', 'f'); tmp.put('I', 'r'); tmp.put('f', 'G'); tmp.put('S', 'o'); tmp.put('w', 'k'); tmp.put('e', 't'); tmp.put('j', 'B');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('s', 'W'); tmp.put('U', 'y'); tmp.put('C', 'd'); tmp.put('v', 'z'); tmp.put('g', 'i'); tmp.put('q', 'a'); tmp.put('J', 'ł'); tmp.put('Q', 'F'); tmp.put('n', 'k'); tmp.put('X', ','); tmp.put('p', 'A'); tmp.put('x', 's'); tmp.put('O', 't'); tmp.put('T', 'r'); tmp.put('P', 'o'); tmp.put('j', 'n'); tmp.put('f', 'm'); tmp.put('r', 'I'); tmp.put('G', 'f'); tmp.put('o', 'S'); tmp.put('k', 'w'); tmp.put('t', 'e'); tmp.put('B', 'j');
        goodDecode.add(tmp);
// TEST 33
        good.add("   tf,kCnY UCkfPCQ         aJAMKXKsCC\n\n\nC    IXNKMsnAfPC\n\n\nVAKJKDnXeb\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 't'); tmp.put('y', 'f'); tmp.put('d', ','); tmp.put('z', 'k'); tmp.put('i', 'C'); tmp.put('a', 'n'); tmp.put('ł', 'Y'); tmp.put('F', 'U'); tmp.put('k', 'P'); tmp.put(',', 'Q'); tmp.put('A', 'a'); tmp.put('s', 'J'); tmp.put('t', 'A'); tmp.put('r', 'M'); tmp.put('o', 'K'); tmp.put('n', 'X'); tmp.put('m', 's'); tmp.put('I', 'I'); tmp.put('f', 'N'); tmp.put('S', 'V'); tmp.put('w', 'D'); tmp.put('e', 'e'); tmp.put('j', 'b');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('t', 'W'); tmp.put('f', 'y'); tmp.put(',', 'd'); tmp.put('k', 'z'); tmp.put('C', 'i'); tmp.put('n', 'a'); tmp.put('Y', 'ł'); tmp.put('U', 'F'); tmp.put('P', 'k'); tmp.put('Q', ','); tmp.put('a', 'A'); tmp.put('J', 's'); tmp.put('A', 't'); tmp.put('M', 'r'); tmp.put('K', 'o'); tmp.put('X', 'n'); tmp.put('s', 'm'); tmp.put('I', 'I'); tmp.put('N', 'f'); tmp.put('V', 'S'); tmp.put('D', 'w'); tmp.put('e', 'e'); tmp.put('b', 'j');
        goodDecode.add(tmp);
// TEST 34
        good.add("\n\nRZYgKBm\nłKgZTKx          LjpWzOzqKK\n\n\nK\n\n\nwOczWqBpZTK          GpzjzaBOsF       ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'R'); tmp.put('y', 'Z'); tmp.put('d', 'Y'); tmp.put('z', 'g'); tmp.put('i', 'K'); tmp.put('a', 'B'); tmp.put('ł', 'm'); tmp.put('F', 'ł'); tmp.put('k', 'T'); tmp.put(',', 'x'); tmp.put('A', 'L'); tmp.put('s', 'j'); tmp.put('t', 'p'); tmp.put('r', 'W'); tmp.put('o', 'z'); tmp.put('n', 'O'); tmp.put('m', 'q'); tmp.put('I', 'w'); tmp.put('f', 'c'); tmp.put('S', 'G'); tmp.put('w', 'a'); tmp.put('e', 's'); tmp.put('j', 'F');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('R', 'W'); tmp.put('Z', 'y'); tmp.put('Y', 'd'); tmp.put('g', 'z'); tmp.put('K', 'i'); tmp.put('B', 'a'); tmp.put('m', 'ł'); tmp.put('ł', 'F'); tmp.put('T', 'k'); tmp.put('x', ','); tmp.put('L', 'A'); tmp.put('j', 's'); tmp.put('p', 't'); tmp.put('W', 'r'); tmp.put('z', 'o'); tmp.put('O', 'n'); tmp.put('q', 'm'); tmp.put('w', 'I'); tmp.put('c', 'f'); tmp.put('G', 'S'); tmp.put('a', 'w'); tmp.put('s', 'e'); tmp.put('F', 'j');
        goodDecode.add(tmp);
// TEST 35
        good.add("  łCVxIFp         cIxCqIb    eN,fRJRaII          I\n\n\nDJXRfaF,CqI\nQ,RNRmFJtr        ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'ł'); tmp.put('y', 'C'); tmp.put('d', 'V'); tmp.put('z', 'x'); tmp.put('i', 'I'); tmp.put('a', 'F'); tmp.put('ł', 'p'); tmp.put('F', 'c'); tmp.put('k', 'q'); tmp.put(',', 'b'); tmp.put('A', 'e'); tmp.put('s', 'N'); tmp.put('t', ','); tmp.put('r', 'f'); tmp.put('o', 'R'); tmp.put('n', 'J'); tmp.put('m', 'a'); tmp.put('I', 'D'); tmp.put('f', 'X'); tmp.put('S', 'Q'); tmp.put('w', 'm'); tmp.put('e', 't'); tmp.put('j', 'r');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('ł', 'W'); tmp.put('C', 'y'); tmp.put('V', 'd'); tmp.put('x', 'z'); tmp.put('I', 'i'); tmp.put('F', 'a'); tmp.put('p', 'ł'); tmp.put('c', 'F'); tmp.put('q', 'k'); tmp.put('b', ','); tmp.put('e', 'A'); tmp.put('N', 's'); tmp.put(',', 't'); tmp.put('f', 'r'); tmp.put('R', 'o'); tmp.put('J', 'n'); tmp.put('a', 'm'); tmp.put('D', 'I'); tmp.put('X', 'f'); tmp.put('Q', 'S'); tmp.put('m', 'w'); tmp.put('t', 'e'); tmp.put('r', 'j');
        goodDecode.add(tmp);
// TEST 36
        good.add("\n\n\nLCmq,Tw      l,qCr,s  QBAoKbKD,,       ,  ObyKoDTACr,          YAKBKMTbzł\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'L'); tmp.put('y', 'C'); tmp.put('d', 'm'); tmp.put('z', 'q'); tmp.put('i', ','); tmp.put('a', 'T'); tmp.put('ł', 'w'); tmp.put('F', 'l'); tmp.put('k', 'r'); tmp.put(',', 's'); tmp.put('A', 'Q'); tmp.put('s', 'B'); tmp.put('t', 'A'); tmp.put('r', 'o'); tmp.put('o', 'K'); tmp.put('n', 'b'); tmp.put('m', 'D'); tmp.put('I', 'O'); tmp.put('f', 'y'); tmp.put('S', 'Y'); tmp.put('w', 'M'); tmp.put('e', 'z'); tmp.put('j', 'ł');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('L', 'W'); tmp.put('C', 'y'); tmp.put('m', 'd'); tmp.put('q', 'z'); tmp.put(',', 'i'); tmp.put('T', 'a'); tmp.put('w', 'ł'); tmp.put('l', 'F'); tmp.put('r', 'k'); tmp.put('s', ','); tmp.put('Q', 'A'); tmp.put('B', 's'); tmp.put('A', 't'); tmp.put('o', 'r'); tmp.put('K', 'o'); tmp.put('b', 'n'); tmp.put('D', 'm'); tmp.put('O', 'I'); tmp.put('y', 'f'); tmp.put('Y', 'S'); tmp.put('M', 'w'); tmp.put('z', 'e'); tmp.put('ł', 'j');
        goodDecode.add(tmp);
// TEST 37
        good.add("\nHZxSgnF         XgSZqge       bluodQdmgg        g   CQTdomnuZqg    tudldInQia         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'H'); tmp.put('y', 'Z'); tmp.put('d', 'x'); tmp.put('z', 'S'); tmp.put('i', 'g'); tmp.put('a', 'n'); tmp.put('ł', 'F'); tmp.put('F', 'X'); tmp.put('k', 'q'); tmp.put(',', 'e'); tmp.put('A', 'b'); tmp.put('s', 'l'); tmp.put('t', 'u'); tmp.put('r', 'o'); tmp.put('o', 'd'); tmp.put('n', 'Q'); tmp.put('m', 'm'); tmp.put('I', 'C'); tmp.put('f', 'T'); tmp.put('S', 't'); tmp.put('w', 'I'); tmp.put('e', 'i'); tmp.put('j', 'a');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('H', 'W'); tmp.put('Z', 'y'); tmp.put('x', 'd'); tmp.put('S', 'z'); tmp.put('g', 'i'); tmp.put('n', 'a'); tmp.put('F', 'ł'); tmp.put('X', 'F'); tmp.put('q', 'k'); tmp.put('e', ','); tmp.put('b', 'A'); tmp.put('l', 's'); tmp.put('u', 't'); tmp.put('o', 'r'); tmp.put('d', 'o'); tmp.put('Q', 'n'); tmp.put('m', 'm'); tmp.put('C', 'I'); tmp.put('T', 'f'); tmp.put('t', 'S'); tmp.put('I', 'w'); tmp.put('i', 'e'); tmp.put('a', 'j');
        goodDecode.add(tmp);
// TEST 38
        good.add("\ntFłnrCZ      HrnFdrO    fVb,EmEsrr          r          omjE,sCbFdr\nNbEVEMCmgc    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 't'); tmp.put('y', 'F'); tmp.put('d', 'ł'); tmp.put('z', 'n'); tmp.put('i', 'r'); tmp.put('a', 'C'); tmp.put('ł', 'Z'); tmp.put('F', 'H'); tmp.put('k', 'd'); tmp.put(',', 'O'); tmp.put('A', 'f'); tmp.put('s', 'V'); tmp.put('t', 'b'); tmp.put('r', ','); tmp.put('o', 'E'); tmp.put('n', 'm'); tmp.put('m', 's'); tmp.put('I', 'o'); tmp.put('f', 'j'); tmp.put('S', 'N'); tmp.put('w', 'M'); tmp.put('e', 'g'); tmp.put('j', 'c');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('t', 'W'); tmp.put('F', 'y'); tmp.put('ł', 'd'); tmp.put('n', 'z'); tmp.put('r', 'i'); tmp.put('C', 'a'); tmp.put('Z', 'ł'); tmp.put('H', 'F'); tmp.put('d', 'k'); tmp.put('O', ','); tmp.put('f', 'A'); tmp.put('V', 's'); tmp.put('b', 't'); tmp.put(',', 'r'); tmp.put('E', 'o'); tmp.put('m', 'n'); tmp.put('s', 'm'); tmp.put('o', 'I'); tmp.put('j', 'f'); tmp.put('N', 'S'); tmp.put('M', 'w'); tmp.put('g', 'e'); tmp.put('c', 'j');
        goodDecode.add(tmp);
// TEST 39
        good.add("  U,nYszp      MsY,msl\nEdAWIOINss   s     uObIWNzA,ms\n\n\nfAIdIQzOKx         ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'U'); tmp.put('y', ','); tmp.put('d', 'n'); tmp.put('z', 'Y'); tmp.put('i', 's'); tmp.put('a', 'z'); tmp.put('ł', 'p'); tmp.put('F', 'M'); tmp.put('k', 'm'); tmp.put(',', 'l'); tmp.put('A', 'E'); tmp.put('s', 'd'); tmp.put('t', 'A'); tmp.put('r', 'W'); tmp.put('o', 'I'); tmp.put('n', 'O'); tmp.put('m', 'N'); tmp.put('I', 'u'); tmp.put('f', 'b'); tmp.put('S', 'f'); tmp.put('w', 'Q'); tmp.put('e', 'K'); tmp.put('j', 'x');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('U', 'W'); tmp.put(',', 'y'); tmp.put('n', 'd'); tmp.put('Y', 'z'); tmp.put('s', 'i'); tmp.put('z', 'a'); tmp.put('p', 'ł'); tmp.put('M', 'F'); tmp.put('m', 'k'); tmp.put('l', ','); tmp.put('E', 'A'); tmp.put('d', 's'); tmp.put('A', 't'); tmp.put('W', 'r'); tmp.put('I', 'o'); tmp.put('O', 'n'); tmp.put('N', 'm'); tmp.put('u', 'I'); tmp.put('b', 'f'); tmp.put('f', 'S'); tmp.put('Q', 'w'); tmp.put('K', 'e'); tmp.put('x', 'j');
        goodDecode.add(tmp);
// TEST 40
        good.add("   txjmEGz        NEmxbEf\nłRAFaea,EE      E      WeZaF,GAxbE uAaRacGeyd      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 't'); tmp.put('y', 'x'); tmp.put('d', 'j'); tmp.put('z', 'm'); tmp.put('i', 'E'); tmp.put('a', 'G'); tmp.put('ł', 'z'); tmp.put('F', 'N'); tmp.put('k', 'b'); tmp.put(',', 'f'); tmp.put('A', 'ł'); tmp.put('s', 'R'); tmp.put('t', 'A'); tmp.put('r', 'F'); tmp.put('o', 'a'); tmp.put('n', 'e'); tmp.put('m', ','); tmp.put('I', 'W'); tmp.put('f', 'Z'); tmp.put('S', 'u'); tmp.put('w', 'c'); tmp.put('e', 'y'); tmp.put('j', 'd');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('t', 'W'); tmp.put('x', 'y'); tmp.put('j', 'd'); tmp.put('m', 'z'); tmp.put('E', 'i'); tmp.put('G', 'a'); tmp.put('z', 'ł'); tmp.put('N', 'F'); tmp.put('b', 'k'); tmp.put('f', ','); tmp.put('ł', 'A'); tmp.put('R', 's'); tmp.put('A', 't'); tmp.put('F', 'r'); tmp.put('a', 'o'); tmp.put('e', 'n'); tmp.put(',', 'm'); tmp.put('W', 'I'); tmp.put('Z', 'f'); tmp.put('u', 'S'); tmp.put('c', 'w'); tmp.put('y', 'e'); tmp.put('d', 'j');
        goodDecode.add(tmp);
// TEST 41
        good.add("\n\n\nanrKUIk\nXUKnZUy        tWeCJEJdUU     U\nPEqJCdIenZU QeJWJfIEsB\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'a'); tmp.put('y', 'n'); tmp.put('d', 'r'); tmp.put('z', 'K'); tmp.put('i', 'U'); tmp.put('a', 'I'); tmp.put('ł', 'k'); tmp.put('F', 'X'); tmp.put('k', 'Z'); tmp.put(',', 'y'); tmp.put('A', 't'); tmp.put('s', 'W'); tmp.put('t', 'e'); tmp.put('r', 'C'); tmp.put('o', 'J'); tmp.put('n', 'E'); tmp.put('m', 'd'); tmp.put('I', 'P'); tmp.put('f', 'q'); tmp.put('S', 'Q'); tmp.put('w', 'f'); tmp.put('e', 's'); tmp.put('j', 'B');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('a', 'W'); tmp.put('n', 'y'); tmp.put('r', 'd'); tmp.put('K', 'z'); tmp.put('U', 'i'); tmp.put('I', 'a'); tmp.put('k', 'ł'); tmp.put('X', 'F'); tmp.put('Z', 'k'); tmp.put('y', ','); tmp.put('t', 'A'); tmp.put('W', 's'); tmp.put('e', 't'); tmp.put('C', 'r'); tmp.put('J', 'o'); tmp.put('E', 'n'); tmp.put('d', 'm'); tmp.put('P', 'I'); tmp.put('q', 'f'); tmp.put('Q', 'S'); tmp.put('f', 'w'); tmp.put('s', 'e'); tmp.put('B', 'j');
        goodDecode.add(tmp);
// TEST 42
        good.add("    lGIrJRC    TJrGMJw        BqfkbcbVJJ\n\n\nJ         ,czbkVRfGMJ\n\nyfbqbxRcpt ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'l'); tmp.put('y', 'G'); tmp.put('d', 'I'); tmp.put('z', 'r'); tmp.put('i', 'J'); tmp.put('a', 'R'); tmp.put('ł', 'C'); tmp.put('F', 'T'); tmp.put('k', 'M'); tmp.put(',', 'w'); tmp.put('A', 'B'); tmp.put('s', 'q'); tmp.put('t', 'f'); tmp.put('r', 'k'); tmp.put('o', 'b'); tmp.put('n', 'c'); tmp.put('m', 'V'); tmp.put('I', ','); tmp.put('f', 'z'); tmp.put('S', 'y'); tmp.put('w', 'x'); tmp.put('e', 'p'); tmp.put('j', 't');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('l', 'W'); tmp.put('G', 'y'); tmp.put('I', 'd'); tmp.put('r', 'z'); tmp.put('J', 'i'); tmp.put('R', 'a'); tmp.put('C', 'ł'); tmp.put('T', 'F'); tmp.put('M', 'k'); tmp.put('w', ','); tmp.put('B', 'A'); tmp.put('q', 's'); tmp.put('f', 't'); tmp.put('k', 'r'); tmp.put('b', 'o'); tmp.put('c', 'n'); tmp.put('V', 'm'); tmp.put(',', 'I'); tmp.put('z', 'f'); tmp.put('y', 'S'); tmp.put('x', 'w'); tmp.put('p', 'e'); tmp.put('t', 'j');
        goodDecode.add(tmp);
// TEST 43
        good.add("         ZUcYLIł        aLYUELP        hzxR,j,nLL   L mjK,RnIxUEL         Hx,z,lIjrg      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'Z'); tmp.put('y', 'U'); tmp.put('d', 'c'); tmp.put('z', 'Y'); tmp.put('i', 'L'); tmp.put('a', 'I'); tmp.put('ł', 'ł'); tmp.put('F', 'a'); tmp.put('k', 'E'); tmp.put(',', 'P'); tmp.put('A', 'h'); tmp.put('s', 'z'); tmp.put('t', 'x'); tmp.put('r', 'R'); tmp.put('o', ','); tmp.put('n', 'j'); tmp.put('m', 'n'); tmp.put('I', 'm'); tmp.put('f', 'K'); tmp.put('S', 'H'); tmp.put('w', 'l'); tmp.put('e', 'r'); tmp.put('j', 'g');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('Z', 'W'); tmp.put('U', 'y'); tmp.put('c', 'd'); tmp.put('Y', 'z'); tmp.put('L', 'i'); tmp.put('I', 'a'); tmp.put('ł', 'ł'); tmp.put('a', 'F'); tmp.put('E', 'k'); tmp.put('P', ','); tmp.put('h', 'A'); tmp.put('z', 's'); tmp.put('x', 't'); tmp.put('R', 'r'); tmp.put(',', 'o'); tmp.put('j', 'n'); tmp.put('n', 'm'); tmp.put('m', 'I'); tmp.put('K', 'f'); tmp.put('H', 'S'); tmp.put('l', 'w'); tmp.put('r', 'e'); tmp.put('g', 'j');
        goodDecode.add(tmp);
// TEST 44
        good.add("          GBvrzad         TzrBMzn\nWJKUcIcezz      z\n,ItcUeaKBMz\n\n\nbKcJcoaIZA  ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'G'); tmp.put('y', 'B'); tmp.put('d', 'v'); tmp.put('z', 'r'); tmp.put('i', 'z'); tmp.put('a', 'a'); tmp.put('ł', 'd'); tmp.put('F', 'T'); tmp.put('k', 'M'); tmp.put(',', 'n'); tmp.put('A', 'W'); tmp.put('s', 'J'); tmp.put('t', 'K'); tmp.put('r', 'U'); tmp.put('o', 'c'); tmp.put('n', 'I'); tmp.put('m', 'e'); tmp.put('I', ','); tmp.put('f', 't'); tmp.put('S', 'b'); tmp.put('w', 'o'); tmp.put('e', 'Z'); tmp.put('j', 'A');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('G', 'W'); tmp.put('B', 'y'); tmp.put('v', 'd'); tmp.put('r', 'z'); tmp.put('z', 'i'); tmp.put('a', 'a'); tmp.put('d', 'ł'); tmp.put('T', 'F'); tmp.put('M', 'k'); tmp.put('n', ','); tmp.put('W', 'A'); tmp.put('J', 's'); tmp.put('K', 't'); tmp.put('U', 'r'); tmp.put('c', 'o'); tmp.put('I', 'n'); tmp.put('e', 'm'); tmp.put(',', 'I'); tmp.put('t', 'f'); tmp.put('b', 'S'); tmp.put('o', 'w'); tmp.put('Z', 'e'); tmp.put('A', 'j');
        goodDecode.add(tmp);
// TEST 45
        good.add("    mOnlłsq\n\n\nbłlOhłF      wcKJyPyvłł    ł        WPHyJvsKOhł  GKycyksPQ, ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'm'); tmp.put('y', 'O'); tmp.put('d', 'n'); tmp.put('z', 'l'); tmp.put('i', 'ł'); tmp.put('a', 's'); tmp.put('ł', 'q'); tmp.put('F', 'b'); tmp.put('k', 'h'); tmp.put(',', 'F'); tmp.put('A', 'w'); tmp.put('s', 'c'); tmp.put('t', 'K'); tmp.put('r', 'J'); tmp.put('o', 'y'); tmp.put('n', 'P'); tmp.put('m', 'v'); tmp.put('I', 'W'); tmp.put('f', 'H'); tmp.put('S', 'G'); tmp.put('w', 'k'); tmp.put('e', 'Q'); tmp.put('j', ',');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('m', 'W'); tmp.put('O', 'y'); tmp.put('n', 'd'); tmp.put('l', 'z'); tmp.put('ł', 'i'); tmp.put('s', 'a'); tmp.put('q', 'ł'); tmp.put('b', 'F'); tmp.put('h', 'k'); tmp.put('F', ','); tmp.put('w', 'A'); tmp.put('c', 's'); tmp.put('K', 't'); tmp.put('J', 'r'); tmp.put('y', 'o'); tmp.put('P', 'n'); tmp.put('v', 'm'); tmp.put('W', 'I'); tmp.put('H', 'f'); tmp.put('G', 'S'); tmp.put('k', 'w'); tmp.put('Q', 'e'); tmp.put(',', 'j');
        goodDecode.add(tmp);
// TEST 46
        good.add("          sQwEfgt  mfEQ,fJ        RYLlAHAcff\n\nf łHNAlcgLQ,f\n\nDLAYAFgHGa\n\n\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 's'); tmp.put('y', 'Q'); tmp.put('d', 'w'); tmp.put('z', 'E'); tmp.put('i', 'f'); tmp.put('a', 'g'); tmp.put('ł', 't'); tmp.put('F', 'm'); tmp.put('k', ','); tmp.put(',', 'J'); tmp.put('A', 'R'); tmp.put('s', 'Y'); tmp.put('t', 'L'); tmp.put('r', 'l'); tmp.put('o', 'A'); tmp.put('n', 'H'); tmp.put('m', 'c'); tmp.put('I', 'ł'); tmp.put('f', 'N'); tmp.put('S', 'D'); tmp.put('w', 'F'); tmp.put('e', 'G'); tmp.put('j', 'a');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('s', 'W'); tmp.put('Q', 'y'); tmp.put('w', 'd'); tmp.put('E', 'z'); tmp.put('f', 'i'); tmp.put('g', 'a'); tmp.put('t', 'ł'); tmp.put('m', 'F'); tmp.put(',', 'k'); tmp.put('J', ','); tmp.put('R', 'A'); tmp.put('Y', 's'); tmp.put('L', 't'); tmp.put('l', 'r'); tmp.put('A', 'o'); tmp.put('H', 'n'); tmp.put('c', 'm'); tmp.put('ł', 'I'); tmp.put('N', 'f'); tmp.put('D', 'S'); tmp.put('F', 'w'); tmp.put('G', 'e'); tmp.put('a', 'j');
        goodDecode.add(tmp);
// TEST 47
        good.add("        WGUVTRv          fTVGqTh\n\n\ncoNCHAHSTT       T\nnAXHCSRNGqT  yNHoHłRAsP\n");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'W'); tmp.put('y', 'G'); tmp.put('d', 'U'); tmp.put('z', 'V'); tmp.put('i', 'T'); tmp.put('a', 'R'); tmp.put('ł', 'v'); tmp.put('F', 'f'); tmp.put('k', 'q'); tmp.put(',', 'h'); tmp.put('A', 'c'); tmp.put('s', 'o'); tmp.put('t', 'N'); tmp.put('r', 'C'); tmp.put('o', 'H'); tmp.put('n', 'A'); tmp.put('m', 'S'); tmp.put('I', 'n'); tmp.put('f', 'X'); tmp.put('S', 'y'); tmp.put('w', 'ł'); tmp.put('e', 's'); tmp.put('j', 'P');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'W'); tmp.put('G', 'y'); tmp.put('U', 'd'); tmp.put('V', 'z'); tmp.put('T', 'i'); tmp.put('R', 'a'); tmp.put('v', 'ł'); tmp.put('f', 'F'); tmp.put('q', 'k'); tmp.put('h', ','); tmp.put('c', 'A'); tmp.put('o', 's'); tmp.put('N', 't'); tmp.put('C', 'r'); tmp.put('H', 'o'); tmp.put('A', 'n'); tmp.put('S', 'm'); tmp.put('n', 'I'); tmp.put('X', 'f'); tmp.put('y', 'S'); tmp.put('ł', 'w'); tmp.put('s', 'e'); tmp.put('P', 'j');
        goodDecode.add(tmp);
// TEST 48
        good.add("  Snqcbmł xbcnCbE         PApOFBFMbb\n\nb         uBtFOMmpnCb     kpFAFlmBHQ      ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'S'); tmp.put('y', 'n'); tmp.put('d', 'q'); tmp.put('z', 'c'); tmp.put('i', 'b'); tmp.put('a', 'm'); tmp.put('ł', 'ł'); tmp.put('F', 'x'); tmp.put('k', 'C'); tmp.put(',', 'E'); tmp.put('A', 'P'); tmp.put('s', 'A'); tmp.put('t', 'p'); tmp.put('r', 'O'); tmp.put('o', 'F'); tmp.put('n', 'B'); tmp.put('m', 'M'); tmp.put('I', 'u'); tmp.put('f', 't'); tmp.put('S', 'k'); tmp.put('w', 'l'); tmp.put('e', 'H'); tmp.put('j', 'Q');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('S', 'W'); tmp.put('n', 'y'); tmp.put('q', 'd'); tmp.put('c', 'z'); tmp.put('b', 'i'); tmp.put('m', 'a'); tmp.put('ł', 'ł'); tmp.put('x', 'F'); tmp.put('C', 'k'); tmp.put('E', ','); tmp.put('P', 'A'); tmp.put('A', 's'); tmp.put('p', 't'); tmp.put('O', 'r'); tmp.put('F', 'o'); tmp.put('B', 'n'); tmp.put('M', 'm'); tmp.put('u', 'I'); tmp.put('t', 'f'); tmp.put('k', 'S'); tmp.put('l', 'w'); tmp.put('H', 'e'); tmp.put('Q', 'j');
        goodDecode.add(tmp);
// TEST 49
        good.add("\nliCnvEc         xvniRve\noJsFAhASvv    v  ZhYAFSEsiRv       rsAJApEhuP     ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'l'); tmp.put('y', 'i'); tmp.put('d', 'C'); tmp.put('z', 'n'); tmp.put('i', 'v'); tmp.put('a', 'E'); tmp.put('ł', 'c'); tmp.put('F', 'x'); tmp.put('k', 'R'); tmp.put(',', 'e'); tmp.put('A', 'o'); tmp.put('s', 'J'); tmp.put('t', 's'); tmp.put('r', 'F'); tmp.put('o', 'A'); tmp.put('n', 'h'); tmp.put('m', 'S'); tmp.put('I', 'Z'); tmp.put('f', 'Y'); tmp.put('S', 'r'); tmp.put('w', 'p'); tmp.put('e', 'u'); tmp.put('j', 'P');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('l', 'W'); tmp.put('i', 'y'); tmp.put('C', 'd'); tmp.put('n', 'z'); tmp.put('v', 'i'); tmp.put('E', 'a'); tmp.put('c', 'ł'); tmp.put('x', 'F'); tmp.put('R', 'k'); tmp.put('e', ','); tmp.put('o', 'A'); tmp.put('J', 's'); tmp.put('s', 't'); tmp.put('F', 'r'); tmp.put('A', 'o'); tmp.put('h', 'n'); tmp.put('S', 'm'); tmp.put('Z', 'I'); tmp.put('Y', 'f'); tmp.put('r', 'S'); tmp.put('p', 'w'); tmp.put('u', 'e'); tmp.put('P', 'j');
        goodDecode.add(tmp);
// TEST 50
        good.add("          YMXBjry        ZjBMzjE        vepsFDFbjj\nj         fDGFsbrpMzj          gpFeFirDK,    ");
        tmp = new HashMap<Character, Character>();
        tmp.put('W', 'Y'); tmp.put('y', 'M'); tmp.put('d', 'X'); tmp.put('z', 'B'); tmp.put('i', 'j'); tmp.put('a', 'r'); tmp.put('ł', 'y'); tmp.put('F', 'Z'); tmp.put('k', 'z'); tmp.put(',', 'E'); tmp.put('A', 'v'); tmp.put('s', 'e'); tmp.put('t', 'p'); tmp.put('r', 's'); tmp.put('o', 'F'); tmp.put('n', 'D'); tmp.put('m', 'b'); tmp.put('I', 'f'); tmp.put('f', 'G'); tmp.put('S', 'g'); tmp.put('w', 'i'); tmp.put('e', 'K'); tmp.put('j', ',');
        goodCode.add(tmp);
        tmp = new HashMap<Character, Character>();
        tmp.put('Y', 'W'); tmp.put('M', 'y'); tmp.put('X', 'd'); tmp.put('B', 'z'); tmp.put('j', 'i'); tmp.put('r', 'a'); tmp.put('y', 'ł'); tmp.put('Z', 'F'); tmp.put('z', 'k'); tmp.put('E', ','); tmp.put('v', 'A'); tmp.put('e', 's'); tmp.put('p', 't'); tmp.put('s', 'r'); tmp.put('F', 'o'); tmp.put('D', 'n'); tmp.put('b', 'm'); tmp.put('f', 'I'); tmp.put('G', 'f'); tmp.put('g', 'S'); tmp.put('i', 'w'); tmp.put('K', 'e'); tmp.put(',', 'j');
        goodDecode.add(tmp);


        int passed = 0;
        int failed = 0;
        for (int i = 0; i < good.size(); ++i) {
            Decrypter dec = new Decrypter();
            dec.setInputText(good.get(i));
            if (!dec.getCode().equals(goodCode.get(i))) {
                System.out.println("Code test " + (i + 1) + "failed.");
                System.out.println("Expected: " + goodCode.get(i));
                System.out.println("Got: " + dec.getCode());
                ++failed;
            } else {
                ++passed;
            }
            if (!dec.getDecode().equals(goodDecode.get(i))) {
                System.out.println("Decode test " + (i + 1) + "failed.");
                System.out.println("Expected: " + goodDecode.get(i));
                System.out.println("Got: " + dec.getDecode());
                ++failed;
            } else {
                ++passed;
            }
        }
        System.out.println(passed + " tests passed, " + failed + " failed.");
    }
}
