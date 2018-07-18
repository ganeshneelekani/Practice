package Thread;

public class MyThread implements Runnable{

	@Override
	public void run() {
		hello();
	}


	public synchronized void hello(){
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
	}

}
