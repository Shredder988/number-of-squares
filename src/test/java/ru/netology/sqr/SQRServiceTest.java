package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldMinimumNumberOfSquares() {
        SQRService sqrService = new SQRService();

        int i = 10;
        int expected = 5;

        int actual = SQRService.shouldMinimumNumberOfSquares(i);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAverageNumberOfSquares() {
        SQRService sqrService = new SQRService();

        int i = 10;
        int expected = 5;

        int actual = SQRService.shouldAverageNumberOfSquares(i);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMaximumNumberOfSquares() {
        SQRService sqrService = new SQRService();

        int i = 10;
        int expected = 5;

        int actual = SQRService.shouldMaximumNumberOfSquares(i);

        assertEquals(expected, actual);
    }
}