package ThreadGarbageFiles;

public class ThreadMethod extends Thread {
	public ThreadMethod(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
//		for(int i=0;i<=5;i++)
//		{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//		for(int i=0;i<=5;i++) {
//			System.out.println(Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
			
//			try
//			{
//				Thread.sleep(1000);
//				System.out.println(Thread.currentThread().getName()+"it is sleeing");
//			}
//			catch(Exception e)
//			{
//				System.out.println(Thread.currentThread().getName()+"is interrupted"+e);
//			}
		for(int i=0;i<=5;i++) 
		{
			System.out.println(Thread.currentThread().getName()+"runing");
			Thread.yield();
		}
//		}
	}
	public static void main(String[] args) throws InterruptedException {
//		ThreadMethod t1=new ThreadMethod();
//		t1.start();
//		System.out.println("i have executed before t1 thread");
//		t1.join();
//		System.out.println("i will be executed after t1 thread arrives");
		ThreadMethod l=new ThreadMethod("low");
		ThreadMethod m=new ThreadMethod("high");
		l.setPriority(MIN_PRIORITY);
		m.setPriority(MAX_PRIORITY);
		l.start();
		m.start();
		
	}
}
/*
 * Thread methods;
 * 1).start()
 * 2).sleep()
 * 2).join()
 * 3)Thread.CurrentThrrad()
 * 3)Thread.CurrentThread().GetPriority()
 * 4)Thread.CurrentThrrad().SetPriortiy()
 * */


