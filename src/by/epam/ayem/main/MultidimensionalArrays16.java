package by.epam.ayem.main;

import java.util.Random;

public class MultidimensionalArrays16 {

    /*16. Магическим квадратом порядка n называется квадратная матрица размера n x n,
    составленная из чисел 1,2,3,...,n^2 так, чтобы суммы по каждому столбцу,
    каждой строке и каждой из двух больших диагоналей равны между собой.
    Построить такой квадрат. Пример магического квадрата порядка 3:
                                6 1 8
                                7 5 3
                                2 9 4         */

    private static int fillLine = 0;
    private static long fillLineTime = 0;
    private static int magicSquareCopy = 0;
    private static long magicSquareCopyTime = 0;
    private static int isExist = 0;
    private static long isExistTime = 0;
    private static int isMagic = 0;
    private static long isMagicTime = 0;

    private static Random random = new Random();

    private static int count = 1;

    public static void main(String[] args) {

        int n = 4;

        findMagicSquares(n);

        System.out.println("fillLine called " + fillLine + " times. Total time: " + fillLineTime);
        System.out.println("magicSquareCopy called " + magicSquareCopy + " times. Total time: " + magicSquareCopyTime);
        System.out.println("isExist called " + isExist + " times. Total time: " + isExistTime);
        System.out.println("isMagic called " + isMagic + " times. Total time: " + isMagicTime);
    }

    private static void findMagicSquares(int n) {

        int magicConst = findMagicConstant(n);

        fillMultiArrayRandom(n, magicConst);
    }

    private static int findMagicConstant(int n) {

        return (int) (n * (Math.pow(n, 2) + 1) / 2);
    }

    private static void fillMultiArrayRandom(int n, int magicConstant) {

        int[][] arrayFound = new int[n * n][n * n];

        int indexFound = 0;

        while (count <= 8) {

            int[][] magicSquare = new int[n][n];

            for (int i = 0; i == 0; i++) {

                fillLine(magicConstant, i, n, magicSquare);

                if (!magicSquareCopy(arrayFound, magicSquare, n)) {

                    for (int j = 0; j < magicSquare.length; j++) {
                        magicSquare[i][j] = 0;
                    }
                    i--;

                }
            }

            for (int i = 1; i < magicSquare.length; i++) {

                fillLine(magicConstant, i, n, magicSquare);

            }

            if (isMagic(magicSquare, magicConstant)) {
                arrayFound(arrayFound, magicSquare, indexFound, n);

                indexFound++;

                printMagicSquares(magicSquare);

                count++;
            }
        }
    }

    private static void fillLine(int magicConstant, int i, int n, int[][] magicSquare) {

        long time = System.nanoTime();
        fillLine++;

        for (int j = 0; j < magicSquare[i].length; j++) {

            boolean added = false;

            while (!added) {

                int number = 1 + random.nextInt(n * n);

                if (!isExist(magicSquare, number)) {

                    magicSquare[i][j] = number;
                    added = true;

                }
            }
        }

        fillLineTime += (System.nanoTime() - time);

    }

    private static boolean magicSquareCopy(int[][] arrayFound, int[][] magicSquare, int n) {

        long time = System.nanoTime();
        magicSquareCopy++;

        int match = 0;

        for (int[] arrays : arrayFound) {

            match = 0;

            for (int j = 0; j < magicSquare.length; j++) {
                if (arrayFound[0][j] == 0 && match != n) {
                    return true;
                } else if (arrays[j] == magicSquare[0][j]) {
                    match++;
                }
            }
            if (match == n) {
                return false;
            }
        }

        magicSquareCopyTime += (System.nanoTime() - time);
        return true;
    }

    private static void arrayFound(int[][] arrayFound, int[][] magicSquare, int indexFound, int n) {

        arrayFound[indexFound] = new int[n * n];

        int index = 0;

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                arrayFound[indexFound][index] = magicSquare[i][j];
                index++;
            }
        }
    }

    private static boolean isExist(int[][] multiArray, int number) {

        long time = System.nanoTime();
        isExist++;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (number == multiArray[i][j]) {
                    return true;
                }
            }
        }
        isExistTime += (System.nanoTime() - time);
        return false;

    }

    private static boolean isMagic(int[][] multiArray, int magicConstant) {

        long time = System.nanoTime();
        isMagic++;

        for (int i = 0; i < multiArray.length; i++) {

            int lineSum = 0;

            for (int j = 0; j < multiArray[i].length; j++) {
                lineSum += multiArray[i][j];
            }

            if (lineSum != magicConstant) {
                return false;
            }
        }

        for (int i = 0; i < multiArray.length; i++) {

            int columnSum = 0;

            for (int j = 0; j < multiArray[i].length; j++) {
                columnSum += multiArray[j][i];
            }

            if (columnSum != magicConstant) {
                return false;
            }
        }

        int firstDiagonalSum = 0;

        for (int i = 0; i < multiArray.length; i++) {

            firstDiagonalSum += multiArray[i][i];
        }

        if (firstDiagonalSum != magicConstant) {
            return false;
        }

        int secondDiagonalSum = 0;

        for (int i = 0, j = multiArray.length - 1; i < multiArray.length; i++, j--) {

            secondDiagonalSum += multiArray[i][j];
        }

        if (secondDiagonalSum != magicConstant) {
            return false;
        }

        isMagicTime += (System.nanoTime() - time);
        return true;
    }

    private static void printMagicSquares(int[][] multiArray) {

        System.out.println("Magic square #" + count);

        for (int[] string : multiArray) {
            for (int value : string) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ");
        }
        System.out.println("========================================");
    }
}
