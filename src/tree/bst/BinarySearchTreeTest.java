package tree.bst;

public class BinarySearchTreeTest {

    private static void test() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        testInsert(bst);
        testInorder(bst);
        testDelete(bst);
    }

    private static void testInorder(BinarySearchTree<Integer> binaryTree) {
        System.out.println("--- Inorder Traversal Test  ---");
        System.out.print("Traversing in-order (must be sorted): ");
        binaryTree.inorderTraversal();
        System.out.println("\n");
    }

    private static void testDelete(BinarySearchTree<Integer> bst) {
        System.out.println("--- Deletion Test  ---");
        int[] toDelete = {6, 1, 3, 10, 9, 2, 6, 4};

        for (int n : toDelete) {
            System.out.println("Deleting " + n + "...");
            bst.delete(n);
            System.out.print("Traversing level-order: ");
            bst.levelOrderTraversal();
            System.out.println();
        }
    }

    private static void testInsert(BinarySearchTree<Integer> bst) {
        System.out.println("--- Insertion Test ---");
        int[] data = {3, 2, 6, 6, 4, 1, 9};

        for (int n : data) {
            System.out.println("Inserting " + n + "...");
            bst.insert(n);
            System.out.print("Traversing level-order: ");
            bst.levelOrderTraversal();
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
