package GeeksForGeeks.Datatype;

import java.util.Scanner;

public class OperatorImpl {

	private static Scanner firstInput;
	private static Scanner secondInput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstInput = new  Scanner(System.in);
		secondInput = new  Scanner(System.in);
		
		int A=firstInput.nextInt();
		int B=secondInput.nextInt();
		
		if(A > B) {
			System.out.println(" A is greater than B");
		}

		else if(A < B) {
			System.out.println(" B is greater than A");
		}
		else if(A == B) {
			System.out.println(" A is equal to B");
		}
		

	}

}
