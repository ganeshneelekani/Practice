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
