
public class TNQueue {
	
	public static void main(String[] args) {
		QueueImpl tnq = new QueueImpl(3);
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
 
    }

}
