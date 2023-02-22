package CycleHomework;

public class CycleHomework {
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

    public static void zeroCycle(int numberFirst, int numberSecond, String symbolFirst, String symbolSecond) {
        for (int i = 0; i < numberFirst; i++) {
            for (int j = 0; j < numberSecond; j++) {
                if(i == 0 || i == numberFirst - 1) {
                    System.out.print(symbolSecond + " ");
                }else if (j == 0 || j == numberSecond - 1) {
                    System.out.print(symbolSecond + " ");
                }else {
                    System.out.print(symbolFirst + " ");
                }
                if (j == numberSecond - 1) {
                    System.out.println("");
                }
            }
        }
    }

    public static void triangleCycle (int numberFirst, int numberSecond, String symbolFirst, String symbolSecond) {
        for (int i = 0; i < numberFirst; i++) {
            for (int j = 0; j < numberSecond; j++) {
                if (i != j) {
                    if (i > j) {
                        System.out.print(symbolSecond + " ");
                    } else {
                        System.out.print(symbolFirst + " ");
                    }
                } else {
                    System.out.print(" ");
                }
                if (j == numberSecond - 1) {
                    System.out.println("");
                }
            }
        }
    }
}
