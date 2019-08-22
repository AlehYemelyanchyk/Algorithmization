package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays6 {

    /*6. Сформировать квадратную матрицу порядка n
    по заданному образцу (n - четное):

            | 1   1   1  ... 1   1   1 |
            | 0   1   1  ... 1   1   0 |
            | 0   0   1  ... 1   0   0 |
            | ..  ..  .. ... ..  ..  ..|
            | 0   1   1  ... 1   1   0 |
            | 1   1   1  ... 1   1   1 |           */

    public static void main(String[] args) {

        int n = 10;
        int[][] multiArray = new int[n][n];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = multiArray[i].length / 2; j < multiArray.length - i; j++) {
                multiArray[i][j] = 1;
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = i; j < multiArray.length / 2; j++) {
                multiArray[i][j] = 1;
            }
        }

        for (int i = multiArray.length - 1; i >= multiArray.length / 2; i--) {
            for (int j = multiArray[i].length / 2; j <= i; j++) {
                multiArray[i][j] = 1;
            }
        }

        for (int i = multiArray.length - 1; i >= multiArray.length / 2; i--) {
            for (int j = (multiArray.length - 1) - i; j < multiArray[i].length / 2; j++) {
                multiArray[i][j] = 1;
            }
        }

        for (int[] value : multiArray) {
            System.out.println(Arrays.toString(value));
        }

    }

}
