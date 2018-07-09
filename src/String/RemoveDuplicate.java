package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String duplicateString="hellohello";
		char charArray[]=duplicateString.toCharArray();
		StringBuffer buffer=new StringBuffer();
		int[] nonrepeatedArray=new int[256];

		for (int i = 0; i < charArray.length; i++) {

			if(nonrepeatedArray[charArray[i]] ==1 ) {
				System.out.println("Repeated characters "+charArray[i]);
				buffer.append(charArray[i]);
				nonrepeatedArray[charArray[i]]++;
			}
			else {
				nonrepeatedArray[charArray[i]]++;
			}
		}
		System.out.println("Not duplicated character "+buffer.toString());
	}
}
