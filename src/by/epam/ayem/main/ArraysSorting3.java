package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorting3 {

    /*3. Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.
    Требуется переставить элементы так, чтобы они были расположены по убыванию.
    Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
    а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
    Написать алгоритм сортировки выбором.*/

    public static void main(String[] args) {

        int[] array = new int[10];

        fillArray(array);

        System.out.println("Initial array: " + Arrays.toString(array));

        sortArrayBySelection(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

    }

    private static int[] sortArrayBySelection(int[] array) {

        int position = 0;

        for (int i = 0; i < array.length; i++) {

            int maxValue = Integer.MIN_VALUE;

            for (int j = i; j < array.length; j++) {
                if (array[j] > maxValue) {
                    maxValue = array[j];
                    position = j;
                }
            }

            int temp = array[i];
            array[i] = maxValue;
            array[position] = temp;
        }
        return array;
    }

    private static int[] fillArray(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - random.nextInt(19);
        }
        return array;
    }

}
