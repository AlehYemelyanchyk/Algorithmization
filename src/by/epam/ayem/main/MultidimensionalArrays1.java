package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays1 {

     /*1. Дана матрица. Вывысти на экран все нечетные столбцы,
     у которых первый элемент больше последнего.*/

    public static void main(String[] args) {

        int[][] multiArray = new int[4][10];

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }

        System.out.println("========================================");

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (isOdd(j + 1) && j == firstBiggerThanLast(multiArray, j)) {
                    System.out.print(multiArray[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }

    private static boolean isOdd(int i) {

        if (i % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int firstBiggerThanLast(int[][] array, int j) {

        int first;
        int last;

        for (int i = 0; i < array[0].length; i++) {
            first = array[0][i];
            last = array[array.length - 1][i];
            if (first > last && i == j) {
                return i;
            }
        }
        return -1;
    }

    private static int[][] fillArrayRandom(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return array;
    }
}
