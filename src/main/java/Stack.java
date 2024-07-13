public class Stack<T> {
    public int length;
    public BubbleSort.Node<T> head;

    Stack() {
        this.head = null;
        this.length = 0;
    }

    public void push(T item) {
        BubbleSort.Node<T> head = new BubbleSort.Node<>(item, null);

        this.length++;
        if (this.head == null) {
            this.head = head;
            return;
        }

        head.next = this.head;
        this.head = head;
    }

    public T pop() {
        this.length = Math.max(0, this.length - 1);
        if (this.length == 0) {
            BubbleSort.Node<T> head = this.head;
            this.head = null;
            if (head != null) {
                return head.value;
            } else {
                return null;
            }
        }

        BubbleSort.Node<T> head = this.head;
        this.head = head.next;

        head.next = null;

        return head.value;
    }

    public T peek(){
        return this.head.value;
    }
}
