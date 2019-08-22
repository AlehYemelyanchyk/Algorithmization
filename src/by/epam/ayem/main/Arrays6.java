package by.epam.ayem.main;

public class Arrays6 {

    /*6.Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются
    простыми числами.*/

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isSimple(i)) {
                sum += array[i];
            }
        }

        System.out.println("Sum = " + sum);
    }

    private static boolean isSimple(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
