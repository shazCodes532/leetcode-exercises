package test.javasolutions.arrays;

import main.javasolutions.arrays.MaximumGap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximumGapTest {

    private final MaximumGap maxGap = new MaximumGap();

    @ParameterizedTest
    @MethodSource("provideTestCasesToFindMaxGap")
    void findMaximumGap(int[] nums, int expected) {
        Assertions.assertEquals(expected, maxGap.maximumGap(nums));
    }

    static Stream<Arguments> provideTestCasesToFindMaxGap() {
        return Stream.of(
                Arguments.of(new int[]{3,6,9,1}, 3),
                Arguments.of(new int[]{3,1}, 2),
                Arguments.of(new int[]{10}, 0),
                Arguments.of(new int[]{1, 10000000}, 9999999)
        );
    }
}
