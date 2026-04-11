package test.javasolutions.arrays;

import main.javasolutions.arrays.BestTimeToBuyAndSellStockOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BestTimeToBuyAndSellStockOneTest {

    private final BestTimeToBuyAndSellStockOne bestTimeToBuyAndSellStockOne = new BestTimeToBuyAndSellStockOne();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckIfProfitIsObtained")
    void shouldCalculateMaxProfit(int[] prices, int expected) {
        Assertions.assertEquals(expected, bestTimeToBuyAndSellStockOne.maxProfit(prices));
    }

    static Stream<Arguments> provideTestCasesToCheckIfProfitIsObtained() {
        return Stream.of(
                // In these cases, no transactions are done and the max profit = 0.
                Arguments.of(new int[]{7,6,4,3,1}, 0),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1,1,1}, 0),
                Arguments.of(new int[]{0,0,0,0}, 0),

                // Profit cases
                // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                // Buy one day 1 (price = 0) and sell on day 3 (price = 9), profit = 9-0 = 9.
                Arguments.of(new int[]{0,1,9,0,4,4}, 9),

                // Edge cases
                Arguments.of(new int[]{9,8,7,1,2,3,10}, 9),
                Arguments.of(new int[]{2,4,1}, 2)
        );
    }
}
