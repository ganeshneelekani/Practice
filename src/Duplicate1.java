import java.util.ArrayList;
import java.util.List;

public class Duplicate1 {


	public static void main(String[] args) 
	{
		
		List<Number> listOfNumbers=new ArrayList<>();
		for(int i=1;i<300;i++) {
			listOfNumbers.add(i);
		}
		
		listOfNumbers.add(22);
		listOfNumbers.add(23);
		listOfNumbers.add(24);
		listOfNumbers.add(25);
		Object[] my_array = listOfNumbers.toArray();
		for (int i = 0; i < my_array.length-1; i++)
		{
			for (int j = i+1; j < my_array.length; j++)
			{
				if ((my_array[i] == my_array[j]) )
				{
					System.out.println("Duplicate Element : "+my_array[j] +" "+i);
				}
			}
		}
	}
}
