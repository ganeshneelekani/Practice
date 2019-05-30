package TreeImpl.FindMax;

public class Node {
	
	public int data;
	public Node leftNode;
	public Node rightNode;
	
	public Node() {
		// TODO Auto-generated constructor stub
		this.leftNode=null;
		this.rightNode=null;
	}
	
	public Node(int data) {
		
		this.data=data;
		this.leftNode=leftNode;
		this.rightNode=rightNode;
	}
	
	public static Node createNode(int number) {
		
		return new Node(number);
	}

}
