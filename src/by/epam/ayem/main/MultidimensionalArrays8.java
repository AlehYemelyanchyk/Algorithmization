package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays8 {

    /*8. В числовой матрице поменять местами два любых столбца,
    т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
    а элементы второго переместить в первый.
    Номера столбцов вводит пользователь с клавиатуры.*/

    private static Scanner scanner = new Scanner(System.in);

    private static int arraySize = 6;

    public static void main(String[] args) {

        int[][] multiArray = new int[arraySize][arraySize];

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }

        System.out.println("========================================");

        System.out.println("Enter column #1: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter column #1: ");
        }

        int a = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.println("Enter column #2: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter column #2: ");
        }

        int b = scanner.nextInt() - 1;
        scanner.nextLine();

        int[][] newArray = replaceColumns(multiArray, a, b);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }

    private static int[][] replaceColumns(int[][] array, int a, int b) {

        int[][] newArray = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == a) {
                    newArray[i][j] = array[i][b];
                } else if (j == b) {
                    newArray[i][j] = array[i][a];
                } else {
                    newArray[i][j] = array[i][j];
                }
            }
        }
        return newArray;
    }

    private static int[][] fillArrayRandom(int multiArray[][]) {

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return multiArray;
    }

}
