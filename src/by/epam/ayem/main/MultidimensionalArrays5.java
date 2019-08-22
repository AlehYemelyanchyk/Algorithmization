package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays5 {

     /*5. Сформировать квадратную матрицу порядка n
    по заданному образцу (n - четное):

            | 1   1   1  ... 1   1   1 |
            | 2   2   2  ... 2   2   0 |
            | 3   3   3  ... 3   0   0 |
            | ..  ..  .. ... ..  ..  ..|
            | n-1 n-1 0  ... 0   0   0 |
            | n   0   0  ... 0   0   0 |           */

    public static void main(String[] args) {

        int n = 8;
        int[][] multiArray = new int[n][n];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length - i; j++) {
                multiArray[i][j] = i + 1;
            }
        }

        for (int[] value : multiArray) {
            System.out.println(Arrays.toString(value));
        }

    }

}
