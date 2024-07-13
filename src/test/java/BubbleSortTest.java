import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    void bubbleSort(){
        int[] foo = new int[]{9, 3, 7, 4, 69, 420, 42};

        BubbleSort.bubble_sort(foo);
        int[] foo_sorted = new int[]{3, 4, 7, 9, 42, 69, 420};
        assertArrayEquals(foo, foo_sorted);
    }
}
