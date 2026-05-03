package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.FindPeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindPeakElementTest {

    private final FindPeakElement peakElement = new FindPeakElement();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckForPeakElement")
    void shouldFindPeakElement(int[] nums, int expected) {
        Assertions.assertEquals(expected, peakElement.findPeakElement(nums));
    }

    static Stream<Arguments> provideTestCasesToCheckForPeakElement() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, 2),
                Arguments.of(new int[]{1,2,1,3,5,6,4}, 5)
        );
    }
}
