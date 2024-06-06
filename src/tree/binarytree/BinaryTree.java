package tree.binarytree;

import java.util.*;

public class BinaryTree<T> {

    Node<T> root;

    public void insert(T data) {
        root = insert0(data);
    }

    private Node<T> insert0(T data) {
        if (root == null) {
            return new Node<>(data);
        }

        Queue<Node<T>> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node<T> cur = q.poll();

            if (cur.left == null) {
                cur.left = new Node<>(data);
                break;
            }

            q.offer(cur.left);

            if (cur.right == null) {
                cur.right = new Node<>(data);
                break;
            }

            q.offer(cur.right);
        }

        return root;
    }

    /**
     * 삭제할 node와 tree의 제일 마지막 node를 swap하는 방식
     */
    public void delete(T data) {
        if (root == null) {
            System.out.println(data + " not found.");
            return;
        } else if (root.left == null && root.right == null) {
            if (root.data == data) {
                root = null;
            } else {
                System.out.println(data + " not found.");
            }

            return;
        }

        Queue<Node<T>> q = new LinkedList<>();
        q.offer(root);
        Node<T> lastNode = null;
        Node<T> target = null;

        while (!q.isEmpty()) {
            lastNode = q.poll();

            if (lastNode.data == data) {
                target = lastNode;
            }

            if (lastNode.left != null) {
                q.offer(lastNode.left);
            }

            if (lastNode.right != null) {
                q.offer(lastNode.right);
            }
        }

        if (target != null) {
            target.data = lastNode.data;
            deleteFromLastNode(lastNode);
        } else {
            System.out.println(data + " not found.");
        }
    }

    private void deleteFromLastNode(Node<T> lastNode) {
        Queue<Node<T>> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node<T> cur = q.poll();

            if (cur.left != null) {
                if (cur.left == lastNode) {
                    cur.left = null;
                    return;
                }

                q.offer(cur.left);
            }

            if (cur.right != null) {
                if (cur.right == lastNode) {
                    cur.right = null;
                    return;
                }

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

    private static class Node<T> {

        T data;

        Node<T> left;

        Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }
}
