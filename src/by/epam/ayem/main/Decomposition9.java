package by.epam.ayem.main;

public class Decomposition9 {

    /*9. Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать метод (методы) вычисления его площади
    если угол между сторонами длиной X и Y - прямой.*/

    public static void main(String[] args) {

        int x = 6;
        int y = 7;
        int z = 8;
        int t = 5;

        double hyp = hypLength(x, y);

        double halfSquare1 = triangleSquare(x, y, hyp);
        double halfSquare2 = triangleSquare(z, t, hyp);

        double rectSquare = halfSquare1 + halfSquare2;

        System.out.printf("The rectangle square = %.2f cm2", rectSquare);

    }

    private static double hypLength(int a, int b) {

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static double triangleSquare(double a, double b, double c) {

        double p = triangleSemiperimeter(a, b, c);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double triangleSemiperimeter(double a, double b, double c) {

        return (a + b + c) / 2;
    }

}
