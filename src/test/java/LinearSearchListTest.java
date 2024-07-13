import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchListTest {

    @Test
    void linearSearchArray(){

        int[] foo = new int[]{1, 3, 4, 69, 71, 81, 90, 99, 420, 1337, 69420};
        assertTrue(LinearSearchList.linear_search(foo, 69));
        assertFalse(LinearSearchList.linear_search(foo, 1336));
        assertTrue(LinearSearchList.linear_search(foo, 69420));
        assertFalse(LinearSearchList.linear_search(foo, 69421));
        assertTrue(LinearSearchList.linear_search(foo, 1));
        assertFalse(LinearSearchList.linear_search(foo, 0));
    }
}