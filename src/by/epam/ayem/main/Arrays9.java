package by.epam.ayem.main;

public class Arrays9 {

    /*9. В массиве целых чисел с количеством элементов n
    найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них.*/

    public static void main(String[] args) {

        int[] array = {0, 6, 6, 6, 1, 2, 3, 3, 3, 4};
        int maxCount = 0;
        int lowerMaxRepeatedValue = Integer.MAX_VALUE;

        for (int value : array) {
            int count = 0;
            for (int item : array) {
                if (value == item) {
                    count++;
                }
            }
            if (maxCount <= count) {
                if (lowerMaxRepeatedValue > value || maxCount < count) {
                    lowerMaxRepeatedValue = value;
                }
                maxCount = count;
            }
        }

        System.out.println("The lowest from the most repeated values = " + lowerMaxRepeatedValue);
    }
}
