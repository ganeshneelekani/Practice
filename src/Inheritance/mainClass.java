package Inheritance;

import java.util.Iterator;
import java.util.LinkedList;

public class mainClass {
	
	public static void main(String[] args) {
		
		LinkedList linkedList=new LinkedList<>();
		linkedList.add(1);
		
		LinkedList linkedList2=new LinkedList<>();
		linkedList2.add(3);
		linkedList2.add(4);
		linkedList2.add(3);
		linkedList2.add(9);
		
		Iterator iterator=linkedList2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		linkedList2.remove( 9);
		
		
		Iterator iterator1=linkedList2.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
		ParentClass class1= new ParentClass("asxasx");
		
		
		BaseClass baseClass=new BaseClass("a", "b", "c");
		baseClass.var3;
	}

}
