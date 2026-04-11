package main.javasolutions.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> outputChecker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (outputChecker.containsKey(complement)) {
                return new int[]{outputChecker.get(complement), i};
            }
            outputChecker.put(nums[i], i);
        }
        return new int[]{};
    }
}
