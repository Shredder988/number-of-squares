package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int num, int rum) {
        int counter = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= num && j <= rum)
                counter++;
        }
        {

            return counter;
        }

    }
}