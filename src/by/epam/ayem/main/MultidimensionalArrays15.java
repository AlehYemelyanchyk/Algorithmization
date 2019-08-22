package by.epam.ayem.main;

import java.util.Random;

public class MultidimensionalArrays15 {

    /*15. Найти наибольший элемент матрицы и
    заменить все нечетные элементы на него.*/

    public static void main(String[] args) {

        int[][] multiArray = new int[6][6];

        fillMultiArrayRandom(multiArray);

        printMultiArray(multiArray);

        System.out.println("========================================");
        System.out.println("The biggest number: " + biggestNumber(multiArray));
        System.out.println("========================================");

        replaceOdd(multiArray, biggestNumber(multiArray));

        printMultiArray(multiArray);

    }

    private static int[][] replaceOdd(int[][] multiArray, int biggestNumber) {

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (isOdd(multiArray[i][j])) {
                    multiArray[i][j] = biggestNumber;
                }
            }
        }
        return multiArray;
    }

    private static int biggestNumber(int[][] multiArray) {

        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] > biggestNumber) {
                    biggestNumber = multiArray[i][j];
                }
            }
        }
        return biggestNumber;

    }

    private static boolean isOdd(int number) {

        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printMultiArray(int[][] multiArray) {

        for (int[] string : multiArray) {
            for (int value : string) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ");
        }
    }

    private static int[][] fillMultiArrayRandom(int multiArray[][]) {

        Random random = new Random();

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = random.nextInt(100);
            }
        }
        return multiArray;
    }

}
