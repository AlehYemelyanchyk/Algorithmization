package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays3 {

    // 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public static void main(String[] args) {

        int[][] multiArray = new int[6][6];
        int stringToPrint = 3;
        int columnToPrint = 3;

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }

        System.out.println("========================================");

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (i == stringToPrint-1 || j == columnToPrint - 1) {
                    System.out.print(multiArray[i][j] + " ");
                }
            }
            System.out.println(" ");
        }

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
