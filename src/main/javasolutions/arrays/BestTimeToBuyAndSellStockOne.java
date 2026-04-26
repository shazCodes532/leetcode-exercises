package main.javasolutions.arrays;

public class BestTimeToBuyAndSellStockOne {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int sellingPrice;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            sellingPrice = prices[i];
            if (sellingPrice > buyPrice) { // calculate P if SP > BP
                if (sellingPrice - buyPrice > profit) { // check if current P > prev P
                    profit = sellingPrice - buyPrice;
                }
            } else {
                buyPrice = sellingPrice; // SP < BP, so SP is better BP
            }
        }
        return profit;
    }
}

/* Other Solutions
*
* for (int i = 0; i < prices.length - 1; i++) {
*   buyPrice = prices[i];
*   for (int j = i + 1; j < prices.length; j++) {
*      sellPrice = prices[j];
*      if (sellPrice - buyPrice > profit) {
*          profit = sellPrice - buyPrice;
*      }
*   }
* }
*
* Time complexity: O(n^2)
*/
