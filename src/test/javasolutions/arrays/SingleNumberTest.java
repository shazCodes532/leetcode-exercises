package test.javasolutions.arrays;

import main.javasolutions.arrays.SingleNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @ParameterizedTest
    @MethodSource("provideTestCasesToReturnTheElementThatOnlyAppearsOnce")
    void searchForElementThatOnlyAppearsOnce(int[] nums, int expected) {
        Assertions.assertEquals(expected, singleNumber.singleNumber(nums));
    }

    static Stream<Arguments> provideTestCasesToReturnTheElementThatOnlyAppearsOnce() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1}, 1),
                Arguments.of(new int[]{4,1,2,1,2}, 4),
                Arguments.of(new int[]{1}, 1)
        );
    }
}
