package test.javasolutions.arrays;

import main.javasolutions.arrays.FindNumbersWithEvenNumberOfDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindNumbersWithEvenNumberOfDigitsTest {

    private final FindNumbersWithEvenNumberOfDigits digits = new FindNumbersWithEvenNumberOfDigits();

    @ParameterizedTest
    @MethodSource("provideTestCasesForReturningCountOfNumbersWithEvenDigits")
    void obtainCountOfNumbers(int[] nums, int expected) {
        Assertions.assertEquals(expected, digits.findNumbers(nums));
    }

    static Stream<Arguments> provideTestCasesForReturningCountOfNumbersWithEvenDigits() {
        return Stream.of(
                Arguments.of(new int[]{12,345,2,6,7896}, 2),
                Arguments.of(new int[]{555,901,482,1771}, 1)
        );
    }
}
