package Matrix;

public class MatrixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arra[][] = new int[][]{
			{-1,-2,-3,-4},
			{-4,-5,-6},
			{7,8,9}
		};

		System.out.println(arra.length);
		for(int i=arra.length-1; i >= 0; i--) {
			
			for(int j=arra[i].length-1; j >= 0 && arra[i][j] > 0 ; j--) {
				
				System.out.println("Values at arr["+i+"]["+j+"] is "+arra[i][j]);
			}
		}


	}

}
