package test.javasolutions.arrays;

import main.javasolutions.arrays.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("provideTestCasesForCheckingTarget")
    void searchForTaget(int[] nums, int target, int[] expected) {
        Assertions.assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    static Stream<Arguments> provideTestCasesForCheckingTarget() {
        return Stream.of(
                // Because nums[0] + nums[1] == 9, we return [0, 1].
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                // Because nums[1] + nums[2] == 6, we return [1, 2].
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                // Because nums[0] + nums[1] == 6, we return [0, 1].
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }
}
