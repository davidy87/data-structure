package linear.queue;

import java.util.NoSuchElementException;

public class Queue<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public void enqueue(E elem) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(elem, null);
        last = newNode;

        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }

        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node<E> cur = first;
        first = first.next;

        if (first == null) {
            last = null;
        }

        size--;

        return cur.elem;
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return first.elem;
    }

    public boolean isEmpty() {
        return size == 0 && first == null && last == null;
    }

    // For testing purpose
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<E> cur = first;

        while (cur != null) {
            result.append(cur.elem.toString()).append(" ");
            cur = cur.next;
        }

        return result.toString();
    }

    private static class Node<E> {

        E elem;

        Node<E> next;

        public Node(E elem, Node<E> next) {
            this.elem = elem;
            this.next = next;
        }
    }
}
