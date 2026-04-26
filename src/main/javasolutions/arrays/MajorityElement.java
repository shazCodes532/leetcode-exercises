package main.javasolutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for (int num: nums) {
            tracker.put(num, tracker.getOrDefault(num,0) +1);
        }
        for (Map.Entry<Integer, Integer> entryChecker: tracker.entrySet()) {
            if (entryChecker.getValue() > (nums.length / 2)) {
                return entryChecker.getKey();
            }
        }
        return 0;
    }
}
