package ArraysHomework;

import java.util.Arrays;

public class ArraysHomework {

    static int[] linearArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[][] arrDiagonal = new int[6][6];

    public static void multiByTwo() {
        for (int i = 0; i < linearArray.length; i++) {
            if (linearArray[i] < 6) {
                linearArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(linearArray));
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

    public static void minMaxElement () {
        //Вариант с помощью stream
        int minElement = Arrays.stream(linearArray).min().getAsInt();
        int maxElement = Arrays.stream(linearArray).max().getAsInt();
        System.out.println("Вывод с помощью стримов");
        System.out.println(" - Минимальный элемент массива " + minElement);
        System.out.println(" - Максимальный элемент массива " + maxElement);

        //Вариант с помощью циклов
        int minElemWithCycle = linearArray[0];
        int maxElemWithCycle = linearArray[0];
        for (int e : linearArray) {
            if (e < minElemWithCycle) {
                minElemWithCycle = e;
            } else if (e > maxElemWithCycle){
                maxElemWithCycle = e;
            }
        }
        System.out.println("\nВывод с помощью циклов:");
        System.out.println(" - Минимальный элемент массива " + minElemWithCycle);
        System.out.println(" - Максимальный элемент массива " + maxElemWithCycle);
    }
}
