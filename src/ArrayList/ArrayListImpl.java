package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import sun.security.util.Length;

public class ArrayListImpl {
	
	Object[] objects;
	
	int size=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayListImpl arrayListImpl=new ArrayListImpl();
		arrayListImpl.add(5);
		arrayListImpl.add(6);
		
		
		arrayListImpl.remove(8);
	}

	private Object remove(int i) {
		// TODO Auto-generated method stub
		
		if(objects.length < i) {
			
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			objects[i]=null;
			int tmp=i;
			while(i < size) {
				objects[tmp]=objects[tmp+1];
				objects[tmp+1]=null;
				tmp++;
			}
			size--;
		}
		return objects;
		
	}

	private void add(Object value) {
		
		if(objects.length < size) {

			increaseArraySize();
		}
		objects[size++]=value;
		
	}

	private void increaseArraySize() {
		// TODO Auto-generated method stub
		
		objects=Arrays.copyOf(objects, objects.length*2);
		
	}


}
