package Inheritance;

public class BaseClass extends ParentClass{

	public String var2;
	public String var3;
	
	 BaseClass(String var2,String var3,String var1) {
		//super(var1);
		this.var2=var2;
		this.var3=var3;
		
		
	}
	
	public void hello() {
		System.out.println("=============2========="+var1 +" "+var2 +" "+var3);
	}
}
