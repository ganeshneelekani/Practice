package HackerRank.SocketMerchant.CountingValleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		Scanner in = new Scanner(System.in);
//		final String fileName = System.getenv("OUTPUT_PATH");
//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Scanner scanner=new Scanner(System.in);

		String StringInput = scanner.next();

		char[] inputArray=StringInput.toCharArray();

		System.out.println("Array Elements");

		for (int i = 0; i < inputArray.length; i++) {

			System.out.println(inputArray[i]);
		}

		int valley=0;
		int pattern=0;
		

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i]=='D') {

				valley--;

				System.out.println(" +++ "+valley);
				if (valley==0 && i==0)
				{
					i++;
					pattern++;
				}

			}

			else if (inputArray[i]=='U') {

				valley++;

				System.out.println(" --- "+valley);
				if (valley==0)
				{
					i--;
					pattern++;
				}
			}

		}


		System.out.println(pattern);

		//		try {
		//			bufferedWriter.write(pattern);
		//			bufferedWriter.close();
		//
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}

		scanner.close();
	}



}
