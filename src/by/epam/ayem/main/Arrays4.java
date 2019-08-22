package by.epam.ayem.main;

import java.util.Arrays;

public class Arrays4 {

    /*4. Даны действительные числа a1,a2,...an.
    Поменять местами наибольший и наименьший элементы.*/

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int minValue = array[0];
        int maxValue = array[0];
        int minValuePosition = 0;
        int maxValuePosition = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValuePosition = i;
            } else if (array[i] > maxValue) {
                maxValue = array[i];
                maxValuePosition = i;
            }
        }

        array[minValuePosition] = maxValue;
        array[maxValuePosition] = minValue;

        System.out.println("Array with inverted min and max values: " + Arrays.toString(array));

    }
}
