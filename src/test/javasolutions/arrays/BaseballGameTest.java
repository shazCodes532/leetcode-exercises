package test.javasolutions.arrays;

import main.javasolutions.arrays.BaseballGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BaseballGameTest {

    private final BaseballGame baseballGame = new BaseballGame();

    @ParameterizedTest
    @MethodSource("provideTestCasesForReturningTheTotalScore")
    void obtainTotalScore(String[] nums, int expected) {
        Assertions.assertEquals(expected, baseballGame.calPoints(nums));
    }

    static Stream<Arguments> provideTestCasesForReturningTheTotalScore() {
        return Stream.of(
                Arguments.of(new String[]{"5","2","C","D","+"}, 30),
                Arguments.of(new String[]{"5","-2","4","C","D","9","+","+"}, 27),
                Arguments.of(new String[]{"1","C"}, 0)
        );
    }
}
