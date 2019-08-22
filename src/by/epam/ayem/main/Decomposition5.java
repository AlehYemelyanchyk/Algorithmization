package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class Decomposition5 {

    /*5. Составить программу, которая в массиве A[N] находит второе по величине число
    (вывести на печать число, которое меньше максимального элемента массива,
    но больше всех других элементов).*/

    public static void main(String[] args) {

        int[] array = new int[10];

        fillArray(array);

        System.out.println(Arrays.toString(array));

        secondBiggestNumber(array);

    }

    private static void secondBiggestNumber(int[] array) {

        int index = 0;
        int numberCorrection = 1;

        while (index < array.length - 1) {
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;

                if (index > 0) {
                    index--;
                }

            } else {
                index++;
            }
        }

        while (array[array.length - numberCorrection] >= array[array.length - 1]) {
            numberCorrection++;
        }

        System.out.println("Second the biggest number is " + array[array.length - numberCorrection]);
    }

    private static int[] fillArray(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

}
