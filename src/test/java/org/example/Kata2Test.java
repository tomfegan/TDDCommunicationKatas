package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {

    @Test
    void calculateTheMean() {
        Kata2 testData = new Kata2();

        assertEquals(2D, testData.calculateTheMean(new int[] {1, 2, 3}));
        assertEquals(17.25, testData.calculateTheMean(new int[] {40, 16, 5, 8}));
    }
}