package by.epam.ayem.main;

public class Decomposition15 {

    /*15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        findNumbers(4);
    }

    private static void findNumbers(int n) {

        int from = (int) Math.pow(10, n - 1);
        int to = (int) Math.pow(10, n) - 1;

        System.out.println("In a range from " + from + " to " + to + ": ");

        arrayFromNumber(from, to);

    }

    private static void arrayFromNumber(int from, int to) {

        for (int i = from; i <= to; i++) {

            int[] array = new int[0];
            int index = 0;
            int number = i;

            while (number > 0) {

                int digit = number % 10;

                if (number == 0 || (index > 0 && !isBigger(digit, array[index - 1]))) {
                    break;
                }

                System.arraycopy(array, 0,
                        array = new int[array.length + 1], 0, array.length - 1);

                array[index] = digit;
                index++;
                number /= 10;
            }

            if (number == 0) {
                System.out.println(i);
            }
        }
    }

    private static boolean isBigger(int number1, int number2) {
        return number2 > number1;
    }

}
