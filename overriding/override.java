package overriding;
class a
{
	public void show()
	{
		System.out.println("in A show");
	}
	public void config()
	{
		System.out.println("in a config");
	}
}
class b extends a
{
	@Override
	public void show()
	{
		System.out.println("in B show");
	}
}

public class override {
	public static void main(String[] args) {
		b obj =new b();
		obj.show();
		obj.config();
	}
}
