package Threads;

public class Mythread extends Thread {
	@Override
	public void run()
	{
		System.out.println("running state");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Mythread t1=new Mythread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(100);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());


		
		
		}

}
