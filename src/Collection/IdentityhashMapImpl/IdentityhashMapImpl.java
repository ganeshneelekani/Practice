package Collection.IdentityhashMapImpl;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class IdentityhashMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map hashMap=new IdentityHashMap<>();
		hashMap.put("ganesh", 1);
		hashMap.put("ganesh", 2);
		hashMap.put("ganesh", 3);

		Map hashMap1=new HashMap<>();
		hashMap1.put(1, 1);
		hashMap1.put(1, 2);
		hashMap1.put(1, 3);

		

		hashMap.forEach((key,value) -> System.out.println(key + " = " + value));

		hashMap1.forEach((key,value) -> System.out.println(key + " = " + value));
		
		Map<String, Integer> idMap = new IdentityHashMap<>();
		
		String str = new String("Java");

	    idMap.put(str, 1);
	    
	    System.out.println(idMap.containsKey("Java"));
	    
	    
	    String s1= new String("ganesh");
	    
	    String s2= new String("ganesh");
	    
	    String s3="ganesh";
	    
	    String s4="ganesh";
	    
	    System.out.println(s1==s2);
	    System.out.println(s3==s4);
	    System.out.println(s3.equals(s4));
	    System.out.println(s2.equals(s1));

	}

}
