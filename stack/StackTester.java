package stack;
//import java.util.Stack;
public class StackTester {

	public static void main(String[] args) {
//		Stack<String> stack = new Stack<>();
		// Stack stackTester = new StackImpl();
		// //note you must SET CAPACITY BEFORE ANYTHING
		// stackTester.setCapacity(10);
		// stackTester.push("thing in stack");
		// stackTester.isEmpty();

        Stack riderStack = new StackImpl(10);

        riderStack.push("rider a");
        riderStack.push("rider b");
        riderStack.push("rider c");
        riderStack.push("rider d");
        riderStack.push("rider e");
        riderStack.push("rider f");

        System.out.println("current stack:");
        riderStack.display();

        System.out.println("top of the stack: " + riderStack.peek());

        System.out.println("popped from stack: " + riderStack.pop());

        System.out.println("stack after popping:");
        riderStack.display();

        System.out.println("top of the satck: " + riderStack.peek());

        riderStack.push("rider g");
        riderStack.push("rider h");

        System.out.println("top of the stack after addition of 2 ppl: " + riderStack.peek());

        while (!riderStack.isEmpty()) {
            System.out.println("popped: " + riderStack.pop());
        }

        System.out.println("is the stack empty: " + riderStack.isEmpty());


	}
	
	// public static void runTests(Stack stack) {
	 	
	// }

}
