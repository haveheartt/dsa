public class DoublyLinkedList<T> {
    public int length;
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    DoublyLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void prepend(T item) {
        DoublyNode<T> node = new DoublyNode<>(item, null, null);
        this.length++;

        if(this.head == null) {
            this.head = this.tail = node;
            return;
        }

        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    public void insertAt(T item, int idx) {
        if (idx > this.length) {
            throw  new Error("oh no");
        }

        if (idx == this.length) {
            this.append(item);
        }

        if (idx == 0) {
            this.prepend(item);
        }

        this.length++;
        DoublyNode<T> curr = this.getAt(idx);
        DoublyNode<T> node = new DoublyNode<>(item, null, null);

        node.next = curr;
        node.prev = curr.prev;
        curr.prev = node;

        if (node.prev != null) {
            node.prev.next = curr;
        }
    }

    public void append(T item) {
        this.length++;
        DoublyNode<T> node = new DoublyNode<>(item, null, null);
        if (this.tail == null) {
            this.head = this.tail = node;
            return;
        }

        node.prev = this.tail;
        this.tail.next = node;

        this.tail = node;
    }

    public T remove(T item) {
        DoublyNode<T> curr = this.head;

        for (int i = 0; curr != null && i < this.length; i++) {
            if (curr.value == item) {
                break;
            }
            curr =  curr.next;
        }

        if (curr == null) {
            return null;
        }

        return this.removeNode(curr);
    }

    public T get(int idx) {
        return this.getAt(idx).value;
    }

    public T removeAt(int idx) {
        DoublyNode<T> node = this.getAt(idx);

        if (node == null) {
            return null;
        }
        return this.removeNode(node);
    }

    private T removeNode(DoublyNode<T> node) {
        this.length--;

        if (this.length == 0) {
            T out = this.head.value;
            this.head = this.tail = null;
            return out;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        if (node == this.head) {
            this.head = node.next;
        }

        if (node == this.tail) {
            this.tail = node.prev;
        }

        node.prev = node.next = null;
        return node.value;
    }

    private DoublyNode<T> getAt(int idx) {
        DoublyNode<T> curr = this.head;
        for (int i = 0; curr != null && i < idx; i++) {
            curr = curr.next;
        }
        return curr;
    }
}
