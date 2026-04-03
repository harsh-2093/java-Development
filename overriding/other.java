package overriding;

 class Launch
{
	 int marks=34;
	public void abc()
	{
		other obj=new other();
		System.out.println(obj.marks);
	}
}

public class other {
//	protected int marks=6;
	protected int marks=45;
	
	public void show()
	{
		System.out.println("hello");
	}
	
//	public static void main(String[] args) {
//		Launch l1=new Launch();
//		l1.abc();
//	}
}
