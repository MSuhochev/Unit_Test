package HW_3;


//Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
//переданное число в интервал (25;100)
public class NumberChecker {
    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
