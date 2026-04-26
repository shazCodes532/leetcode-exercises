package main.javasolutions.arrays;

public class BestTimeToBuyAndSellStockTwo {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int sellPrice;
        int profit = 0;
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            sellPrice = prices[i];
            if (sellPrice > buyPrice) {
                if (sellPrice - buyPrice > profit) {
                    profit = sellPrice - buyPrice;
                    totalProfit += profit;
                    profit = 0;
                }
            }
            buyPrice = sellPrice;
        }
        return totalProfit;
    }
}
