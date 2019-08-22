package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays4 {

    /*4. Сформировать квадратную матрицу порядка n
    по заданному образцу (n - четное):

            | 1   2   3  ... n |
            | n  n-1 n-2 ... 1 |
            | 1   2   3  ... n |
            | n  n-1 n-2 ... 1 |
            | .   .   .  ... . |
            | n  n-1 n-2 ... 1 |          */

    public static void main(String[] args) {

        int n = 8;
        int[][] multiArray = new int[n][n];

        for (int i = 0; i < multiArray.length; i += 2) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = j + 1;
            }
        }

        for (int i = 1; i < multiArray.length; i += 2) {
            for (int j = multiArray[i].length - 1; j >= 0; j--) {
                multiArray[i][(multiArray[i].length - 1) - j] = j + 1;
            }
        }

        for (int[] value : multiArray) {
            System.out.println(Arrays.toString(value));
        }

    }


}
