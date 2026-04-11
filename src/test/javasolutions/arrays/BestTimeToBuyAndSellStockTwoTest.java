package test.javasolutions.arrays;

import main.javasolutions.arrays.BestTimeToBuyAndSellStockTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BestTimeToBuyAndSellStockTwoTest {

    private final BestTimeToBuyAndSellStockTwo bestTime = new BestTimeToBuyAndSellStockTwo();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckForCumulativeProfit")
    void shouldCheckForCumulativeProfit(int[] prices, int expected) {
        Assertions.assertEquals(expected, bestTime.maxProfit(prices));
    }

    static Stream<Arguments> provideTestCasesToCheckForCumulativeProfit() {
        return Stream.of(
                // Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
                // Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
                // Total profit is 4 + 3 = 7.
                Arguments.of(new int[]{7,1,5,3,6,4}, 7),

                // Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
                // Total profit is 4.
                Arguments.of(new int[]{1,2,3,4,5}, 4),

                // There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
                Arguments.of(new int[]{7,6,4,3,1}, 0),
                Arguments.of(new int[]{1}, 0)
        );
    }
}
