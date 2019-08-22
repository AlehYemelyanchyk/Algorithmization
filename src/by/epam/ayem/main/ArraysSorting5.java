package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorting5 {

    /*4. Сортировка вставками. Дана последовательность чисел a1<=a2<=...<=an.
    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
    Пусть a1,a2,...,ai - упорядоченная последовательность, т.е. a1<=a2<=...<=an.
    Берется следующее число ai+1 и вставляется в последовательность так,
    чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор,
    пока все элементы от i+1 до n не будут перебраны.
    Примечание. Место помещения очередного элементы в отсортированную часть производить с помощью
    двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/

    private static Random random = new Random();

    private static int sortIndex = random.nextInt(20);
    private static int searchCount = 0;

    public static void main(String[] args) {

        int[] array = new int[20];

        fillArray(array);
        sortArrayByExchange(array);

        System.out.println("Sort index = "+sortIndex);

        System.out.println("Half-sorted array: " + Arrays.toString(array));

        sortArrayByBinarySearch(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static int[] sortArrayByBinarySearch(int[] array) {

        for (int i = sortIndex + searchCount; i < array.length; i++) {
            int index = i;
            int position = binarySearch(array, array[index]);

            while (index != position) {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        return array;
    }

    private static int binarySearch(int[] arrayA, int value) {

        int index = 0;
        int minIndex = 0;
        int maxIndex = sortIndex + searchCount;

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
                        && index < arrayA.length / 2 + searchCount) {

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

    private static int[] sortArrayByExchange(int[] array) {

        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 1; i < sortIndex; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    quit = false;
                }
            }
        }
        return array;
    }

    private static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            boolean quit = false;

            while (!quit) {

                int newNumber = 1 + random.nextInt(29);
                if (!isExist(array, newNumber)) {
                    array[i] = newNumber;
                    quit = true;
                }
            }
        }
        return array;
    }

    private static boolean isExist(int[] multiArray, int number) {

        for (int value : multiArray) {

            if (number == value) {
                return true;
            }
        }
        return false;
    }
}
