package by.epam.ayem.main;

public class MultidimensionalArrays17 {

    /*16. Магическим квадратом порядка n называется квадратная матрица размера n x n,
    составленная из чисел 1,2,3,...,n^2 так, чтобы суммы по каждому столбцу,
    каждой строке и каждой из двух больших диагоналей равны между собой.
    Построить такой квадрат. Пример магического квадрата порядка 3:
                                6 1 8
                                7 5 3
                                2 9 4         */

    private static int count = 1;
    private static int n = 3;

    public static void main(String[] args) {
        findMagicSquares();
    }

    private static void findMagicSquares() {

        int magicConst = findMagicConstant();

        int[][] square = fillMultiArray();

        int[] array = multiArrayToArray(square);

        permute(array, magicConst);

    }

    private static int findMagicConstant() {
        return (int) (n * (Math.pow(n, 2) + 1) / 2);
    }

    private static int[][] fillMultiArray() {
        int[][] square = new int[n][n];
        int number = 1;

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = number++;
            }
        }
        return square;
    }

    private static void permute(int[] array, int magicConstant) {
        permute(array, 0, magicConstant);
    }

    private static void permute(int[] array, int start, int magicConstant) {
        if (start >= array.length) {
            int[][] multiArray = arrayToMultiArray(array);
            if (isMagic(multiArray, magicConstant)) {
                printMagicSquares(multiArray);
            }
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                permute(array, start + 1, magicConstant);
                swap(array, start, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int[] multiArrayToArray(int[][] multiArray) {
        int[] array = new int[n * n];
        int index = 0;

        for (int[] ints : multiArray) {
            for (int j = 0; j < multiArray.length; j++) {
                array[index] = ints[j];
                index++;
            }
        }
        return array;
    }

    private static int[][] arrayToMultiArray(int[] array) {
        int[][] multiArray = new int[n][n];
        int index = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                multiArray[i][j] = array[index];
                index++;
            }
        }
        return multiArray;
    }

    private static boolean isMagic(int[][] multiArray, int magicConstant) {
        for (int[] ints : multiArray) {
            int lineSum = 0;

            for (int j = 0; j < ints.length; j++) {
                lineSum += ints[j];
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

        return true;
    }

    private static void printMagicSquares(int[][] multiArray) {

        System.out.println("Magic square #" + count++);

        for (int[] string : multiArray) {
            for (int value : string) {
                System.out.printf("%4d", value);
            }
            System.out.println(" ");
        }
        System.out.println("========================================");
    }

}
