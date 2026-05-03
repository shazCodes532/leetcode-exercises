package main.javasolutions.binarysearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid+1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

/*
 Brute force version (Search through array):

 public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
        return 0;
    }
    if (nums.length == 2 && nums[0] < nums[1]) {
        return 1;
    }
    for (int i = 1; i < nums.length - 1; i++) {
        if (nums[i] > nums[i+1] && nums[i] > nums[i-1]) {
            return i;
        }
    }
    if (nums[nums.length - 1] > nums[nums.length - 2]) {
        return nums.length - 1;
    }
    return 0;
}
*/
