package HW_3;


//Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
//переданное число четным или нечетным:
public class CheckOddNumbers {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
