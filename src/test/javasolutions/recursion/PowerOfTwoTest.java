package test.javasolutions.recursion;

import main.javasolutions.recursion.PowerOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PowerOfTwoTest {

    private final PowerOfTwo powerOfTwo = new PowerOfTwo();

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfTwoIsTrue")
    void shouldCheckIfPowerOfTwoIsTrue(int n) {
        Assertions.assertTrue(powerOfTwo.isPowerOfTwo(n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfTwoIsFalse")
    void shouldCheckIfPowerOfTwoIsFalse(int n) {
        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(n));
    }

    static Stream<Arguments> provideTestCasesForPowerOfTwoIsTrue() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(16)
        );
    }

    static Stream<Arguments> provideTestCasesForPowerOfTwoIsFalse() {
        return Stream.of(
                Arguments.of(3)
        );
    }
}
