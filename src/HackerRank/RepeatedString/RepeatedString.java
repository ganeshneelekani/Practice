package HackerRank.RepeatedString;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="aaaa";
		Scanner scanner=new Scanner(System.in);

		long numberOfElement=scanner.nextLong();
		System.out.println("Number Of element is "+numberOfElement);

		String inputString=scanner.next(); 
		System.out.println("Input String is "+inputString);

		
		
        long num = numberOfElement/s.length();
        long rem = numberOfElement%s.length();
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
            	System.out.println(ans);
            	System.out.println(num);
                ans = ans+num;
                if (i < rem)
                    ans++;
            }
        }
        System.out.println(ans);


	}

}
