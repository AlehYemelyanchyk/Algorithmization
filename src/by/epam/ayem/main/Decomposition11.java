package by.epam.ayem.main;

public class Decomposition11 {

    // 11. Написать метод (методы), определяющий, в каком из данныз двух чисел больше цифр.

    public static void main(String[] args) {

        int number1 = 2001;
        int number2 = 4560;

        compareDigits(number1,number2);

    }

    private static void compareDigits(int number1, int number2) {

        int[] digitsNumber1 = arrayFromNumber(number1);
        int[] digitsNumber2 = arrayFromNumber(number2);

        int number1Digits = digitsNumber1.length;
        int number2Digits = digitsNumber2.length;

        if (number1Digits > number2Digits) {
            System.out.println(number1 + " has more digits than " + number2);
        } else if (number1Digits < number2Digits) {
            System.out.println(number2 + " has more digits than " + number1);
        } else {
            System.out.println(number1 + " and " + number2 + " have the same number of digits");
        }

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
