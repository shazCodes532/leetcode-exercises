package main.javasolutions.arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> storesNumber = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (storesNumber.containsKey(nums[i])) {
                return true;
            }
            storesNumber.put(nums[i], i);
        }
        return false;
    }
}
