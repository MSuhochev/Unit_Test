package HW_3.tdd;

public class MoodAnalyser {

    public static String analyseMood(String message) {
        if (message.equals("Write a failing test")) {
            return "Bad test";
        } else if (message.equals("Refactor")) {
            return "Working";
        } else if (message.equals("Make the test pass")) {
            return "Good job programmer";
        }

        return "There is no such scenario.";
    }
}