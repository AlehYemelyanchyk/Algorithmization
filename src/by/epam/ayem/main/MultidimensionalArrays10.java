package by.epam.ayem.main;

import java.util.Random;

public class MultidimensionalArrays10 {

    /*10. Найти положительные элементы главной диагонали
    квадратной матрицы.*/

    public static void main(String[] args) {

        int sizeOfArray = 8;
        int[][] multiArray = new int[sizeOfArray][sizeOfArray];

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                System.out.printf("%4d", multiArray[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("========================================");

        int[] positiveNumbers = positiveNumbers(multiArray);

        System.out.print("Positive numbers: ");

        for (int number : positiveNumbers) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
    }

    private static int[] positiveNumbers(int[][] multiArray) {

        int[] positiveNumbers = new int[multiArray.length];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                if (i == j) {
                    positiveNumbers[i] = multiArray[i][j];
                }
            }
        }
        return positiveNumbers;
    }

    private static int[][] fillArrayRandom(int array[][]) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 99 - random.nextInt(198);
            }
        }
        return array;
    }
}
