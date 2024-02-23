package test.hw_6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import HW_6.ListComparator;

public class ListComparatorTest {
    @Test
    public void testCompareLists() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        assertEquals("Второй список имеет большее среднее значение", ListComparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsEqual() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);

        assertEquals("Средние значения равны", ListComparator.compareLists(list1, list2));
    }

    @Test
    public void testCalculateAverageEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0.0, ListComparator.calculateAverage(list), 0.0);
    }
}