package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue riderQueue = new QueueImpl(100);//u set capcaity 
        // Queue riderQueue = new QueueImpl();

        riderQueue.enQueue("rider a");
        riderQueue.enQueue("rider b");
        riderQueue.enQueue("rider c");
        riderQueue.enQueue("rider d");
        riderQueue.enQueue("rider e");
        riderQueue.enQueue("rider f");

        System.out.println("current que:");
        riderQueue.display();

        System.out.println("fron of que: " + riderQueue.peek());

        System.out.println("dequed rider: " + riderQueue.deQueue());

        System.out.println("que after dequeing:");
        riderQueue.display();

        riderQueue.enQueue("rider g");
        riderQueue.enQueue("rider h");

        System.out.println("front of que after adding two riders: " + riderQueue.peek());

        System.out.println("dequed rider: " + riderQueue.deQueue());

        System.out.println("final que:");
        riderQueue.display();
		System.out.println("Looks good!");
	}

}
