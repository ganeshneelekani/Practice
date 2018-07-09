package modifier;

import Matrix.EmployeeAnother;

public class Employee extends EmployeeAnother{
	
	void check(){
        String h = this.hello1;
    }
	
	 protected String hello;
	 String name;
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
