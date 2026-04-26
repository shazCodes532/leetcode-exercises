package test.javasolutions.arrays;

import main.javasolutions.arrays.SingleNumberThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SingleNumberThreeTest {

    private final SingleNumberThree singleNumberThree = new SingleNumberThree();

    @ParameterizedTest
    @MethodSource("provideTestCasesToReturnTwoElementsThatOnlyAppearOnce")
    void shouldReturnTwoElementsThatOnlyAppearOnce(int[] nums, int[] expected) {
        Assertions.assertArrayEquals(expected, singleNumberThree.singleNumber(nums));
    }

    static Stream<Arguments> provideTestCasesToReturnTwoElementsThatOnlyAppearOnce() {
        return Stream.of(
                Arguments.of(new int[]{1,2,1,3,2,5}, new int[]{3,5}),
                Arguments.of(new int[]{-1,0}, new int[]{-1,0}),
                Arguments.of(new int[]{0,1}, new int[]{0,1})
        );
    }
}
