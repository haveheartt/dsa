public class DoublyNode<T> {
    public T value;
    public DoublyNode<T> prev;
    public DoublyNode<T> next;

    DoublyNode(T value, DoublyNode<T> prev, DoublyNode<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

}
