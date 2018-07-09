import java.util.ArrayList;

public class Car extends Drive{
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	int a;
public void m1() {
		
		System.out.println("sub method");
	}
	
	public  void dog() {
		// TODO Auto-generated constructor stub
		System.out.println("===========1=======");
	}
	public  void Car1() {
		// TODO Auto-generated constructor stub
		this.a=30;
		int a=20;
		
		this.m1();
		this();
//		System.out.println(a);
//		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.Car1();
		
		
		
	}

}
