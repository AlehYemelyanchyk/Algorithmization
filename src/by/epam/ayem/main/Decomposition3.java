package by.epam.ayem.main;

public class Decomposition3 {

    /*3. Вычислить площадь правильного шестиугольника со стороной а,
    используя метод вычисления площади треугольника.*/

    public static void main(String[] args) {

        int a = 6;

        System.out.printf("The square of a hexagon with its side a = %d is %.2f cm2", a, hexagonSquare(a));

    }

    private static double hexagonSquare(int side) {

        return 6 * equilateralTriangleSquare(side);
    }

    private static double equilateralTriangleSquare(int side) {

        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

}
