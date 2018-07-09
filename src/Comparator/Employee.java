package Comparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int salary) {
		
		this.name=name;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	@Override
//	public int compare(Employee employee, Employee employee2) {
//		// TODO Auto-generated method stub
//		
//		if(employee.salary < employee2.salary) return -1;
//		else if(employee.salary > employee2.salary) return 1;
//		else return 0;
//		
//	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.salary < o.salary) return -1;
		else if(this.salary > o.salary) return 1;
		else return 0;
		
	}


	

}
