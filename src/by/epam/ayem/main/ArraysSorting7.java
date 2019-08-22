package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorting7 {

    /*7. Пусть даны 2 неубывающие последовательности чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
    Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm
    в первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/

    private static Random random = new Random();

    private static int searchCount = 0;

    public static void main(String[] args) {

        int SizeArrayA = random.nextInt(20);
        int SizeArrayB = random.nextInt(20);

        int[] arrayA = new int[SizeArrayA];
        int[] arrayB = new int[SizeArrayB];

        fillArray(arrayA);
        fillArray(arrayB);
        sortArrayByShell(arrayA);
        sortArrayByShell(arrayB);


        System.out.println("Initial arrayA: " + Arrays.toString(arrayA));
        System.out.println("Initial arrayB: " + Arrays.toString(arrayB));

        System.arraycopy(arrayA, 0,
                arrayA = new int[arrayA.length + arrayB.length], 0, arrayA.length - arrayB.length);

        sortArrayByBinarySearch(arrayA, arrayB);

        System.out.println("Combined arrayA: " + Arrays.toString(arrayA));


    }

    private static int[] sortArrayByBinarySearch(int[] arrayA, int[] arrayB) {

        for (int value : arrayB) {

            int position = binarySearch(arrayA, arrayB, value);

            for (int j = arrayA.length - 1; j > position; j--) {
                arrayA[j] = arrayA[j - 1];
            }
            arrayA[position] = value;
        }
        return arrayA;
    }

    private static int binarySearch(int[] arrayA, int[] arrayB, int value) {

        int index = 0;
        int minIndex = 0;
        int maxIndex = arrayA.length - arrayB.length - 1 + searchCount;

        boolean quit = false;

        while (!quit) {

            int indexMover;

            indexMover = (maxIndex - minIndex) / 2;

            index = minIndex + indexMover;

            if (maxIndex == minIndex || value == arrayA[index]) {
                quit = true;
            } else if ((value > arrayA[index])) {
                minIndex = index;
            } else if ((value < arrayA[index])) {
                maxIndex = index;
            }

            if (indexMover == 0) {

                while (!quit && value > arrayA[index]
                        && index < arrayA.length - arrayB.length + searchCount) {

                    index++;

                    if (index > arrayA.length - 1) {
                        index = arrayA.length - 1;
                        quit = true;
                    }
                }
                quit = true;
            }
        }

        searchCount++;

        return index;
    }

    private static int[] sortArrayByShell(int[] array) {

        int index = 0;

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
        return array;
    }

    private static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - random.nextInt(19);
        }
        return array;
    }

}
