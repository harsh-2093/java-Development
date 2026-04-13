package ThreadGarbageFiles;

public class Basics {
	public static void main(String[] args) {
		World world =new World();
		Thread t1=new Thread(world);
		t1.start();
		for(int i=0;i<10000;i++)
		{
		System.out.println("hello");
		}
	}
}
