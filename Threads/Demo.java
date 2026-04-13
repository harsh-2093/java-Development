package Threads;

class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Demo {
	public static void main(String[] args) {
		A obj=new A();
		B obj2=new B();
//		System.out.println(obj.getPriority());
//		System.out.println(obj2.getPriority());
//		obj2.setPriority(Thread.MAX_PRIORITY);
		
		obj.start();
		obj2.start();
	}
}
