package by.epam.ayem.main;

public class Decomposition14 {

    /*14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведеная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    использовать декомпозицию.*/

    public static void main(String[] args) {

        int k = Integer.MAX_VALUE;

        findArmstrNumbers(k);
    }

    private static void findArmstrNumbers(int k) {

        System.out.println("Armstrong's numbers from 1 to " + k + ": ");

        for (int i = 1; i <= k; i++) {

            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int number) {

        int power = countDigits(number);
        int[] digitsArray = arrayFromNumber(number);
        int sum = 0;

        for (int value : digitsArray) {
            sum += Math.pow(value, power);
        }

        if (sum != number) {
            return false;
        }
        return true;
    }

    private static int countDigits(int number) {

        int count = 0;

        while (number > 0) {

            number /= 10;
            count++;
        }

        return count;
    }

    private static int[] arrayFromNumber(int number) {

        int[] array = new int[0];
        int index = 0;

        while (number > 0) {

            int digit = number % 10;

            System.arraycopy(array, 0,
                    array = new int[array.length + 1], 0, array.length - 1);

            array[index] = digit;
            index++;
            number /= 10;

        }

        return array;
    }

}
