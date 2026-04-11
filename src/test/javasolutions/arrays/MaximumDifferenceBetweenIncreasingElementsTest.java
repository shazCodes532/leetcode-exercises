package test.javasolutions.arrays;

import main.javasolutions.arrays.MaximumDifferenceBetweenIncreasingElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximumDifferenceBetweenIncreasingElementsTest {

    private final MaximumDifferenceBetweenIncreasingElements maxDifference = new MaximumDifferenceBetweenIncreasingElements();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckForMaximumDifference")
    void shouldCheckForMaximumDifference(int[] nums, int expected) {
        Assertions.assertEquals(expected, maxDifference.maximumDifference(nums));
    }

    static Stream<Arguments> provideTestCasesToCheckForMaximumDifference() {
        return Stream.of(
                // The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4
                Arguments.of(new int[]{7,1,5,4}, 4),
                // The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
                Arguments.of(new int[]{1,5,2,10}, 9),
                // There is no i and j such that i < j and nums[i] < nums[j].
                Arguments.of(new int[]{9,4,3,2}, -1)
        );
    }
}
