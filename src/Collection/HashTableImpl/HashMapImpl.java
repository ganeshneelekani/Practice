package Collection.HashTableImpl;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Object,String> ht=new Hashtable<Object,String>();
		ht.put(100,"Amit");
		ht.put(100,"Amit");  
		ht.put(101,"Vijay");
		ht.put(102,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //----------------hashmap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(null,"Amit");  // hash map allows duplicate values
        hm.put(null,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

	}

}
