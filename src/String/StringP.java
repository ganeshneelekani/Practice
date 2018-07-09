package String;

public class StringP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer buffer1=new StringBuffer("ganesh");
		StringBuffer buffer2=new StringBuffer("ganesh");
		
		String string1="ganesh";
		String string2="ganesh";
		System.out.println(string1 == string2);
	System.out.println(buffer1.equals(buffer2));
	
	Object object="ganesh";
	Object object2="ganesh";
	System.out.println(object.equals(object2));
		
		
	}

}
