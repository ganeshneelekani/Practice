package QueueImpli;

public class QueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNQueue tnq=new  TNQueue(3);
		if(!tnq.isFull())
			tnq.insert(1);
		if(!tnq.isFull())
			tnq.insert(2);
		if(!tnq.isFull())
			tnq.insert(3);
		if(!tnq.isFull())
			tnq.insert(4);
		else
			System.out.println("Queue is full, cannot insert element");

		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		else
			System.out.println("Queue is empty, cannot remove element");
	}
}


class TNQueue{
	public int rear=-1;
	public int front=-1;
	public int queueArr[];
	public int size;
	public int totalItems;

	public TNQueue(int s) {
		// TODO Auto-generated constructor stub
		size=s;
		queueArr=new int[s];
	}

	public int insert(int i) {
		// TODO Auto-generated method stub
		rear++;
		System.out.println("Inserting "+i);
		queueArr[rear]=i;
		totalItems++;
		return queueArr[rear];
	}

	public int remove() {
		front++;
		totalItems--;
		System.out.println("Removing "+queueArr[front]);
		return queueArr[front];
	}

	public boolean isFull() {
		System.out.println(size);

		return (totalItems == size);
	}

	public boolean isEmpty() {
		return (totalItems == 0);
	}

}