package test.hw_3;

import HW_3.NumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
//переданное число в интервал (25;100)

public class NumberCheckerTest {
    private final NumberChecker numberChecker = new NumberChecker();
    @Test
    void testNumberInInterval() {
        assertFalse(numberChecker.numberInInterval(24));
        assertFalse(numberChecker.numberInInterval(25));
        assertTrue(numberChecker.numberInInterval(26));
        assertTrue(numberChecker.numberInInterval(50));
        assertTrue(numberChecker.numberInInterval(99));
        assertFalse(numberChecker.numberInInterval(100));
        assertFalse(numberChecker.numberInInterval(101));
    }
}
