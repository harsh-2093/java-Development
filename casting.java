class a
{
	public void show1()
	{
		System.out.println("in a show");
	}
}
class b extends a
{
	public void show2()
	{
		System.out.println("in b show");
	}
}
public class casting {
	public static void main(String[] args) {
//		a obj=(a)new b();                      //this is called upcasting this is implicit
//		obj.show1();
		a obj=(a)new b();
		b obj2=(b)obj; //down casting
		obj2.show2();
		
	}
}
