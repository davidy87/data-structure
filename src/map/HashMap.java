package map;

import java.util.NoSuchElementException;

public class HashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;

    private Node<K, V>[] hashTable;

    private int size;

    public HashMap() {
        this.hashTable = new Node[INITIAL_CAPACITY];
    }

    public void put(K key, V value) {
        int hashIndex = hash(key);
        Node<K, V> cur = hashTable[hashIndex];
        Node<K, V> newNode = new Node<>(key, value, null, null);

        if (cur == null) {
            hashTable[hashIndex] = newNode;
        } else {
            while (cur != null) {
                if (cur.key.equals(key)) {
                    cur.value = value;
                    break;
                }

                if (cur.next == null) {
                    newNode.prev = cur;
                    cur.next = newNode;
                    break;
                }

                cur = cur.next;
            }
        }

        size++;
    }

    public void remove(K key) {
        int hashIndex = hash(key);
        Node<K, V> cur = hashTable[hashIndex];

        while (cur != null) {
            if (cur.key.equals(key)) {
                if (cur.next == null) {
                    hashTable[hashIndex] = null;
                } else {
                    cur.prev = cur.next;
                }
                size--;
                return;
            }
            cur = cur.next;
        }

        throw new NoSuchElementException();
    }

    public V get(K key) {
        int hashIndex = hash(key);
        Node<K, V> cur = hashTable[hashIndex];

        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.value;
            }
            cur = cur.next;
        }

        throw new NoSuchElementException();
    }

    public int size() {
        return this.size;
    }

    private int hash(K key) {
        return key.hashCode() % hashTable.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (int i = 0; i < hashTable.length; i++) {
            Node<K, V> cur = hashTable[i];
            while (cur != null) {
                sb.append(cur.key + ": " + cur.value + ", ");
                cur = cur.next;
            }
        }

        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("}");
        return sb.toString();
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> prev, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
