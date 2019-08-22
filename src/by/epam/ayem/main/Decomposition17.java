package by.epam.ayem.main;

public class Decomposition17 {

    /*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        numberOfSubtractions(1225);

    }

    private static void numberOfSubtractions(int incomeNumber) {

        int iterations = 0;
        int number = incomeNumber;

        while (number > 0) {

            number -= sumOfDigits(number);
            iterations++;

        }

        System.out.println("Should be " + iterations + " subtractions to get zero from " + incomeNumber);
    }

    private static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

}
