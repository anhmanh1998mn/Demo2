import java.util.ArrayList;
import java.util.Arrays;

public class ParallelArraySortingTest {
    public static void main(String[] args) {
        sortList();
        sortByStartAndEndIndex();
    }

    public static void sortList() {
        int[] listData = {3, 5, 2, 9, 1, -5};
        Arrays.parallelSort(listData);
        Arrays.stream(listData).forEach(item -> System.out.printf(item + "\n"));
    }

    public static void sortByStartAndEndIndex() {
        int[] listData = {3, 5, 2, 9, 1, -5};
        Arrays.parallelSort(listData, 2, 5);
        Arrays.stream(listData).forEach(item -> System.out.printf(String.valueOf(item)));
    }
}
