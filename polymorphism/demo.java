package polymorphism;
 class calc
{
	final public void show()
	{
		System.out.println("y harsh");
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class advcalc extends calc
{
//	public void show() //
//	{
//		System.out.println("joohn");
//	}
}
class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

public class demo {
	public static void main(String[] args) {
//		//dynamic method dispatch
////		A obj =new A();
////		obj.show();
////		
////		obj=new B();
////		obj.show();
////		
////		obj=new C();
////		obj.show();
//		
//		//final keyword -vari,mehtod ,class
//		//adv :avoid mutability of vaiable and inheritnace and overiding
////		final int num=8;
//		//num=9: we could'nt change the variable
		advcalc obj =new advcalc();
		obj.show();
		obj.add(3, 8);
		
		
		

	}
}
