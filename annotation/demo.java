package annotation;

//@Deprecated //soon to be remove
class a
{
	public void show()
	{
		System.out.println("i am in a show");
	}
}
class b extends a
{
	@Override
	public void show()
	{
		System.out.println("i am overriden");
	}
}

public class demo {

}
