package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.ValidPerfectSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ValidPerfectSquareTest {

    private final ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

    @ParameterizedTest
    @MethodSource("provideTestCasesWhenPerfectSquare")
    void checkIfPerfectSquare(int target) {
        Assertions.assertTrue(validPerfectSquare.isPerfectSquare(target));
    }

    static Stream<Arguments> provideTestCasesWhenPerfectSquare() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(16),
                Arguments.of(100)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesWhenNotPerfectSquare")
    void checkIfNotPerfectSquare(int target) {
        Assertions.assertFalse(validPerfectSquare.isPerfectSquare(target));
    }

    static Stream<Arguments> provideTestCasesWhenNotPerfectSquare() {
        return Stream.of(
                Arguments.of(165),
                Arguments.of(234)
        );
    }
}
