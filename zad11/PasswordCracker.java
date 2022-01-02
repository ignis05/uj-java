import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class PasswordCracker implements PasswordCrackerInterface {

  /**
   * generates next password from passList
   * 
   * @param passList List of password components for each index
   * @return password
   */
  private static String getNextPass(List<List<Character>> passList) {
    return passList.stream().map(l -> l.get(0)).map(String::valueOf).collect(Collectors.joining());
  }

  /**
   * Increments each unknown character in passlist by 1
   * 
   * @param passList
   * @param correct  array indicating which index is already correct
   */
  private void incrementChars(List<List<Character>> passList, boolean[] correct) {
    for (int i = 0; i < passList.size(); i++) {
      if (!correct[i])
        passList.get(i).remove(0);
    }
  }

  /**
   * Parses integer from server response
   * 
   * @param res server response
   * @return correct count
   */
  private static int parseCorrectCount(String res) {
    return Integer.parseInt(res.split(" ")[4]);
  }

  @Override
  public String getPassword(String host, int port) {
    // declare variables
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    String password = null;

    // initialise connection
    try {
      socket = new Socket(host, port);
      out = new PrintWriter(socket.getOutputStream(), true);
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    } catch (IOException e) {
      System.out.println(e);
      return null;
    }

    try {
      // read welcome info
      System.out.println(in.readLine());
      out.println("Program");
      System.out.println(in.readLine());
      String schema = in.readLine();
      System.out.println(schema);
      schema = schema.split(" ")[2];
      System.out.println(in.readLine());
      System.out.println("");

      // create passList and known array
      int passLength = schema.length();
      List<List<Character>> passList = schema.chars().mapToObj(ch -> new ArrayList<Character>(PasswordComponents.passwordComponents.get((char) ch))).collect(Collectors.toList());
      boolean[] known = new boolean[passLength];
      int knownCount = 0;

      while (knownCount < passLength) {
        // create and input next password
        String nextPass = getNextPass(passList);
        out.println(nextPass);

        // check server response - parse correctCount or exit
        String res = in.readLine();
        if (res.equals("+OK")) {
          password = nextPass;
          break;
        }
        int correctCount = parseCorrectCount(res);
        System.out.println("Password " + nextPass + " has " + correctCount + " correct characters");

        // calculate how many characters can be found from this password
        int toFind = correctCount - knownCount;
        if (toFind > 0) {
          // check each character of password
          for (int i = 0; i < passLength; i++) {
            if (known[i]) // skip known chars
              continue;

            // replace the character with 100% wrong one
            // either first one from list or one slighty off back
            char[] arr = nextPass.toCharArray();
            var list = PasswordComponents.passwordComponents.get(schema.charAt(i));
            if (passList.get(i).size() == list.size()) // checking 1st char
              arr[i] = list.get(list.size() - 5);
            else
              arr[i] = list.get(0);

            // input password
            out.println(new String(arr));

            // the correct count is 1 lower than it was before =
            // = changing this character broke the password = that characer must be correct
            if (parseCorrectCount(in.readLine()) == correctCount - 1) {
              System.out.println("Found correct character for index " + i + ": " + nextPass.charAt(i));
              // mark this index as known
              known[i] = true;
              knownCount++;

              // check if there are any more characters to find with this password
              toFind--;
              if (toFind == 0)
                break;
            }
          }
        }
        // increase all indexes instead of known one
        incrementChars(passList, known);
      }

      // close connection
      out.close();
      in.close();
      socket.close();
    } catch (IOException e) {
      System.out.println(e);
      return null;
    }

    return password;
  }

  public static void main(String[] args) {
    var pc = new PasswordCracker();
    System.out.println("\nPassword " + pc.getPassword("172.30.24.15", 8080) + " is correct");
  }
}
