package main.javasolutions.binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}


/*
Source: https://leetcode.com/problems/binary-search/description/
Level: Easy
 */