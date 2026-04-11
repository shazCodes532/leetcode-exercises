package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.ArrangingCoins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArrangingCoinsTest {

    private final ArrangingCoins arrangingCoins = new ArrangingCoins();

    @ParameterizedTest
    @MethodSource("provideTestCasesForArrangingCoins")
    void checkNumberOfLevels(int numberOfCoins, int numberOfLevelsExpected) {
        Assertions.assertEquals(numberOfLevelsExpected, arrangingCoins.arrangeCoins(numberOfCoins));
    }

    static Stream<Arguments> provideTestCasesForArrangingCoins() {
        return Stream.of(
                // Because the 3rd row is incomplete, we return 2.
                Arguments.of(5, 2),
                // Because the 4th row is incomplete, we return 3.
                Arguments.of(8, 3)
        );
    }
}
