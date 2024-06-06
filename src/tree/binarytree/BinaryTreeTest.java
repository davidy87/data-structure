package tree.binarytree;

public class BinaryTreeTest {

    private static void test() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        testInsert(binaryTree);
        testDelete(binaryTree);
    }

    private static void testDelete(BinaryTree<Integer> binaryTree) {
        System.out.println("--- Deletion Test  ---");
        int[] toDelete = {6, 1, 3, 10, 9, 2, 6};

        for (int n : toDelete) {
            System.out.println("Deleting " + n + "...");
            binaryTree.delete(n);
            System.out.print("Traversing level-order: ");
            binaryTree.levelOrderTraversal();
            System.out.println();
        }
    }

    private static void testInsert(BinaryTree<Integer> binaryTree) {
        System.out.println("--- Insertion Test ---");
        int[] data = {3, 1, 6, 6, 2, 9};

        for (int n : data) {
            System.out.println("Inserting " + n + "...");
            binaryTree.insert(n);
            System.out.print("Traversing level-order: ");
            binaryTree.levelOrderTraversal();
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
