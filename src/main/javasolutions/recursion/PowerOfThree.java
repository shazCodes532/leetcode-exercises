package main.javasolutions.recursion;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}

/* Other solution using Math methods

public boolean isPowerOfThree(int n) {
    return (Math.log10(n) / Math.log10(3)) % 1 == 0;
}

 */
