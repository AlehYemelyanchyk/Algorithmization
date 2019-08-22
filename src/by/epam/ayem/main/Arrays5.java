package by.epam.ayem.main;

public class Arrays5 {

    /*5. Даны целые числа a1,a2,...an.
    Вывести на печать только те числа, для которых ai > i.*/

    public static void main(String[] args) {

        int[] array = {0, 11, 2, 33, 4, 5, 6, 7, 8, 9};
        int value;

        for (int i = 0; i < array.length; i++) {
            value = array[i];
            if (value > i) {
                System.out.println(value);
            }
        }
    }
}
