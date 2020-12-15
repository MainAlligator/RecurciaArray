package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrayMe = new int[]{3, 5, 7, 9, -8};
        int i = 0;

        int res = summArray(arrayMe, i);
        System.out.println("Сумма массива: " + res);
        int maxMassive = maxArray(arrayMe, arrayMe.length -1);
        System.out.println("Максимальное число массива: " + maxMassive);

    }

    private static int summArray(int[] arrayMe, int i) {
        if (i >= arrayMe.length)
            return 0;
        int result = summArray(arrayMe, i + 1);
        return arrayMe[i] + result;
    }

    private static int maxArray(int[] arrayMe, int i) {
        if (i > 0) {
            return Math.max(arrayMe[i], maxArray(arrayMe, i - 1));
        } else {
            return arrayMe[0];
        }
    }
}








