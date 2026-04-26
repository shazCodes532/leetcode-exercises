package main.javasolutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for (int num: nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entryChecker: tracker.entrySet()) {
            if (entryChecker.getValue() == 1) {
                return entryChecker.getKey();
            }
        }
        return 0;
    }
}
