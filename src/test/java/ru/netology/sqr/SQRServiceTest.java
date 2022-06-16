package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldMinimumNumberOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.numberOfSquares(100, 150);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAverageNumberOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 2;
        int actual = sqrService.numberOfSquares(600, 700);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMaximumNumberOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 2;
        int actual = sqrService.numberOfSquares(9500, 9802);
        Assertions.assertEquals(expected, actual);
    }
}