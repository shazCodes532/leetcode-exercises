package test.javasolutions.recursion;

import main.javasolutions.recursion.PowerOfFour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PowerOfFourTest {

    private final PowerOfFour powerOfFour = new PowerOfFour();

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfFourIsTrue")
    void shouldCheckIfPowerOfFourIsTrue(int n) {
        Assertions.assertTrue(powerOfFour.isPowerOfFour(n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfFourIsFalse")
    void shouldCheckIfPowerOfFourIsFalse(int n) {
        Assertions.assertFalse(powerOfFour.isPowerOfFour(n));
    }

    static Stream<Arguments> provideTestCasesForPowerOfFourIsTrue() {
        return Stream.of(
                Arguments.of(16),
                Arguments.of(1)
        );
    }

    static Stream<Arguments> provideTestCasesForPowerOfFourIsFalse() {
        return Stream.of(
                Arguments.of(5)
        );
    }
}
