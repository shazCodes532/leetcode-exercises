package main.javasolutions.binarysearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int countNegNumbers = 0;
        int countPosNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                countNegNumbers++;
            } else if (nums[i] > 0) {
                countPosNumbers++;
            }
        }
        if (countPosNumbers > countNegNumbers) {
            return countPosNumbers;
        } else {
            return countNegNumbers;
        }
    }
}
