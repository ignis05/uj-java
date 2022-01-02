import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class PasswordCracker implements PasswordCrackerInterface {
  public int attempts = 0;

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
    attempts = 0;

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
      boolean passwordFound = false;

      while (!passwordFound) {
        // create and input next password
        String nextPass = getNextPass(passList);
        out.println(nextPass);
        attempts++;

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

            // its the last character in list - it must be correct
            if (passList.get(i).size() == 1) {
              System.out.println("Found correct character for index " + i + ": " + nextPass.charAt(i));
              // mark this index as known
              known[i] = true;
              knownCount++;

              // check if there are any more characters to find with this password
              toFind--;
              if (toFind == 0)
                break;
              continue;
            }

            // replace single character with next one from schema
            // if CorrectCount decreases that character was correct
            // if CorrectCount increases that character was wrong, but we know the correct
            char[] arr = nextPass.toCharArray();
            arr[i] = passList.get(i).get(1);

            // input password
            out.println(new String(arr));
            attempts++;

            String res2 = in.readLine();
            if (res2.equals("+OK")) {
              password = nextPass;
              passwordFound = true;
              break;
            }
            int cor2 = parseCorrectCount(res2);
            // the correct count is 1 lower than it was before
            if (cor2 == correctCount - 1) {
              System.out.println("Found correct character for index " + i + ": " + nextPass.charAt(i));
              // mark this index as known
              known[i] = true;
              knownCount++;

              // check if there are any more characters to find with this password
              toFind--;
              if (toFind == 0)
                break;
            }
            // accidently found new correct char
            else if (cor2 == correctCount + 1) {
              System.out.println("Accidently found correct character for index " + i + ": " + arr[i]);
              // mark this index as known
              known[i] = true;
              knownCount++;
              // increment list to that char
              passList.get(i).remove(0);
            }
          }
        }
        // increase all indexes except for known ones
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
    int tests = 100;

    var pc = new PasswordCracker();
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      String pass = pc.getPassword("172.30.24.15", 8080);
      if (pass == null)
        throw new RuntimeException("Password cracking failed");
      System.out.println("\nPassword " + pass + " is correct (took " + pc.attempts + " attempts)");
      sum += pc.attempts;
    }
    System.out.println("\nTest complete: cracked " + tests + " passwords with average of " + (sum / tests) + " attempts per password");
  }
}
