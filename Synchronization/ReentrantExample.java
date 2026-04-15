package Synchronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantExample {
	private final Lock lock =new ReentrantLock();
	
	
	public void outerMethod()
	{
		lock.lock();
		
		try
		{
			System.out.println("outer Method");
			innerMethod();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public void innerMethod()
	{
		lock.lock();
		
		try
		{
			System.out.println("innerMethod");
			outerMethod();
			
		}
		finally
		{
			lock.unlock();
		}
	}
	 
	
	public static void main(String[] args) {
		ReentrantExample exp1 =new ReentrantExample();
		
		Runnable run=new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						exp1.outerMethod();
						
					}
			
				};
		Thread t1=new Thread(run,"thread 1");
		Thread t2=new Thread(run,"thread 2");
		t1.start();
	}
	
}
