package by.epam.ayem.main;

public class Decomposition13 {

    /*13. Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное число больше 2.
    Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        int n = 12;

        printTwins(n);

    }

    private static void printTwins(int n) {

        if (n <= 2) {
            System.out.println("Please, set up 'n' bigger than 2");
        } else {
            System.out.println("n = " + n + ", 2n = " + (2 * n));

            for (int i = n; i <= (2 * n) - 2; i++) {
                System.out.println(i + " and " + (i + 2));
            }
        }
    }
}
