package main.javasolutions.binarysearch;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int staircaseLevel = 1;
        int stairLevelSteps = 1;
        int totalNumberOfSteps = 0;
        while (totalNumberOfSteps <= n) {
            int surplus = n - totalNumberOfSteps;
            if (surplus < stairLevelSteps) {
                return staircaseLevel - 1;
            } else if (surplus > stairLevelSteps) {
                totalNumberOfSteps+=stairLevelSteps;
                staircaseLevel++;
                stairLevelSteps++;
            } else {
                return staircaseLevel;
            }
        }
        return staircaseLevel;
    }
}
