package TreeImpl.FindMax;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javafx.print.Collation;

public class App {
	
	
	public static void main(String[] args) {
		
		Node A = Node.createNode(60);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(90);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(75);
		Node G = Node.createNode(45);
		
		
		A.leftNode = B;
		A.rightNode = C;
		// connect level 1 and level 2
		B.leftNode = D;
		B.rightNode = E;
		C.leftNode = F;
		C.rightNode = G;

		
		int maxElement = FindMaxAndMinImpl.findMaxValue(A);
		System.out.println("Maximum element in a binary tree: " + maxElement);

		int minElement = FindMaxAndMinImpl.findMinValue(A);
		System.out.println("Minimum element in a binary tree: " + minElement);
		
		
		PriorityQueue<String> pQueue = 
                new PriorityQueue<String>(); 

// Adding items to the pQueue using add()
		pQueue.add("B"); 
		pQueue.add("Python"); 
		pQueue.add("C++"); 
		pQueue.add("C"); 
		pQueue.add("C++"); 
		pQueue.add("Java"); 
		pQueue.add("A"); 
		
		

// Printing the most priority element 
System.out.println("Head value using peek function:"
                                 + pQueue.peek()); 

		
	}


}
