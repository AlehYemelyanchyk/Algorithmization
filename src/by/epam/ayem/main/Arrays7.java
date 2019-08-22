package by.epam.ayem.main;

public class Arrays7 {

    /*7. Даны действительные числа а1, а2, ..., аn.
    Найти max(a1+a2n,a2+a2n-1,...an+an+1).*/

    public static void main(String[] args) {

        int[] array = {0, 1, 22, 3, 4, 5, 6, 7, 8, 9};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length / 2; i++) {
            int sum = array[i] + array[(array.length - 1) - i];
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }

}
