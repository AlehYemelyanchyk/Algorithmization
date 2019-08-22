package by.epam.ayem.main;

import java.util.Arrays;

public class Decomposition10 {

    /*10. Дано натуральное число N. Написать метод (методы) для формирования массива,
    элементами которого являются цифры числа N.*/

    public static void main(String[] args) {

        int n = 74657830;

        int[] arrayN = arrayFromNumber(n);

        System.out.println(Arrays.toString(arrayN));
    }

    private static int[] arrayFromNumber(int number) {

        int[] array = new int[0];
        int index = 0;

        while (number > 0) {

            int digit = number % 10;

            System.arraycopy(array, 0, array = new int[array.length + 1], 0, array.length - 1);

            array[index] = digit;
            index++;
            number /= 10;

        }

        int [] reversedArray = reverseArray(array);

        return reversedArray;
    }

    private static int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }

        return reversedArray;
    }

}
