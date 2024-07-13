import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    void test_list(){

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(5);
        list.append(7);
        list.append(9);

        assertEquals(list.get(2), 9);
        assertEquals(list.removeAt(1), 7);
        assertEquals(list.length, 2);

        list.append(11);
        assertEquals(list.removeAt(1), 9);
        assertNull(list.remove(9));
        assertEquals(list.removeAt(0), 5);
        assertEquals(list.removeAt(0), 11);
        assertEquals(list.length, 0);

        list.prepend(5);
        list.prepend(7);
        list.prepend(9);

        assertEquals(list.get(2), 5);
        assertEquals(list.get(0), 9);
        assertEquals(list.remove(9), 9);
        assertEquals(list.length, 2);
        assertEquals(list.get(0), 7);
    }
}
