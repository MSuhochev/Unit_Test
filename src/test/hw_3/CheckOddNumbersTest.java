package test.hw_3;
import HW_3.CheckOddNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
//переданное число четным или нечетным:
public class CheckOddNumbersTest {
    private final CheckOddNumbers numberChecker = new CheckOddNumbers();

    @Test
    void testEvenNumber() {
        assertTrue(numberChecker.evenOddNumber(2));
        assertTrue(numberChecker.evenOddNumber(4));
        assertTrue(numberChecker.evenOddNumber(6));
    }

    @Test
    void testOddNumber() {
        assertFalse(numberChecker.evenOddNumber(1));
        assertFalse(numberChecker.evenOddNumber(3));
        assertFalse(numberChecker.evenOddNumber(5));
    }

    @Test
    void testZero() {
        assertTrue(numberChecker.evenOddNumber(0));
    }
}