
public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 9;
		
		int b=0;
		try {
			int c=a/b;
		}finally {
			System.out.println("=====1====");
		}

	System.gc();
	}

}
