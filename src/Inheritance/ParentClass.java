package Inheritance;

public class ParentClass {
	
	public String var1;
	
	
	public ParentClass() {
		
		System.out.println("======constructor=====");
		// TODO Auto-generated constructor stub
	}
	public ParentClass(String var1) {
		// TODO Auto-generated constructor stub
		
		this.var1=var1;
	}
	
	public void hello() {
		var1="Ganesh";
		System.out.println("=============1========="+var1);
	}
	
	
	

}
