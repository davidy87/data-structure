package linear.stack;

public class StackTest {

    public void test() {
        System.out.println("[Starting stack test]");
        pushTest();
        popTest();
        peekTest();
    }

    private void pushTest() {
        System.out.println("--- Push Test ---");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Before: " + stack);

        for (int i = 0; i < 10; i++) {
            System.out.print("Pushing " + i + " -> ");
            stack.push(i);
            System.out.println("After: " + stack);
        }

        System.out.println();
    }

    private void popTest() {
        System.out.println("--- Pop Test ---");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Before: " + stack);

        while (!stack.isEmpty()) {
            System.out.print("Popping " + stack.pop() + " -> ");
            System.out.println("After: " + stack);
        }

        System.out.println();
    }

    private void peekTest() {
        System.out.println("--- Peek Test ---");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Before: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println();
    }
}
