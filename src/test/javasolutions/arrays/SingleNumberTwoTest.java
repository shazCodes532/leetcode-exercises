package test.javasolutions.arrays;

import main.javasolutions.arrays.SingleNumberTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SingleNumberTwoTest {

    private final SingleNumberTwo singleNumberTwo = new SingleNumberTwo();

    @ParameterizedTest
    @MethodSource("provideTestCasesToReturnTheElementThatOnlyAppearsOnce")
    void searchForElementThatOnlyAppearsOnce(int[] nums, int expected) {
        Assertions.assertEquals(expected, singleNumberTwo.singleNumber(nums));
    }

    static Stream<Arguments> provideTestCasesToReturnTheElementThatOnlyAppearsOnce() {
        return Stream.of(
                Arguments.of(new int[]{2,2,3,2}, 3),
                Arguments.of(new int[]{0,1,0,1,0,1,99}, 99)
        );
    }
}
