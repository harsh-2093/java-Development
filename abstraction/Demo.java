package abstraction;
abstract class A
{
	public abstract void show();
	public abstract void config();
}

public class Demo {
	public static void main(String[] args) {
		A obj =new A() {
			public void show()
			{
				System.out.println("haha i am in the $1 class which is innr class");
			}
			public void config()
			{
				System.out.println("in config");
			}
		};
		obj.show();
		obj.config();
	}
}
