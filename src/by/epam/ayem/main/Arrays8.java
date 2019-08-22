package by.epam.ayem.main;

import java.util.Arrays;

public class Arrays8 {

    /*8. Дана последовательность целых чисел a1,a2,...an.
    Образовать новую последовательность, выбросив из исходной те члены,
    которые равны min(a1,a2,...an)*/

    public static void main(String[] args) {


        int[] array = {1, 1, 2, 1, 1, 1, 6, 7, 1, 9};
        int minValue = array[0];
        int count = 0;

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        for (int value : array) {
            if (value == minValue) {
                count++;
            }

        }

        int[] newArray = new int[array.length - count];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != minValue) {
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.println("New array: " + Arrays.toString(newArray));

    }
}
