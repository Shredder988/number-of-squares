package ru.netology.sqr;

public class SQRService {

    public static int shouldMinimumNumberOfSquares(int args) {
        int counter = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= 100 && j <= 200)
                counter++;
        }
        System.out.println(counter);
        return counter;
    }

    public static int shouldAverageNumberOfSquares(int args) {
        int counter = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= 2000 && j <= 2500)
                counter++;
        }
        System.out.println(counter);
        return counter;
    }

    public static int shouldMaximumNumberOfSquares(int args) {
        int counter = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= 9500 && j <= 9850)
                counter++;
        }
        System.out.println(counter);
        return counter;
    }

}