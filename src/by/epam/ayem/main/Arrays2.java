package by.epam.ayem.main;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

    /*2. Дана последовательность действительных чисел а1,а2,...аn.
    Заменить все ее члены, большие данного Z, этим числом.
    Подсчитать количество замен.*/

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Initial array: " + Arrays.toString(array));

        System.out.println("\nEnter Z: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("\nEnter Z: ");
        }

        int z = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array));
        System.out.println("Number of replacements: " + count);
    }

}
