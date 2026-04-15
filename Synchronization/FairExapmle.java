package Synchronization;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairExapmle {
	private final  Lock lock=new ReentrantLock(true);
	
	public void accessResource()
	{
		lock.lock();
		try
		{
			System.out.println(Thread.currentThread().getName()+"acquired the lock");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"release the lock");
			lock.unlock();
		}
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		FairExapmle example =new FairExapmle();
		Runnable task =()->
		{
			example.accessResource();
		};
		
		Thread t1=new Thread(task,"thread 1");
		Thread t2=new Thread(task,"thread 2");
		Thread t3=new Thread(task,"thread 3");
		t1.start();
		Thread.sleep(50);
		t2.start();
		Thread.sleep(50);
		t3.start();
	}
	
}
/*This is the example of unfair lock the order to give the resource the lock in not in order is uncertain*/

//package Synchronization;
//
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class FairExapmle {
//	private final  Lock lock=new ReentrantLock();
//	
//	public void accessResource()
//	{
//		lock.lock();
//		try
//		{
//			System.out.println(Thread.currentThread().getName()+"acquired the lock");
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e)
//		{
//			Thread.currentThread().interrupt();
//		}
//		finally
//		{
//			System.out.println(Thread.currentThread().getName()+"release the lock");
//			lock.unlock();
//		}
//	}
//	
//	
//	
//	
//	
//	public static void main(String[] args) {
//		FairExapmle example =new FairExapmle();
//		Runnable task =()->
//		{
//			example.accessResource();
//		};
//		
//		Thread t1=new Thread(task,"thread 1");
//		Thread t2=new Thread(task,"thread 2");
//		Thread t3=new Thread(task,"thread 3");
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//	
//}
