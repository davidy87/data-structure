package linkedlist;

public class LinkedListTest {

    public static void test() {
        addition();
        insertion();
        deletion();
    }

    private static void addition() {
        System.out.println("--- Add Test ---");
        LinkedList<Integer> list = new LinkedList<>();
        before(list);

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        after(list);
    }

    private static void insertion() {
        System.out.println("--- Insert Test ---");
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        before(list);

        System.out.println("\nInserting -1 at index 4...");
        list.add(4, -1);
        after(list);

        System.out.println("Inserting -1 at index 7...");
        list.add(7, -1);
        after(list);
    }

    private static void deletion() {
        System.out.println("--- Remove Test ---");
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        before(list);

        System.out.println("\nDeleting from index 4...");
        list.remove(4);
        after(list);

        System.out.println("Deleting from index 7...");
        list.remove(7);
        after(list);
    }

    private static void printResult(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void after(LinkedList<Integer> list) {
        System.out.print("After: ");
        printResult(list);
        System.out.println("\n");
    }

    private static void before(LinkedList<Integer> list) {
        System.out.print("Before: ");
        printResult(list);
        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
