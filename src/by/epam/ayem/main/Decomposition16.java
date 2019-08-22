package by.epam.ayem.main;

public class Decomposition16 {

    /*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить так же, сколько четных цифр в найденной сумме.
    Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        int sum = countSum(4);
        countOdd(sum);

    }

    private static void countOdd(int number) {

        int[] array = arrayFromNumber(number);

        int count = 0;

        for (int value : array) {
            if (!isOdd(value)) {
                count++;
            }
        }

        System.out.println("Number " + number + " has " + count + " even digits");
    }

    private static int countSum(int n) {

        int from = (int) Math.pow(10, n - 1);
        int to = (int) Math.pow(10, n) - 1;
        int sum = 0;

        System.out.println("In a range from " + from + " to " + to + ": ");

        for (int i = from; i <= to; i++) {
            if (hasOddOnly(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of all numbers with only odd digits = " + sum);
        return sum;
    }

    private static boolean hasOddOnly(int incomeNumber) {

        int[] array = new int[0];
        int index = 0;
        int number = incomeNumber;

        while (number > 0) {

            int digit = number % 10;

            if (!isOdd(digit)) {
                return false;
            }

            System.arraycopy(array, 0,
                    array = new int[array.length + 1], 0, array.length - 1);

            array[index] = digit;
            index++;
            number /= 10;
        }

        return true;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
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
