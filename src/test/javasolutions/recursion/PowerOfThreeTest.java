package test.javasolutions.recursion;

import main.javasolutions.recursion.PowerOfThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PowerOfThreeTest {

    private final PowerOfThree powerOfThree = new PowerOfThree();

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfThreeIsTrue")
    void shouldCheckIfPowerOfThreeIsTrue(int n) {
        Assertions.assertTrue(powerOfThree.isPowerOfThree(n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForPowerOfThreeIsFalse")
    void shouldCheckIfPowerOfThreeIsFalse(int n) {
        Assertions.assertFalse(powerOfThree.isPowerOfThree(n));
    }

    static Stream<Arguments> provideTestCasesForPowerOfThreeIsTrue() {
        return Stream.of(
                Arguments.of(3)
        );
    }

    static Stream<Arguments> provideTestCasesForPowerOfThreeIsFalse() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(-1)
        );
    }
}
