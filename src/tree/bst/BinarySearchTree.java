package tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public void insert(T data) {
        root = insert0(root, data);
    }

    private Node<T> insert0(Node<T> cur, T data) {
        if (cur == null) {
            return new Node<>(data);
        }

        int compare = data.compareTo(cur.data);

        if (compare < 0) {
            cur.left = insert0(cur.left, data);
        } else if (compare > 0) {
            cur.right = insert0(cur.right, data);
        }

        return cur;
    }

    public void delete(T data) {
        root = delete0(root, data);
    }

    private Node<T> delete0(Node<T> cur, T data) {
        if (cur == null) {
            System.out.println(data + " not found.");
            return null;
        }

        int compare = data.compareTo(cur.data);

        if (compare < 0) {
            cur.left = delete0(cur.left, data);
            return cur;
        } else if (compare > 0) {
            cur.right = delete0(cur.right, data);
            return cur;
        }

        if (cur.left == null && cur.right == null) {
            return null;
        }

        T dataToSwap = swap(cur).data;
        cur.data = dataToSwap;
        cur.right = delete0(cur.right, dataToSwap);
        return cur;
    }

    private Node<T> swap(Node<T> cur) {
        if (cur.left == null) {
            return cur.right;
        }

        if (cur.right == null) {
            return cur.left;
        }

        return findSuccessor(cur.right);
    }

    private Node<T> findSuccessor(Node<T> cur) {
        return cur.left == null ? cur : findSuccessor(cur.left);
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node<T>> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node<T> cur = q.poll();
            System.out.print(" -> " + cur.data);

            if (cur.left != null) {
                q.offer(cur.left);
            }

            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node<T> cur) {
        if (cur == null) {
            return;
        }

        inorder(cur.left);
        System.out.print(" -> " + cur.data);
        inorder(cur.right);
    }

    private static class Node<T> {

        T data;

        Node<T> left;

        Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }
}
