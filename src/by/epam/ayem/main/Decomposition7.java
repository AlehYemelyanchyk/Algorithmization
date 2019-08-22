package by.epam.ayem.main;

public class Decomposition7 {

    // 7. Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public static void main(String[] args) {

        countAllFactorials();
    }

    private static void countAllFactorials() {

        int sum = 0;

        for (int i = 1; i <= 9; i++) {

            if (isOdd(i)) {
                System.out.println(i + ": " + countFactorial(i));
                sum += countFactorial(i);
            }

        }

        System.out.println("Sum of factorials = " + sum);
    }

    private static int countFactorial(int number) {

        int factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static boolean isOdd(int number) {

        return (number % 2 != 0);
    }

}
