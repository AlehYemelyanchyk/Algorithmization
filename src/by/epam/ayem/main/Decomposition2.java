package by.epam.ayem.main;

import java.util.Random;

public class Decomposition2 {

    // 2. Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

    private static Random random = new Random();

    public static void main(String[] args) {

        int number1 = 1 + random.nextInt(99);
        int number2 = 1 + random.nextInt(99);
        int number3 = 1 + random.nextInt(99);
        int number4 = 1 + random.nextInt(99);

        int biggestDivider = biggestDivider(number1, number2, number3, number4);

        System.out.println("The biggest divider for numbers: "
                + number1 + ", " + number2 + ", " + number3 + ", " + number4 + " is number " + biggestDivider);

    }

    private static int biggestDivider(int number1, int number2, int number3, int number4) {

        int[] numbers = new int[4];

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;
        numbers[3] = number4;

        int[] sortedNumbers = sortedArray(numbers);

        int divider = sortedNumbers[0];

        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int value : numbers) {
                if (value % divider != 0) {
                    quit = false;
                    divider--;
                    break;
                }
            }
        }

        return divider;
    }

    private static int[] sortedArray(int[] array) {

        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    quit = false;
                }
            }
        }
        return array;
    }

}
