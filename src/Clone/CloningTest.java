package Clone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee();

		emp.setId(1);
		emp.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp.setProps(props);

		Employee clonedEmp = (Employee) emp.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));
		
		System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));
		
		System.out.println("emp and clonedEmp name == test: " + (emp.getName()== clonedEmp.getName()));
		
		// Lets see the effect of using default cloning
		
		ArrayList arrayList=new ArrayList();
		
		// change emp props
		emp.getProps().put("title", "CEO");
		emp.getProps().put("city", "New York");
		System.out.println("clonedEmp props:" + emp.getProps());
		System.out.println("clonedEmp props:" + clonedEmp.getProps());

		// change emp name
		emp.setName("new");
		System.out.println("clonedEmp name:" + emp.getName());
		System.out.println("clonedEmp name:" + clonedEmp.getName());
		
		emp.setId(2);
		System.out.println("clonedEmp name:" + emp.getId());
		System.out.println("clonedEmp name:" + clonedEmp.getId());

	}

}
