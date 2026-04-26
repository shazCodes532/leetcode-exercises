package main.javasolutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberThree {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int index = 0;
        int[] onlyAppearOnce = new int[]{index, index};
        for (int num: nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entryChecker: tracker.entrySet()) {
            if (entryChecker.getValue() == 1) {
                onlyAppearOnce[index] = entryChecker.getKey();
                index++;
            }
        }
        return onlyAppearOnce;
    }
}
