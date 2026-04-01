package encapsulation;

class Human
{
	private int age;
	private String name;
	
	public int getage()
	{
		return age;
	}
	
	public String getname()
	{
		return name;
	}
	
	
	public void setage(int age,String name)
	{
		this.age=age;
		this.name=name;
		return;
	}
	
}

public class basic {
	public static void main(String[] args) {
		Human obj =new Human();
		obj.setage(34,"navin");		
		System.out.println(obj.getage());
		System.out.println(obj.getname());
	}
}
