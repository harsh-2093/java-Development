package Synchronization;

public class Test {
	public static void main(String[] args) {
		Counter cnt=new Counter();
		MyThread t1=new MyThread(cnt);
		MyThread t2=new MyThread(cnt);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
			
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println(cnt.getCount());
		
		
	}
}
 