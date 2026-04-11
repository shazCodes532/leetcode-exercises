package main.javasolutions.binarysearch;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < (num / mid)) {
                left = mid + 1;
            } else if (mid > (num / mid)) {
                right = mid - 1;
            } else if (mid == (num / mid)) {
                if (num % mid != 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
