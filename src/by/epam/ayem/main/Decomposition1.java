package by.epam.ayem.main;

import java.util.Random;

public class Decomposition1 {

    /*1. Написать метод (методы) для нахождения наибольшего общего делителя
    и наименьшего общего кратного двух натуральных чисел:
                    (НОК(А,В) = А*В/НОД(А/В))                */

    private static Random random = new Random();

    public static void main(String[] args) {

        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(99);

        System.out.println("Numbers " + number1 + " and " + number2 + " has");
        System.out.println("common the biggest divider: " + biggestDivider(number1, number2));
        System.out.println("common the smallest multiple: " + smallestMultiple(number1, number2));

    }

    private static int biggestDivider(int number1, int number2) {

        int biggestNumber = biggestNumber(number1, number2);
        int smallestNumber = smallestNumber(number1, number2);
        int divider = 1;

            for (int i = 2; i <= biggestNumber; i++) {
                if (smallestNumber % i == 0 && biggestNumber % i == 0) {
                    divider = i;
                }
            }

        return divider;
    }

    private static int smallestMultiple(int number1, int number2) {

        return number1*number2/biggestDivider(number1,number2);
    }

    private static int biggestNumber(int number1, int number2) {
        return number1 >= number2 ? number1 : number2;
    }

    private static int smallestNumber(int number1, int number2) {
        return number1 <= number2 ? number1 : number2;
    }
}
