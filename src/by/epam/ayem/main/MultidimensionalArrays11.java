package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrays11 {

    /*11. Матрицу 10х20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается 3 и более раз.*/

    private static Random random = new Random();

    public static void main(String[] args) {

        int[][] multiArray = new int[10][20];
        int[] stringsArray = new int[10];

        Arrays.fill(stringsArray, -1);

        int index = 0;

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {

            int count = 0;

            System.out.print((i) + ". ");

            for (int j = 0; j < multiArray.length; j++) {
                System.out.printf("%4d", multiArray[i][j]);

                if (multiArray[i][j] == 5) {
                    count++;
                }

            }

            System.out.println(" ");

            if (count >= 3) {
                stringsArray(index, i, stringsArray);
                index++;
            }
        }

        printArray(stringsArray);
    }

    private static void printArray(int[] array) {

        System.out.println("\nStrings with value of 5 more than 2 times: ");

        for (int value : array) {
            if (value >= 0) {
                System.out.println(value);
            }
        }
    }

    private static int[] stringsArray(int index, int stringNumber, int[] array) {

        array[index] = stringNumber;

        return array;
    }

    private static int[][] fillArrayRandom(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }
        return array;
    }
}
