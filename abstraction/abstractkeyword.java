//for abstarct class we cannot instantiate the abstarct class
//2.for abstarct method the derived class should/must have abstractg method
package abstraction;

abstract class Car
{
	public abstract void drive();
	
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

class WagonR extends Car   //concrete class means we can make a object of concrete class
{
	public void drive()
	{ 
		System.out.println("Driving...");
	}
}
public class abstractkeyword {
	public static void main(String[] args) {
		Car obj =new WagonR();
		obj.drive();
		obj.playMusic();
		
	}
}
