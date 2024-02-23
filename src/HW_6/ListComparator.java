package HW_6;

import java.util.List;

public class ListComparator {
    // Метод для расчета среднего значения списка чисел
    public static double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    // Метод для сравнения средних значений двух списков и вывода соответствующего сообщения
    public static String compareLists(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}

