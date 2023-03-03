package ArraysHomework;

import java.util.Arrays;

public class ArraysHomework {

    static int[] arrMultiByTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[][] arrDiagonal = new int[6][6];

    public static void multiByTwo() {
        for (int i = 0; i < arrMultiByTwo.length; i++) {
            if (arrMultiByTwo[i] < 6) {
                arrMultiByTwo[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrMultiByTwo));
    }

    public static void createArrDiagonal() {
        int arrLength = arrDiagonal.length - 1;
        for (int i = 0; i < arrDiagonal.length; i++) {
            for (int j = 0; j < arrDiagonal.length; j++) {
                if (arrDiagonal[i] == arrDiagonal[j] || (i + j) == arrLength) {
                    arrDiagonal[i][j] = 1;
                }
            }
        }
        Arrays.stream(arrDiagonal).map(Arrays::toString).forEach(System.out::println);
    }
}
