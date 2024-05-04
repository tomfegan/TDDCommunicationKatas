package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {

    @Test
    void likesAndDislikes() {
        Kata4 instance = new Kata4();
        assertEquals("NEUTRAL", instance.likesAndDislikes(new String[]{"LIKE", "DISLIKE"}));
        assertEquals("LIKE", instance.likesAndDislikes(new String[]{"LIKE"}));
        assertEquals("NEUTRAL", instance.likesAndDislikes(new String[]{"DISLIKE", "DISLIKE"}));
        assertEquals("LIKE", instance.likesAndDislikes(new String[]{"DISLIKE","DISLIKE","LIKE"}));

    }
}