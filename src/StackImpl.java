
public class StackImpl {
	private int size;
	private int[] stackArr;
	private int top = -1;

	public StackImpl(int size) {
		this.size = size;
		stackArr = new int[size];
	}

	/**
	 * increment the ctr and push element into stack 
	 * @param i element to be pushed
	 */
	public void push(int i) {
		top++;
		System.out.println("Pushing "+i);
		stackArr[top] = i;
	}

	/**
	 * pop the element from stack and decrement the ctr 
	 * @return the popped element
	 */
	public int pop() {
		int i = stackArr[top];
		top--;
		System.out.println("Popping "+i);
		return i;
	}

	public int peek() {
		System.out.println("Peek "+stackArr[top]);
		return stackArr[top];
	}

	public boolean isFull() {
		return (top == size-1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}


class TNStackClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackImpl tns = new StackImpl(3);
		// push some elements
		if(!tns.isFull())
			tns.push(4);
		if(!tns.isFull())
			tns.push(5);
		if(!tns.isFull())
			tns.push(3);
		if(!tns.isFull())
			tns.push(6);
		else
			System.out.println("Stack is full, cannot push element");

		// pop some elements
		if(!tns.isEmpty())
			tns.pop();
		if(!tns.isEmpty())
			tns.pop();
		if(!tns.isEmpty())
			tns.pop();
		if(!tns.isEmpty())
			tns.pop();
		else
			System.out.println("Stack is empty, cannot pop element");

		//reinsert to verify peek method
		if(!tns.isFull())
			tns.push(6);

		// peek couple of times; result should be same
		tns.peek();
		tns.peek();
	}
}

