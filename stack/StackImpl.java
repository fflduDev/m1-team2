package stack; 

public class StackImpl implements Stack {
	private String[] theStack;
	private int top;
    private int capacity;


	public StackImpl(int size) {
        this.capacity = size;
        theStack = new String[size];
        top = -1; //initializing a stack u want of ur size and make it empty
    }

	@Override
	public void push(String s) {
		if (isFull()) {
            System.out.println("stack is full cant add: " + s);
            return;
        }
        theStack[++top] = s;
        System.out.println("added to stack: " + s);
    }

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("stack is empty theres nothing to pop");
            return null;
        }
        return theStack[top--];
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1; 
		// System.out.println(theStack);
		// if (theStack[0] == null){
		// 	System.out.println("empty");
		// }
		// else{
		// 	System.out.println("not empty, heres the bottom element rn: " + theStack[0]);
		// }
		// return null;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity - 1;
		// return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
        return top + 1;
		// return 0;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("nothing to see the stack is empty");
            return null;
        }
        return theStack[top];
    }


	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		// theStack = new String[size];
		capacity = size;
        theStack = new String[size];
        top = -1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("the stack is empty");
            return;
        }
        System.out.println("the stack printed top to bottom: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(theStack[i]);
        }
	}
 

}
