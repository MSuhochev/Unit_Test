package test.hw_3.tdd;

import HW_3.tdd.MoodAnalyser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MoodAnalyserTest {

    @ParameterizedTest
    @CsvSource({
            "'Write a failing test', 'Bad test'",
            "'Refactor', 'Working'",
            "'Make the test pass','Good job programmer'"
            })
     void moodAnalyserTest(String input, String expected){
        Assertions.assertThat(MoodAnalyser.analyseMood(input)).isEqualTo(expected);
    }


}
