package Thread.deadlock;

class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Keep some task here....");
	}
}

public class ThreadsInJava
{
	public static void main(String[] args)
	{
		MyThread myThread=new MyThread();
		MyThread myThread2=new MyThread();
		Thread thread1=new Thread(myThread);
		Thread thread2=new Thread(myThread2);
		thread1.start();
		thread2.start();
	}
}
