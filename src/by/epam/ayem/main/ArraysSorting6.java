package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorting6 {

    /*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Eсли ai<=ai+1,
    то продвигаются на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются
    на один элемент назад. Составить алгоритм этой сортировки.*/

    public static void main(String[] args) {

        int[] array = new int[10];

        fillArray(array);

        System.out.println("Initial array: " + Arrays.toString(array));

        sortArrayByShell(array);

        System.out.println("Sorted array: " + Arrays.toString(array));


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

        Random random = new Random(1);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19);
        }
        return array;
    }

}
