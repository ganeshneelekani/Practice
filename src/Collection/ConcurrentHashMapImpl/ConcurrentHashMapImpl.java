package Collection.ConcurrentHashMapImpl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import Collection.Department;
import Collection.Employee;

public class ConcurrentHashMapImpl {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

//		Employee obj4 = new Employee();
//		System.out.println(obj4.getEmail());
//		
//		String s1 = new String();
//		System.out.println(s1);
//		
//		System.out.println("=============");
		
		Employee obj1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
		Employee obj2 = new Employee(2009, "Ambay", 30000.00, "martin@infotech.com");
		Employee obj3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");

		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");

	    //Map<Employee,Department> empDeptMap = new Hashtable<>();
	     Map<Employee,Department> empDeptMap = new HashMap<>();
		// Map<Employee,Department> empDeptMap = new ConcurrentHashMap<>();

		empDeptMap.put(obj1, d1);
		empDeptMap.put(obj2, d1);

		empDeptMap.put(obj3, d2);

		//empDeptMap.put(null, d1);
		//empDeptMap.put(e6, null);

		obj1 = null;
		obj2 = null;

		 System.gc();
		 
		 Object object=new Object();
		 System.out.println(object.getClass());
		 
	
		 Collections.synchronizedMap(m)

		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee, Department> entry = (Map.Entry<Employee,Department>) iterator.next();
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
			 empDeptMap.put(new Employee(5010, "Abrahim", 930000.00, "abrahim@infotech.com"), d2);
		}

	}

}