package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata3Test {

    Kata3 kata3Instance = new Kata3();
    @Test
    void addUpTheASCIICodes() {
        assertEquals(1195, kata3Instance.addUpTheASCIICodes("northcoders"));
        assertEquals(1163, kata3Instance.addUpTheASCIICodes("Northcoders"));
        assertEquals(97, kata3Instance.addUpTheASCIICodes("a"));
        assertEquals(97, kata3Instance.addUpTheASCIICodes("a?"));



    }
}