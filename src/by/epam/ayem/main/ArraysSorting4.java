package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorting4 {

    /*4. Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an.
    Требуется поставить числа в порядке возрастания. Для этого сравнивают два соседних числа ai и ai+1,
    Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
    в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количество перестановок.*/

    public static void main(String[] args) {

        int[] array = new int[10];

        fillArray(array);

        System.out.println("Initial array: " + Arrays.toString(array));

        sortArrayByExchange(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

    }

    private static int[] sortArrayByExchange(int[] array) {

        int count = 0;
        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    count++;
                    quit = false;
                }
            }
        }
        System.out.println("Reversions: "+count);
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

