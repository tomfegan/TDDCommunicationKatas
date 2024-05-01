package org.example;

public class Kata2 {

//    Using Test-Driven Development, create a class which has a method to calculate the mean value of an array
//    of numbers.


    public double calculateTheMean(int[] input){
//    - Take an input array
//    - Set up int total variable
        double total = 0;
//    - Iterate through array
        for (int element : input) {
//        - Add the element to the total
            total += element;
        }
//     - Divide total by length of the array
//     - Return total
        return total / input.length;
    }
}
