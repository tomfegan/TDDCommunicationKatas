package org.example;
import java.util.Arrays;

public class Kata1 {
    public int sumTheMiddleNumbers(int[] input) {
        int count = 0;
        Arrays.sort(input);
        for (int i = 1; i < input.length -1; i++) {
            count += input[i];
        }
        return count;
    }
}
