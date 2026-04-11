package main.javasolutions.binarysearch;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}


// NB: Time complexity of O(n^2)
