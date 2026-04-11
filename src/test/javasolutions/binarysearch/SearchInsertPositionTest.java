package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.SearchInsertPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SearchInsertPositionTest {

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @ParameterizedTest
    @MethodSource("provideTestCasesToSearchForInsertPosition")
    void shouldSearchForInsertPosition(int[] nums, int target, int expected) {
        Assertions.assertEquals(expected, searchInsertPosition.searchInsert(nums, target));
    }

    static Stream<Arguments> provideTestCasesToSearchForInsertPosition() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1)
        );
    }
}