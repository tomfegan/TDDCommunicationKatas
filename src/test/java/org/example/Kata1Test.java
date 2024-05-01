package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata1Test {

    @Test
    void sumTheMiddleNumbers() {
        Kata1 testInstance = new Kata1();
        assertEquals(9,testInstance.sumTheMiddleNumbers(new int[] {1,2,3,4,5}));
        assertEquals(14,testInstance.sumTheMiddleNumbers(new int[] {3,2,1,4,5,5}));
        assertEquals(0,testInstance.sumTheMiddleNumbers(new int[1]));
        assertEquals(0,testInstance.sumTheMiddleNumbers(new int[] {2}));
        assertEquals(0,testInstance.sumTheMiddleNumbers(new int[] {2,1}));





    }
}