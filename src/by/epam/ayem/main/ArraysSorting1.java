package by.epam.ayem.main;

import java.util.Arrays;

public class ArraysSorting1 {

/*1. Заданы два одномерных массива с различным количеством элементов
и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.*/

    public static void main(String[] args) {

        int k = 2;
        int j = 0;

        int[] arrayA = {1, 1, 1, 1, 1, 1};
        int[] arrayB = {3, 2, 2, 2, 2,};
        int[] arrayMerged = new int[arrayA.length + arrayB.length];

        for (int i = 0; i <= k; i++, j++) {
            arrayMerged[i] = arrayA[i];
        }

        for (int i = 0; i < arrayB.length; i++, j++) {
            arrayMerged[j] = arrayB[i];
        }

        for (int i = j; i < arrayMerged.length; i++, k++) {
            arrayMerged[i] = arrayA[k + 1];
        }

        System.out.println(Arrays.toString(arrayMerged));
    }
}
