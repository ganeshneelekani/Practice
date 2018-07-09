package LinkedList;

public class LinkIml<E> {

	Node first;
	Node last;

	public boolean add(E e) {
		linkLast(e);
		return true;
	}




	private void linkLast(E e) {
		// TODO Auto-generated method stub

		Node l=last;
		System.out.println(l);
		Node newNode=new Node(l, e, null);
		System.out.println(newNode);
		last=newNode;
		if(l==null) {
			first=newNode;
		}
		else {
			l.next=newNode;
		}

	}

	
	private void linkFirst(E e) {
		// TODO Auto-generated method stub

		Node f=first;
		
		Node newNode=new Node(null, e, first);
		System.out.println(newNode);
		first=newNode;
		if(f==null) {
			first=newNode;
		}
		else {
			f.prev=newNode;
		}

	}



	public class Node{
		E e;
		Node prev;
		Node next;
		public Node(Node prev,E e, Node next) {
			// TODO Auto-generated constructor stub
			this.prev=prev;
			this.e=e;
			this.next=next;
		}

	}

}
