package queue;

public class QueueImpl implements Queue {
	// private static final int maxsize = 100; //maybe change it
    private String[] queue;
    private int front;
    private int rear;
    private int size;
	private int capacity;

	public QueueImpl(int capacity) {
        this.capacity = capacity;
		queue = new String[capacity]; //stting aray of that size defeinted 
        front = 0;
        rear = -1;
        size = 0;
    }

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
        return size == capacity;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
        return size == 0;
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		if (rear + 1 >= capacity) {
            System.out.println("que is full cant add element " + element);
            return;
        }
        rear++; 
        queue[rear] = element;
        size++;
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }
        String removed = queue[front];
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
        return removed;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("que is empty ");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null;
		} else {
			return queue[front];
		}
	}

}
