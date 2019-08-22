package by.epam.ayem.main;

public class Arrays3 {

    /*3. Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/

    public static void main(String[] args) {

        int[] array = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int value : array) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive values count = " + positive + "\n"
                + "Negative values count = " + negative + "\n"
                + "Zero value count = " + zero);

    }
}
