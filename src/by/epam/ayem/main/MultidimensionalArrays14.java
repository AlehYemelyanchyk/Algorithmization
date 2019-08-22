package by.epam.ayem.main;

import java.util.Random;

public class MultidimensionalArrays14 {

    /*14. Сформировать случайную матрицу m x n,
    состоящую из нулей и единиц, причем в каждом столбце
    число единиц равно номеру столбца.*/

    private static Random random = new Random();

    public static void main(String[] args) {

        int n = 2 + random.nextInt(9);
        int m = n + random.nextInt(9);

        int[][] multiArray = new int[m][n];

        randomFill(multiArray);

        printMultiArray(multiArray);

        System.out.println("========================================");

    }

    private static int[][] randomFill(int[][] multiArray) {

        for (int j = 0; j < multiArray[0].length; j++) {
            int count = 0;
            while (count < j) {
                int index = random.nextInt(multiArray.length);
                if (multiArray[index][j] == 0) {
                    multiArray[index][j] = 1;
                    count++;
                }
            }
        }
        return multiArray;
    }

    private static void printMultiArray(int[][] multiArray) {

        for (int i = 0; i < multiArray[0].length; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println("\n ");

        for (int[] string : multiArray) {
            for (int value : string) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ");
        }
    }
}
