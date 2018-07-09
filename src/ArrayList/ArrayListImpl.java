package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList arrayList=new ArrayList<>();
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(100);
	
		
		arrayList.remove((Object)3);
		
		
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}


}
