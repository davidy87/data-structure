package linear.linkedlist;

public class LinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public void add(E elem) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(elem, l, null);
        last = newNode;

        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }

        size++;
    }

    public void add(int index, E elem) {
        final Node<E> prev = getNode(index - 1);
        final Node<E> next = prev.next;
        final Node<E> newNode = new Node<>(elem, prev, next);
        prev.next = newNode;
        next.prev = newNode;
        size++;
    }

    public void remove(int index) {
        final Node<E> cur = getNode(index);
        cur.prev.next = cur.next;
        size--;
    }

    public E get(int index) {
        return getNode(index).elem;
    }

    private Node<E> getNode(int index) {
        Node<E> result = first;

        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result;
    }

    public int size() {
        return this.size;
    }

    private static class Node<E> {

        E elem;

        Node<E> prev;

        Node<E> next;

        public Node(E elem, Node<E> prev, Node<E> next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
