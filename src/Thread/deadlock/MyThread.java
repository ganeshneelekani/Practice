package Thread.deadlock;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		hello(this);
	}


	public synchronized void hello(MyThread myThread){
		// TODO Auto-generated method stub
		System.out.println("===========1========");
		hello2(this);
	}
	
	public synchronized void hello2(MyThread myThread){
		// TODO Auto-generated method stub
		System.out.println("===========2========");
		hello(this);
	}

}
