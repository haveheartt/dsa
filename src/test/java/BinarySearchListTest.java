import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchListTest {

    @Test
    void binarySearchArray(){

        int[] foo = new int[]{1, 3, 4, 69, 71, 81, 90, 99, 420, 1337, 69420};
        assertTrue(BinarySearchList.bs_list(foo, 69));
        assertFalse(BinarySearchList.bs_list(foo, 1336));
        assertTrue(BinarySearchList.bs_list(foo, 69420));
        assertFalse(BinarySearchList.bs_list(foo, 69421));
        assertTrue(BinarySearchList.bs_list(foo, 1));
        assertFalse(BinarySearchList.bs_list(foo, 0));
    }
}
