public class Main {
  public static void main(String[] args) {
    fullCycle(6,6, "*");
  }

  public static void fullCycle(int numberFirst, int numberSecond, String symbol) {
    for (int i = 0; i < numberFirst; i++) {
      for (int j = 0; j < numberSecond; j++) {
        System.out.print(symbol + " ");
        if (j == numberSecond - 1) {
          System.out.println("");
        }
      }
    }
  }
}
