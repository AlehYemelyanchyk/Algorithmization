package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

    /*1. В массив А[N] занесены натуральные числа.
    Найти сумму тех элементов, которые кратны данному К.*/

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Enter multiplier: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter multiplier: ");
        }

        int k = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        for (int value : array) {
            if (value % k == 0) {
                sum += value;
            }
        }

        if (sum > 0) {
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("There is no element in the array multiplies of " + k);
        }
    }
}
