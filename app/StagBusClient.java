package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

// import linkedList.LinkedListTester;

public class StagBusClient {
//jameshaimoff
	//testing git push again
	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		linkedList.LinkedListTester.main(args);

		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");
		//QRunTestMethod...
		stack.StackTester.main(args);

		System.out.println("----Q U E U E  T E S T-------");
		queue.QueueTester.main(args);

		//StackRunTestMethod...
		
	 	}

}
