import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    void queue(){
        int[] arr = {9, 3, 7, 4, 69, 420, 42};

        BinarySearchList.QuickSort qs = new BinarySearchList.QuickSort();
        qs.quick_sort(arr);

        assertArrayEquals(arr, new int[]{3, 4, 7, 9, 42, 69, 420});
    }
}
