package by.epam.ayem.main;

import java.util.Arrays;

public class Decomposition12 {

   /* 12. Даны натуральные числа K и N. Написать метод (методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не больше N.*/

    public static void main(String[] args) {

        int k = 6;
        int n = 500;

        int[] arrayOfNumbers = findNumbers(k, n);

        System.out.println(Arrays.toString(arrayOfNumbers));

    }

    private static int[] findNumbers(int k, int n) {

        int[] array = new int[0];
        int index = 0;

        for (int i = 1; i <= n; i++) {

            int j = i;
            int sum = 0;

            while (j > 0) {

                int digit = j % 10;

                sum += digit;
                j /= 10;
            }

            if (sum == k) {

                System.arraycopy(array, 0,
                        array = new int[array.length + 1], 0, array.length - 1);

                array[index] = i;
                index++;
            }
        }

        return array;
    }

}
