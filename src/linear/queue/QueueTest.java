package linear.queue;

public class QueueTest {

    public void test() {
        System.out.println("[Starting queue test]");
        enqueueTest();
        dequeueTest();
    }

    private void enqueueTest() {
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

    private void dequeueTest() {
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
}
