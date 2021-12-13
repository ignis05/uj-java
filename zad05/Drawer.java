public class Drawer {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[40m";
  public static final String ANSI_RED = "\u001B[41m";
  public static final String ANSI_GREEN = "\u001B[42m";
  public static final String ANSI_YELLOW = "\u001B[43m";
  public static final String ANSI_BLUE = "\u001B[44m";
  public static final String ANSI_PURPLE = "\u001B[45m";
  public static final String ANSI_CYAN = "\u001B[46m";
  public static final String ANSI_WHITE = "\u001B[47m";

  public static void goTo(int line) {
    System.out.print("\u001B[" + line + ";0H");
  }

  public static void print(Color[][] array) {
    // System.out.print("\u001B[2J");
    for (var line : array) {
      for (var col : line) {
        switch (col.toString()) {
        case "W":
          System.out.print(ANSI_WHITE);
          break;
        case "R":
          System.out.print(ANSI_RED);
          break;
        case "G":
          System.out.print(ANSI_GREEN);
          break;
        case "O":
          System.out.print(ANSI_YELLOW);
          break;
        }
        System.out.print("  " + ANSI_RESET);
      }
      System.out.print("\n");
    }
  }
}