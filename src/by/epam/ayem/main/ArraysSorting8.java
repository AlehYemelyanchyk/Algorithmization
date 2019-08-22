package by.epam.ayem.main;

import java.util.Random;

public class ArraysSorting8 {

    /*8. Даны дроби p1/q1,p2/q2,...pn/qn (pi, qi - натуральные). Составить программу,
    которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.*/

    private static Random random = new Random();

    public static void main(String[] args) {

        int fractions = 8;

        int[] numerator = new int [fractions];
        int[] denominator = new int[fractions];

        fillArray(numerator);
        fillArray(denominator);

        printArray(numerator);

        System.out.println(" ");
        printLines(fractions);
        System.out.println(" ");

        printArray(denominator);

        System.out.println("\nCommon denominator = " +commonDenominator(denominator));

        multiply(numerator,denominator);
        printArray(numerator);

        System.out.println(" ");
        printLines(fractions);
        System.out.println(" ");

        multiply(denominator,denominator);
        printArray(denominator);

        System.out.println("\nSorted:");

        sortArrayByShell(numerator);
        sortArrayByShell(denominator);

        printArray(numerator);

        System.out.println(" ");
        printLines(fractions);
        System.out.println(" ");

        printArray(denominator);

    }

    private static int[] sortArrayByShell(int[] array) {

        int index = 0;

        while (index < array.length - 1) {
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;

                if (index > 0) {
                    index--;
                }

            } else {
                index++;
            }
        }
        return array;
    }

    private static int[] multiply(int[] array, int []denominator) {

        int commonDenominator = commonDenominator(denominator);


        for (int i = 0; i < array.length; i++) {
            int multiplier = findMultiplier(denominator[i], commonDenominator);
            array[i] *= multiplier;
        }


        return array;
    }

    private static int findMultiplier(int value, int commonDenominator) {

        return commonDenominator / value;
    }

    private static int commonDenominator(int[] array) {

        int biggestDenominator = biggestDenominator(array);

        int commonDenominator = biggestDenominator;

        boolean quit = false;

        while (!quit) {
            for (int value : array) {
                quit = true;
                if (commonDenominator % value != 0) {
                    commonDenominator += biggestDenominator;
                    quit = false;
                    break;
                }
            }
        }
        return commonDenominator;
    }

    private static int biggestDenominator(int[] array) {

        int biggestDenominator = array[0];

        for (int value : array) {
            if (value > biggestDenominator) {
                biggestDenominator = value;
            }
        }
        return biggestDenominator;
    }

    private static void printArray (int [] array){

        for (int value : array) {
            System.out.printf("%5d", value);
        }
    }

    private static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = 1+ random.nextInt(9);
        }
        return array;
    }

    private static void printLines (int number){

        int count = 0;

        while (count < number){
            System.out.print(" ----");
            count++;
        }
    }

}
