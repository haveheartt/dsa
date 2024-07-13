import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    void queue(){
        Queue<Integer> list = new Queue<>();

        list.enqueue(5);
        list.enqueue(7);
        list.enqueue(9);

        assertEquals(list.deque(), 5);
        assertEquals(list.length, 2);

        list.enqueue(11);

        assertEquals(list.deque(), 7);
        assertEquals(list.deque(), 9);
        assertEquals(list.peek(), 11);
        assertEquals(list.deque(), 11);
        assertNull(list.deque());
        assertEquals(list.length, 0);

        list.enqueue(69);
        assertEquals(list.peek(), 69);
        assertEquals(list.length, 1);
    }
}
