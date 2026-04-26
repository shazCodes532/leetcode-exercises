package main.javasolutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberTwo {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (!counter.containsKey(nums[i])) {
                count = count + 1;
                counter.put(nums[i], count);
            } else {
                count = counter.get(nums[i]);
                int newCount = count + 1;
                counter.replace(nums[i], count, newCount);
            }
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
