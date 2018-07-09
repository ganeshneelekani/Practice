import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorImplimentation {
	

	    public static void main(String[] args){

	    	int number = 0;
	    	System.out.println(number);
	    	System.out.println("Before shift : " + Integer.toBinaryString(number));
	    	                           
	    	number = number >> 1; //shifting 1 right bit

	    	System.out.println(number);
	    	System.out.println("After shift  : " + Integer.toBinaryString(number));

	}
}
