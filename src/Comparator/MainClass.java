package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee=new Employee("Ganesh", 50000);
		Employee employee1=new Employee("Kishor", 20000);

		ArrayList arrayList=new ArrayList<>();
		arrayList.add(employee1);
		arrayList.add(employee);

		Collections.sort(arrayList);

		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()) {

			Employee employee2=(Employee)iterator.next();
			System.out.println(employee2.getName());
			System.out.println(employee2.getSalary());
		}

	}

}
