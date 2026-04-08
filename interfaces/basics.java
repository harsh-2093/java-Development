package interfaces;

//class - class ->extends
//class -interface ->implements
//interface -interface ->extends

interface  A
{
	int age=44;
	String area="mumbai"; //all the variable in the interface are default final and static
	
	void show(); //all the method are by default are public abstract
	void config();
}
interface X
{
	void run();
}
interface Y extends X
{
	
}

class B implements A,Y
{
	public void run()
	{
		System.out.println("run()");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("in show");
		
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("in config");
		
	}
	
}
public class basics {
	public static void main(String[] args) {
		A obj;
		obj=new B();
		obj.show();
		obj.config();
		
		System.out.println(A.area);
//		A.area="hy";//cannot change
	}
}

///need for interface
/// 
