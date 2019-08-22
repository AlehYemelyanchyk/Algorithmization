package by.epam.ayem.main;

public class Decomposition6 {

    // 6. Написать метод (методы), проверяющие, являются ли данные три числа взаимно простыми.

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 16;
        int number3 = 23;

        isSimple(number1, number2, number3);

    }

    private static boolean isSimple(int number1, int number2, int number3) {

        int[] numbers = new int[3];
        int[] dividers = new int[0];

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        int index = 0;

        for (int value : numbers) {

            int divider = 2;

            while (divider < value) {


                if (value % divider == 0) {

                    for (int number : dividers) {

                        if (divider == number) {
                            System.out.println("Numbers " + number1 + ", " + number2 + ", " + number3 + " are not coprime.");
                            return false;
                        }
                    }

                    System.arraycopy(dividers, 0, dividers = new int[dividers.length + 1], 0, dividers.length - 1);
                    dividers[index] = divider;
                    index++;
                }

                divider++;
            }
        }
        System.out.println("Numbers " + number1 + ", " + number2 + ", " + number3 + " are coprime.");
        return true;
    }

}
