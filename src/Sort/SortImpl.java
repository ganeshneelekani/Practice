package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class SortImpl {

	int length;
	static int[] arrayValues;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unsortedArray= new int[] {45,24,2, 99, 1};
		SortImpl sortImpl=new SortImpl();
		sortImpl.sort(unsortedArray);

		for (int i = 0; i < arrayValues.length; i++) {
			System.out.println(arrayValues[i]);
		}
	}
	public void sort(int[] unsortedArray){
		length=unsortedArray.length;
		arrayValues=Arrays.copyOf( unsortedArray,length);
		quicksort(0,length-1);
		
		LinkedList linkedList=new LinkedList<>();
		linkedList.add(1);
		
		HashMap hashMap=new HashMap<>();
		hashMap.put(1, 1);
		

	}
	private void quicksort(int lowerIndex, int higestIndex) {
		// TODO Auto-generated method stub
		int i =lowerIndex; 
		int j= higestIndex;

		int pivot=arrayValues[lowerIndex+(higestIndex-lowerIndex)/2];
		if(i <= j) {

			while(arrayValues[i]< pivot) {
				i++;
			}
			while(arrayValues[j]> pivot) {
				j--;
			}
			if(i<=j) {
				exchangeNumbers(i, j);
				//move index to next position on both sides
				i++;
				j--;

			}

		}

		if (lowerIndex < j)
			quicksort(lowerIndex, j);
		if (i < higestIndex)
			quicksort(i, higestIndex);

	}

	private void exchangeNumbers(int i, int j) {
		int temp = arrayValues[i];
		arrayValues[i] = arrayValues[j];
		arrayValues[j] = temp;
	}

}
