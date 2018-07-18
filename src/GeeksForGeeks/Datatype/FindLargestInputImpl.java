package GeeksForGeeks.Datatype;

import java.util.Arrays;

public class FindLargestInputImpl {

	int length;
	int[] arrayElementTemp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//code
		int[] arrayElement =new int[] {23, 56, 22 , 61 , 2};

		FindLargestInputImpl findLargestInputImpl=new FindLargestInputImpl();
		findLargestInputImpl.sort(arrayElement);

		for (int i = 0; i < arrayElement.length; i++) {
			int j = arrayElement[i];
			System.out.println(j);
		}

	}

	private void sort(int[] arrayElement) {
		// TODO Auto-generated method stub

		length=arrayElement.length;
		arrayElementTemp=arrayElement;
		quickSort(0,length-1);

	}

	private void quickSort(int i, int j) {
		// TODO Auto-generated method stub

		int firstIndex=i;
		int lastIndex=j;
		//	int pivot= arrayElementTemp[firstIndex + (lastIndex- firstIndex)/2];
		int pivot = arrayElementTemp[firstIndex+(lastIndex-firstIndex)/2];
		System.out.println(" PIVOT "+pivot);
		while(i<=j) {

			while (arrayElementTemp[i] < pivot) {
				i++;
			}


			while (arrayElementTemp[j] > pivot) {
				j--;

			}

			if(i<=j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		System.out.println(i);
		System.out.println(j);

		//		if (firstIndex < j)
		//			quickSort(firstIndex, j);
				if (i < lastIndex)
					quickSort(i, lastIndex);
	}



	private void exchangeNumbers(int i, int j) {
		int temp = arrayElementTemp[i];
		arrayElementTemp[i] = arrayElementTemp[j];
		arrayElementTemp[j] = temp;
	}

}
