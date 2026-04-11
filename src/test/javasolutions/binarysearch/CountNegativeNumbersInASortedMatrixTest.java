package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.CountNegativeNumbersInASortedMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountNegativeNumbersInASortedMatrixTest {

    private final CountNegativeNumbersInASortedMatrix sortedMatrix = new CountNegativeNumbersInASortedMatrix();

    @ParameterizedTest
    @MethodSource("provideTestCasesForCountingNegativeNumbers")
    void countNegativeNumbers(int[][] grid, int expected) {
        Assertions.assertEquals(expected, sortedMatrix.countNegatives(grid));
    }

    static Stream<Arguments>  provideTestCasesForCountingNegativeNumbers() {
        return Stream.of(
                Arguments.of(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}, 8),
                Arguments.of(new int[][]{{3,2},{1,0}}, 0)
                );
    }
}
