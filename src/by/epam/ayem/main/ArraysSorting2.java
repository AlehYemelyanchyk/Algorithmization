package by.epam.ayem.main;

import java.util.Arrays;

public class ArraysSorting2 {

    /*2. Даны две последовательности a1<=a2...<=an и b1<=b2<=...bm.
    Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.*/

    public static void main(String[] args) {

        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {6, 7, 8, 9};

        System.arraycopy(arrayA, 0,
                arrayA = new int[arrayA.length + arrayB.length], 0, arrayA.length - arrayB.length);

        System.arraycopy(arrayB, 0, arrayA, arrayA.length - arrayB.length, arrayB.length);

        System.out.println(Arrays.toString(arrayA));

    }
}
