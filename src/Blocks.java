import java.util.concurrent.TimeUnit;

public class Blocks {
	int a=10;
	static int b=20;
	{
		System.out.println("instance block");
		System.out.println(a);
		System.out.println(b +"PPPP");
	}
	static { // Static block will be executed first
		System.out.println("static block");
		// System.out.println(a);  instance variable cannot be accessed here as this is a static block
		System.out.println(b);
	}
	
	static { // You can have any number of static blocks
		System.out.println("static block-2");
		// System.out.println(a);  instance variable cannot be accessed here as this is a static block
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks b= new Blocks(); // instance bock won't be executed unless you create an object
		
		System.out.println(b.a +"OOOOOOO");
		
		long milliseconds = 10000100;
		long milliseconds1 = 20000100;

	    // long minutes = (milliseconds / 1000) / 60;
	    long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());

	    // long seconds = (milliseconds / 1000);
	    long seconds = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());
	    
	    long  hour=seconds-minutes;
	    
	    int Hours = (int)hour/60;     
	    int Minutes = (int)hour%60;     
	    System.out.println(Hours+":"+Minutes); 

	   
	}
	
	
}

//Output
/*
static block
20
instance block
10
20PPPP
10OOOOOOO
 */
