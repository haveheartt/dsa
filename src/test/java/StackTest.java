import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StackTest {
    @Test
    void stack(){
        Stack<Integer> list = new Stack<>();

        list.push(5);
        list.push(7);
        list.push(9);

        assertEquals(list.pop(), 9);
        assertEquals(list.length, 2);

        list.push(11);
        assertEquals(list.pop(), 11);
        assertEquals(list.pop(), 7);
        assertEquals(list.peek(), 5);
        assertEquals(list.pop(), 5);
        assertNull(list.pop());

        list.push(69);
        assertEquals(list.peek(), 69);
        assertEquals(list.length, 1);
    }

}
