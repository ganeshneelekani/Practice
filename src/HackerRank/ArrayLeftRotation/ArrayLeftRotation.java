package HackerRank.ArrayLeftRotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayLeftRotation {

	static int[] rotLeft(int[] arr, int d) {

	
	        for (int i = 0; i < d; i++) {
	        	 leftRotatebyOne(arr, arr.length); 
	        	
	        }
	    
		return arr;

	}

	private static void leftRotatebyOne(int[] arr, int length) {
		// TODO Auto-generated method stub
		

        int i, temp; 
        
        temp = arr[0];
        System.out.println(arr[0]+" P");
        System.out.println(temp);
        for (i = 0; i < length - 1; i++) 
            arr[i] = arr[i + 1];
        
        arr[i] = temp; 
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		
		System.out.println("===========1==========");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}


		int[] result = rotLeft(a, d);
		System.out.println("===========2==========");
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}

//		for (int i = 0; i < result.length; i++) {
//			bufferedWriter.write(String.valueOf(result[i]));
//
//			if (i != result.length - 1) {
//				bufferedWriter.write(" ");
//			}
//		}
//
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();


	}
}
