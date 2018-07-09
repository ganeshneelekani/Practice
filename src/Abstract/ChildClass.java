package Abstract;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ChildClass {

	public static void main(String[] args)  {

		System.out.println("======1=====");

		String string="hello";
		String string1="hello world";
		string=string.concat(string1);
		System.out.println(string);
		try {
			ChildClass childClass=new ChildClass();

			ChildClass childClass2=(ChildClass)Class.forName("ChildClass").newInstance();

			ChildClass childClass3=new ChildClass();
			ChildClass childClass4=(ChildClass)childClass3.clone();

			FileInputStream  fileInputStream=new FileInputStream("sdcsd");
			ObjectInputStream inStream = new ObjectInputStream( fileInputStream);
			ChildClass object = (ChildClass) inStream.readObject();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}


}
