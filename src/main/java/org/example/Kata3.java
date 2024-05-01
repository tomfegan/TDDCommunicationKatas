package org.example;

public class Kata3 {
    
    public int addUpTheASCIICodes(String input) {
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            int asciiValue = (int) input.charAt(i);
            if ( (asciiValue >= 48 && asciiValue <= 57) || (asciiValue >= 65 && asciiValue <=90) ||
                    (asciiValue >= 97 && asciiValue <=122)  ) {
                total += asciiValue;
            }
        }
        return total;




    }

}
