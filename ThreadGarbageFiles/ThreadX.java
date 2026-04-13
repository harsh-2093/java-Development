package ThreadGarbageFiles;

public class ThreadX extends Thread {
	
	public void run()
	{
		while(true)
		{
			System.out.println("harsh");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadX t1=new ThreadX();
		t1.setDaemon(true);
		t1.start();
		System.out.println("after"+Thread.currentThread().getName()+"all deamon dies");
	}
}


//Daemon() thread
