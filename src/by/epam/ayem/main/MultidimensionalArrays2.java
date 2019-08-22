package by.epam.ayem.main;

import java.util.Arrays;

public class MultidimensionalArrays2 {

    /*2. Дана квадратная матрица. Вывести на экран элементы,
    стоящие по диагонали.*/

    public static void main(String[] args) {

        int[][] multiArray = new int[6][6];

        fillArrayRandom(multiArray);

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }

        System.out.println("========================================");

        for (int i = 0, j = 0; i < multiArray.length; i++, j++) {
            System.out.print(multiArray[i][j] + " ");
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
