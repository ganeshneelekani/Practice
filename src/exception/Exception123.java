package exception;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Exception123 {
	

	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException,JAXBException{
		
	}

}
