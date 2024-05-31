package linear.stack;

import java.util.NoSuchElementException;

public class Stack<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public void push(E elem) {
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

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        final Node<E> cur = last;
        last = last.prev;

        if (last == null) {
            first = null;
        } else {
            last.next = null;
        }

        size--;

        return cur.elem;
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return last.elem;
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

        Node<E> prev;

        Node<E> next;

        public Node(E elem, Node<E> prev, Node<E> next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
