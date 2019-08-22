package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays9 {

    /*9. Задана матрица неотрицательных чисел.
    Посчитать сумму всех элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.*/

    public static void main(String[] args) {

        int[][] multiArray = new int[4][6];

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }

        System.out.println("========================================");

        int[] maxSumWithColumn = maxSumInColumns(multiArray);
        int maxSum = maxSumWithColumn[0];
        int columnNumber = maxSumWithColumn[1];

        System.out.println("Max sum = " + maxSum + " in the " + columnNumber + " column");

    }

    private static int[] maxSumInColumns(int[][] multiArray) {

        int maxSum = 0;
        int column = 0;
        int columnNumber = 0;

        while (column < multiArray.length) {

            int sum = 0;

            for (int i = 0; i < multiArray.length; i++) {
                sum += multiArray[i][column];
            }
            if (maxSum < sum) {
                maxSum = sum;
                columnNumber = column;
            }

            column++;
        }

        int[] maxSumWithColumn = new int[2];
        maxSumWithColumn[0] = maxSum;
        maxSumWithColumn[1] = columnNumber + 1;

        return maxSumWithColumn;
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
