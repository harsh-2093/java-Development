package exceprtonHandling;
//ducking the exception because here we are really ducking it
class e 
{
	public void mul() throws Exception
	{
		c obj1 =new c();
		obj1.divide();
	}
}

class c
{
	public void divide() throws Exception
	{
		d obj2=new d();
		b obj1= new b();
		obj1.sub();
		obj2.add();
	}
}

class b
{
	public void sub() throws Exception
	{
		int j=5;
		if(j==5)
		{
			 throw new ArithmeticException("Error in object b ");
		}
	}
}


class d
{
	public void add() throws Exception
	{
		int i=0+0;
		if(i==0)
		{
			 throw new ArithmeticException("Error in object d ");
		}
	}
}
public class Throws {
	public static void main(String[] args) {
		e obj=new e();
		try
		{
			obj.mul();
		}
		catch(Exception e)
		{
			System.out.println("problem in "+e);
		}
		try {
				Class.forName("Throws");
		}
		catch(Exception e)
		{
			System.out.println("class not found exception "+e);
		}
		
	}
	
}