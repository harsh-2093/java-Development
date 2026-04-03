package modifiers;

import overriding.other;
class A extends other
{
	public void show()
	{
		System.out.println(marks);
	}
}
public class demo {
	public static void main(String[] args) {
		other obj=new other();
		b obj2=new b();
		
//		int mark=obj.marks;
//		int marks2=obj2.marks2;
//		obj.show(); 
//		Launch l1=new Launch();
//		A a1=new A();
//		a1.marks;
		A a1 =new A();
		a1.show();
	}
}


//Default access modifier can be accessed in s same packages