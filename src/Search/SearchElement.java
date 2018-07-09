package Search;

public class SearchElement {
	
	 void printRepeating(int arr[], int size) 
	    {
	        int count[] = new int[size];
	        int i;
	 
	        System.out.println("Repeated elements are : ");
	        for (i = 0; i < size; i++) 
	        {
	            if (count[arr[i]] == 1)
	                System.out.print(arr[i] + " ");
	            else
	            	System.out.println(count[arr[i]]);
	                count[arr[i]]++;
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	
	    	int arrayh[]=new int[]{0,0,0,0};
	    	
	    	for (int i = 0; i < arrayh.length; i++) {
				arrayh[i]++;
			}
	    	System.out.println("==========1=======");
	    	for (int i = 0; i < arrayh.length; i++) {
				System.out.println(arrayh[i]);
			}
	    	
	    	SearchElement repeat = new SearchElement();
	        int arr[] = {4, 2, 4, 5, 2, 3, 1};
	        int arr_size = arr.length;
	        repeat.printRepeating(arr, arr_size);
	    }

}
