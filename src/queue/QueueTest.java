package queue;

public class QueueTest {

    public static void test() {
        System.out.println("[Starting queue test]");
        enqueueTest();
        dequeueTest();
        peekTest();
    }

    private static void enqueueTest() {
        System.out.println("--- Enqueue Test ---");
        Queue<Integer> queue = new Queue<>();
        System.out.println("Before: " + queue);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enqueue " + i + " -> ");
            queue.enqueue(i);
            System.out.println("After: " + queue);
        }

        System.out.println();
    }

    private static void dequeueTest() {
        System.out.println("--- Dequeue Test ---");
        Queue<Integer> queue = new Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        System.out.println("Before: " + queue);

        while (!queue.isEmpty()) {
            System.out.print("Dequeue " + queue.dequeue() + " -> ");
            System.out.println("After: " + queue);
        }

        System.out.println();
    }

    private static void peekTest() {
        System.out.println("--- Peek Test ---");
        Queue<Integer> queue = new Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        System.out.println("Before: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
