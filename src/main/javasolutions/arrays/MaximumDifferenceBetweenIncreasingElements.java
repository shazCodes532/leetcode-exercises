package main.javasolutions.arrays;

public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int lowNumber = nums[0];
        int highNumber;
        int maxDifference = -1;

        for (int i = 1; i < nums.length; i++) {
            highNumber = nums[i];
            if (highNumber > lowNumber) {
                if (highNumber - lowNumber > maxDifference) {
                    maxDifference = highNumber - lowNumber;
                }
            } else {
                lowNumber = highNumber;
            }
        }
        return maxDifference;
    }
}
