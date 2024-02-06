package HW_1.Calculator;
import java.util.Scanner;
import static HW_1.Calculator.Calculator.calculatingDiscount;
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            HW_1.Calculator.Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        // Тест суммы покупки 100 и скидки 10%
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);

        // Тест суммы покупки 200 и скидки 20%
        assertThat(Calculator.calculatingDiscount(200, 20)).isEqualTo(160);

        // Тест с недопустимым процентом скидки (-10%)
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount percentage must be non-negative");

        // Тест с недопустимой суммой покупки (отрицательная)
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Purchase amount must be non-negative");

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(169));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        double purchaseAmount = scanner.nextDouble();
        System.out.print("Введите сумму скидки: ");
        double discountPercentage = scanner.nextDouble();
        System.out.println(calculatingDiscount(purchaseAmount, discountPercentage));
    }
}