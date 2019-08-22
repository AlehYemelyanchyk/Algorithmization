package by.epam.ayem.main;

import java.util.Scanner;

public class MultidimensionalArrays7 {

    private static Scanner scanner = new Scanner(System.in);

    /*7. Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin((I^2-J^2)/n)
    и подсчитать количество положительных элементов в ней.*/

    public static void main(String[] args) {

        System.out.println("Enter N:");

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Enter N:");
        }

        int n = scanner.nextInt() + 1;
        scanner.nextLine();

        double[][] multiArray = new double[n][n];

        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                double a = Math.sin(Math.toRadians((Math.pow(i, 2) - Math.pow(j, 2)) / (n - 1)));
                multiArray[i][j] = a;
                if (a > 0) {
                    count++;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(String.format("%.2f", multiArray[i][j]) + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Positive numbers: " + count);

    }

}
