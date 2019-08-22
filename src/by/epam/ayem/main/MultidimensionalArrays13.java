package by.epam.ayem.main;

import java.util.Random;

public class MultidimensionalArrays13 {

/*13. Отсортировать столбцы матрицы по возрастанию
    и убыванию значений элементов.*/

    public static void main(String[] args) {

        int sizeOfArray = 8;
        int[][] multiArray = new int[sizeOfArray][sizeOfArray];

        fillArrayRandom(multiArray);

        printMultiArray(multiArray);

        System.out.println("========================================");

        int[][] sortedUpArray = sortArrayUp(multiArray);

        printMultiArray(sortedUpArray);
        System.out.println("========================================");

        int[][] sortedDownArray = sortArrayDown(multiArray);

        printMultiArray(sortedDownArray);

    }

    private static void printMultiArray(int[][] multiArray) {

        for (int[] string : multiArray) {
            for (int value : string) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ");
        }

    }

    private static int[][] sortArrayUp(int[][] array) {

        boolean quit = false;
        int temp;

        while (!quit) {

            quit = true;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if (i == 0) {
                        array[i][j] = array[i][j];

                    } else if (array[i][j] < array[i - 1][j]) {
                        temp = array[i - 1][j];
                        array[i - 1][j] = array[i][j];
                        array[i][j] = temp;
                        quit = false;
                    }
                }
            }
        }
        return array;
    }

    private static int[][] sortArrayDown(int[][] array) {

        boolean quit = false;
        int temp;

        while (!quit) {

            quit = true;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if (i == 0) {
                        array[i][j] = array[i][j];

                    } else if (array[i - 1][j] < array[i][j]) {
                        temp = array[i - 1][j];
                        array[i - 1][j] = array[i][j];
                        array[i][j] = temp;
                        quit = false;
                    }
                }
            }
        }
        return array;
    }

    private static int[][] fillArrayRandom(int array[][]) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

}
