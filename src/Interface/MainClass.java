package Interface;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass implements Hello{
	
	public static void main(String[] args) {
		
		HashMap hashMap=new HashMap<>();
		hashMap.put(1, 1);

	}
	
	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		Hello.super.hello1();
	}
}
