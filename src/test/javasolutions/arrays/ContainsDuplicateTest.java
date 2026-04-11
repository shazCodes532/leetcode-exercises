package test.javasolutions.arrays;

import main.javasolutions.arrays.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @ParameterizedTest
    @MethodSource("provideTestCasesToReturnTrueWhenThereAreDuplicates")
    void shouldReturnTrueWhenThereAreDuplicates(int[] nums) {
        Assertions.assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesToReturnFalseWhenThereAreNoDuplicates")
    void shouldReturnFalseWhenThereAreNoDuplicates(int[] nums) {
        Assertions.assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    static Stream<int[]> provideTestCasesToReturnTrueWhenThereAreDuplicates() {
        return Stream.of(
                // The element 1 occurs at the indices 0 and 3.
                new int[]{1,2,3,1},
                // The elements 1, 2 and 3 are duplicated multiple times in the array.
                new int[]{1,1,1,3,3,4,3,2,4,2}
        );
    }

    static Stream<int[]> provideTestCasesToReturnFalseWhenThereAreNoDuplicates() {
        return Stream.of(
                // All elements are distinct.
                new int[]{1,2,3,4},
                // There is only one element in the array, hence no duplicates.
                new int[]{1},
                // The array is empty, hence no duplicates.
                new int[]{}
        );
    }
}
