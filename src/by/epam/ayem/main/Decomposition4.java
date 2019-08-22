package by.epam.ayem.main;

import java.util.Random;

public class Decomposition4 {

    /*4. На плоскости заданы своими координатами n точек. Написать метод (методы),
    определяющие, между какими из пар точек самое большое расстояние.
    Указание. Координаты точек занести в массив.*/

    private static Random random = new Random();

    private static int n = 5;

    public static void main(String[] args) {

        int[][] points = new int[n][2];

        fillArrayRandom(points);
        printPoints(points);
        closestPoints(points);

    }

    private static void printResult(int[] array) {

        System.out.print("Farthest points: ");
        System.out.print(array[0] + ", ");
        System.out.print(array[1]);
    }

    private static void closestPoints(int[][] points) {

        int[] twoPoints = new int[2];

        int number1 = 1;
        double biggestDist = 0;

        for (int[] point1 : points) {

            int number2 = 1;

            for (int[] point2 : points) {

                double dist = Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));

                if (dist > biggestDist) {
                    biggestDist = dist;
                    twoPoints[0] = number1;
                    twoPoints[1] = number2;
                }
                number2++;
            }
            number1++;
        }

        printResult(twoPoints);
    }

    private static int[][] fillArrayRandom(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }

        for (int[] point : array) {
            sortArrayByShell(point);
        }

        return array;
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

    private static void printPoints(int[][] multiArray) {

        int point = 1;

        for (int[] string : multiArray) {
            System.out.printf("%4d:", point);

            for (int value : string) {
                System.out.printf("%4d", value);
            }

            point++;

            System.out.println(" ");
        }

    }

}
