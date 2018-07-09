import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {


	public static void main(String[] args) {

		List<Number> listOfNumbers=new ArrayList<>();

		for(int i=1;i<30;i++) {
			listOfNumbers.add(i);
		}

		
		listOfNumbers.add(22);
		findDuplicateNumber(listOfNumbers);


	}

	private static void findDuplicateNumber(List<Number> listOfNumbers) {

		int highestNumber = listOfNumbers.size() - 1;
		System.out.println(highestNumber);
		int total=findSum(listOfNumbers);
        System.out.println(total);
        int duplicatNumber=total - (highestNumber*(highestNumber+1)/2);
        System.out.println(duplicatNumber);
        
	}

	private static int findSum(List<Number> listOfNumbers) {


		
		
		int sum=0;
		for(int i=0;i<listOfNumbers.size();i++) {
			
			 
			 sum=sum+(int)(listOfNumbers.get(i));
		}
		// TODO Auto-generated method stub
		return sum;
	}

}
