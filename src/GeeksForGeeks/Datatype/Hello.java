package GeeksForGeeks.Datatype;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		2
//		1 gfg 2.4
//		18 geeksforgeeks 9.88
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		System.out.println(t +"==========1======");
		while(t-- > 0)
		{
			int i=sc.nextInt();
			System.out.println(i +"==========2======"+t);
			String s=sc.next();
			System.out.println(s +"==========3======");
			Double d=sc.nextDouble();
			System.out.println(d +"==========4======");
			System.out.println(i+" "+s+" "+d+" ");
		}
	}

}
