package test.javasolutions.arrays;

import main.javasolutions.arrays.FinalPricesWithASpecialDiscountInAShop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FinalPricesWithASpecialDiscountInAShopTest {

    private final FinalPricesWithASpecialDiscountInAShop finalPrices = new FinalPricesWithASpecialDiscountInAShop();

    @ParameterizedTest
    @MethodSource("provideTestCasesForDiscountedPrices")
    void findDiscountedPrices(int[] prices, int[] discountedPrices) {
        Assertions.assertArrayEquals(discountedPrices, finalPrices.finalPrices(prices));
    }

    static Stream<Arguments> provideTestCasesForDiscountedPrices() {
        return Stream.of(
                Arguments.of(new int[]{8,4,6,2,3}, new int[]{4,2,4,2,3}),
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}),
                Arguments.of(new int[]{10,1,1,6}, new int[]{9,0,1,6})
        );
    }
}

// Time Complexity: O(n^2)
