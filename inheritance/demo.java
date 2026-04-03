package inheritance;
class a
{
	public a()
	{
		System.out.println("in a");
	}
	public a(int n)
	{
		System.out.println("in a int");
	}
}
class b extends a
{
	public b()
	{
		System.out.println("in b");
	}
	public b(int n)
	{
		this();
		System.out.println("in b int");
	}
}
public class demo {
	public static void main(String[] args) {
//		Veryadvcalc obj=new Veryadvcalc();
//		int r1=obj.add(4,5);
//		int r2=obj.sub(8, 9);
//		int r3=obj.multi(3, 2);
//		int r4=obj.div(10, 2);
//		double r5=obj.power(2, 3);
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println(r4);
//		System.out.println(r5);
		
		b obj =new b(5);
		
		
	}
}
