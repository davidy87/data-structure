import linear.linkedlist.LinkedListTest;
import linear.queue.QueueTest;
import linear.stack.StackTest;

public class Main {
    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.test();

        QueueTest queueTest = new QueueTest();
        queueTest.test();

        StackTest stackTest = new StackTest();
        stackTest.test();
    }
}