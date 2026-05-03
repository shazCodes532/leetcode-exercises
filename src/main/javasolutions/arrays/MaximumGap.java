package main.javasolutions.arrays;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] > count) {
                count = nums[i+1] - nums[i];
            }
        }
        if (nums.length == 2) {
            count = nums[1] - nums[0];
        }
        if (nums.length < 2) {
            return 0;
        }
        return count;
    }
}
