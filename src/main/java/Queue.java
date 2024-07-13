public class Queue<T> {
    public int length;
    public BubbleSort.Node<T> head;
    public BubbleSort.Node<T> tail;

    Queue() {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void enqueue(T item) {
        BubbleSort.Node<T> node = new BubbleSort.Node<>(item, null);
        this.length++;
        if (this.length == 1) {
            this.head = this.tail = node;
            return;
        }

        this.tail.next = node;
        this.tail = node;
    }

    public T deque() {
        if (this.length == 0) {
            return null;
        }

        this.length--;

        BubbleSort.Node<T> head = this.head;
        this.head = head.next;

        head.next = null;

        if (this.length == 0) {
            this.tail = null;
        }

        return head.value;
    }

    public T peek() {
        return this.head.value;
    }
}
