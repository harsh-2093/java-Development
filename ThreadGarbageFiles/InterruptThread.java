package ThreadGarbageFiles;

public class InterruptThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadMethod t1=new ThreadMethod("t1");
		ThreadMethod t2=new ThreadMethod("t2");
		t1.start();
		t2.start();
		
		
		
		
		
	}
	
};
/*
 *.interrupt()
 *.yield()
 * .setDaemon
 */