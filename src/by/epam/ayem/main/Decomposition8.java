package by.epam.ayem.main;

import java.util.Random;

public class Decomposition8 {

    /*8. Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
    Пояснение. Составить метод (методы) для вычисления суммы трех последовательно расположенных
    элементов массива с номерами от k до m.*/

    private static Random random = new Random();

    private static int k = 3;
    private static int m = k + 2;

    public static void main(String[] args) {

        int[] array = new int[6];

        fillArrayRandom(array);
        printArray(array);

        countSum(array);

    }

    private static void countSum(int[] array) {

        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += array[i];
        }

        System.out.println("Sum of three consistent elements from " + (k + 1) + " to " + (m + 1) + " = " + sum);
    }

    private static int[] fillArrayRandom(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }

    private static void printArray(int[] array) {

        System.out.print("Array:");

        for (int value : array) {
            System.out.printf("%5d", value);
        }
        System.out.println(" ");
    }

}
