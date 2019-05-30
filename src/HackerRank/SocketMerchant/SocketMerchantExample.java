package HackerRank.SocketMerchant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SocketMerchantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BufferedWriter bufferedWriter = null ;
//
//		try {
//			bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		Scanner scanner = new Scanner(System.in); 

		System.out.println("Enter the number of elements");

		int numberOfElements=scanner.nextInt();

		System.out.println("Enter the elements");
		int[] numberArray=new int[numberOfElements];

		for (int i = 0; i < numberArray.length; i++) {

			numberArray[i]=scanner.nextInt();
		}

		System.out.println("  Array elements  ");

		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}

		int pattern=0;
		Set duplicateElements=new HashSet();

		for (int i = 0; i < numberArray.length; i++) {

			if (duplicateElements.contains(numberArray[i])) {
				duplicateElements.remove(numberArray[i]);

				pattern++;
			}
			else {
				duplicateElements.add(numberArray[i]);
			}

		}
		System.out.println(" Number of patterns");
		System.out.println(pattern);

//		try {
//			bufferedWriter.write(String.valueOf(pattern));
//			bufferedWriter.newLine();
//
//			bufferedWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		scanner.close();
	}

}
