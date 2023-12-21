package dk.mtdm.display.tui;

public class CommandTUI {
  final public static String UP = "\r\033[1A";
  final public static String SKIP = "\033[1C";
  final public static String CLEAR = "\033[2J";
  final public static String RESET = "\u001b[0m";
  public static void up(int distance){
    System.out.print("\r\033[" + distance + "A");
  }
  public static void skip(int distance){
    System.out.print("\033[" + distance + "C");
  }
  public static void skipTo(int point){
    System.out.print("\033[" + point + "G");
  }
  public static void setPoint(int vertical, int horizontal){
    String out = "\033[";
    out += horizontal > 0 ? horizontal : 1;
    out += ";";
    out += vertical > 0 ? vertical : 1;
    out += "H";
    System.out.print(out);
  }
  public static void clearAll(){
    System.out.print("\033[2J");
    setPoint(0, 0);
  }
  public static void clearLine(){
    System.out.print("\r\033[1J");
  }
  public static void setColor(int r, int g, int b){
    System.out.print("\033[38;2;" + r + ";" + g + ";" + b + "m");
  }
  public static String getColor(int r, int g, int b){
    return "\033[38;2;" + r + ";" + g + ";" + b + "m";
  }
  public static void setColor(int n){
    System.out.print("\033[38;5;" + n + "m");
  }
  public static String getColor(int n){
    return "\033[38;5;" + n + "m";
  }
}
