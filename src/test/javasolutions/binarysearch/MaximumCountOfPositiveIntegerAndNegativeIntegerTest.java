package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.MaximumCountOfPositiveIntegerAndNegativeInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {

    private final MaximumCountOfPositiveIntegerAndNegativeInteger maxCount = new MaximumCountOfPositiveIntegerAndNegativeInteger();

    @ParameterizedTest
    @MethodSource("provideTestCasesToFindMaxCount")
    void findMaxCount(int[] nums, int expected) {
        Assertions.assertEquals(expected, maxCount.maximumCount(nums));
    }

    static Stream<Arguments> provideTestCasesToFindMaxCount() {
        return Stream.of(
                Arguments.of(new int[]{-2,-1,-1,1,2,3}, 3),
                Arguments.of(new int[]{-3,-2,-1,0,0,1,2}, 3),
                Arguments.of(new int[]{5,20,66,1314}, 4)
        );
    }
}
