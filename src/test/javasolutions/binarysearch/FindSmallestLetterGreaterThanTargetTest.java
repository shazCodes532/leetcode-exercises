package test.javasolutions.binarysearch;

import main.javasolutions.binarysearch.FindSmallestLetterGreaterThanTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindSmallestLetterGreaterThanTargetTest {

    private final FindSmallestLetterGreaterThanTarget smallestLetter = new FindSmallestLetterGreaterThanTarget();

    @ParameterizedTest
    @MethodSource("provideTestCasesToCheckIfSmallestLetterExists")
    void findSmallestLetter(char[] letters, char target, char expected) {
        Assertions.assertEquals(expected, smallestLetter.nextGreatestLetter(letters, target));
    }

    static Stream<Arguments> provideTestCasesToCheckIfSmallestLetterExists() {
        return Stream.of(
                // The smallest character that is lexicographically greater than 'a' in letters is 'c'.
                Arguments.of(new char[]{'c', 'f', 'j'}, 'a', 'c'),
                // The smallest character that is lexicographically greater than 'c' in letters is 'f'.
                Arguments.of(new char[]{'c', 'f', 'j'}, 'c', 'f'),
                // There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
                Arguments.of(new char[]{'x', 'x', 'y', 'y'}, 'z', 'x')
        );
    }
}
