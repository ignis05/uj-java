import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BruhMoment {
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
    String expOut = "0 0 0 1010 1111 1011 0 0 1110 1000 0 0 0 0";
    
    System.out.println("== test 1 ==");
    System.out.println("input (" + getSequenceLenght(inpSequence) + "): " + inpSequence);
    inputSequence(inpSequence, comp);
    comp.compress();
    Map<String, String> header = comp.getHeader();
    if (header.size() == 0) {
      System.out.println("failed to compress");
      return;
    }
    String outSequence = outputSequence(comp, inpSequence.split(" ").length);
    System.out.println("header (" + getHeaderLength(header) + "): " + header);
    System.out.println("output (" + getSequenceLenght(outSequence) + "): " + outSequence);
    System.out.println("expOut (" + getSequenceLenght(expOut) + "): " + expOut);
    System.out.println("output equals expOut: " + expOut.equals(outSequence));

    // test 02 - oramus przyklad 2
    System.out.println("\n== test 2 ==");
    comp = new Compression();
    inpSequence = "000 001 000 001 000 001 000 001 011 001 000 110 001 000 111 001 001 000 000 000 001";
    expOut = "00 01 00 01 00 01 00 01 1011 01 00 1110 01 00 1111 01 01 00 00 00 01";

    System.out.println("input (" + getSequenceLenght(inpSequence) + "): " + inpSequence);
    inputSequence(inpSequence, comp);
    comp.compress();
    header = comp.getHeader();
    if (header.size() == 0) {
      System.out.println("failed to compress");
      return;
    }
    outSequence = outputSequence(comp, inpSequence.split(" ").length);
    System.out.println("header (" + getHeaderLength(header) + "): " + header);
    System.out.println("output (" + getSequenceLenght(outSequence) + "): " + outSequence);
    System.out.println("expOut (" + getSequenceLenght(expOut) + "): " + expOut);
    System.out.println("output equals expOut: " + expOut.equals(outSequence));
    System.out.println("====");
    System.out.println("total length: " + (getSequenceLenght(outSequence) + getHeaderLength(header)));
  }
}
