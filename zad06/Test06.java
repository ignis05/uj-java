import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test06 {
  // imputs words separated with spaces
  public static void inputSequence(String sequence, Compression comp) {
    for (var word : sequence.split(" "))
      comp.addWord(word);
  }

  // joins output words into single string
  public static String outputSequence(Compression comp, int size) {
    List<String> ls = new LinkedList<String>();
    for (int i = 0; i < size; i++) {
      ls.add(comp.getWord());
    }
    return String.join(" ", ls);
  }

  // uses header to decompress compressed sequence
  public static String decompressSequence(Map<String, String> header, String sequence) {
    List<String> arr = new ArrayList<String>(List.of(sequence.split(" ")));
    for (var el : header.entrySet()) {
      Collections.replaceAll(arr, el.getKey(), "1" + el.getValue());
    }
    arr = arr.stream().map(el -> el.substring(1)).collect(Collectors.toList());
    return String.join(" ", arr);
  }

  // calculates header bit length
  public static int getHeaderLength(Map<String, String> header) {
    var entry1 = header.entrySet().iterator().next();
    return (entry1.getKey().length() + entry1.getValue().length()) * header.size();
  }

  // calculates sequence length
  public static int getSequenceLenght(String sequence) {
    return List.of(sequence.split(" ")).stream().mapToInt(String::length).sum();
  }

  public static void main(String[] args) {

    // test 01 - oramus przyklad 1
    var comp = new Compression();
    String inpSequence = "001 001 001 010 111 011 001 001 110 000 001 001 001 001";
    inputSequence(inpSequence, comp);
    comp.compress();
    String outSequence = outputSequence(comp, inpSequence.split(" ").length);
    Map<String, String> header = comp.getHeader();
    System.out.println("test 01 " + ("0 0 0 1010 1111 1011 0 0 1110 1000 0 0 0 0".equals(outSequence) ? "passed" : "failed"));

    // test 02 - oramus przyklad 2
    comp = new Compression();
    inpSequence = "000 001 000 001 000 001 000 001 011 001 000 110 001 000 111 001 001 000 000 000 001";
    inputSequence(inpSequence, comp);
    comp.compress();
    outSequence = outputSequence(comp, inpSequence.split(" ").length);
    header = comp.getHeader();
    System.out.println("test 02 - valid output " + (inpSequence.equals(decompressSequence(header, outSequence)) ? "passed" : "failed"));

    int resLength = getSequenceLenght(outSequence) + getHeaderLength(header);
    int expLength = getSequenceLenght("00 01 00 01 00 01 00 01 1011 01 00 1110 01 00 1111 01 01 00 00 00 01") + 10;
    if (resLength != expLength)
      System.out.println("test 02 - optimal compression failed - resultLength:" + resLength + ", optimal:" + expLength);
    else
      System.out.println("test 02 - optimal compression passed");

    // test 03 - unable to compress
    comp = new Compression();
    inpSequence = "00 01 10 11";
    inputSequence(inpSequence, comp);
    comp.compress();
    header = comp.getHeader();
    System.out.println("test 03 " + (header.size() == 0 ? "passed" : "failed"));
  }
}
