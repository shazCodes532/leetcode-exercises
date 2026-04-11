package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckIfTargetExists")
    void shouldCheckIfTargetExists(int[] nums, int target, int expected) {
        Assertions.assertEquals(expected, binarySearch.search(nums, target));
    }

    static Stream<Arguments> provideTestCasesToCheckIfTargetExists() {
        return Stream.of(
                // 9 exists in nums and its index is 4
                Arguments.of(new int[]{-1,0,3,5,9,12}, 9, 4),

                // 2 does not exist in nums so return -1
                Arguments.of(new int[]{-1,0,3,5,9,12}, 2, -1)
        );
    }
}
