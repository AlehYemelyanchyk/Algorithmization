package by.epam.ayem.main;

import java.util.Arrays;

public class Arrays10 {

    /*10. Дан целочисленный массив с количеством элементов n.
    Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями).
    Примечание: Дополнительный массив не использовать.*/

    public static void main(String[] args) {

        int[] array = new int[10];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Initial array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i += 2) {
            array[j] = array[i];
            j++;
        }

        for (int i = j; i < array.length; i++) {
            array[i] = 0;
        }

        System.out.println("New array: " + Arrays.toString(array));
    }
}
