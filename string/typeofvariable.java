package string;
class Mobile
{
	String brand;
	int price;
//	String network;
	static String name;
	static
	{
		name="phone";
		System.out.println("i am static i  have called");
	}
	public Mobile()
	{
		brand="";
		price=200;
		System.out.println("i am construtor i have called");
//		name="phone";
	}
	
	public void show()
	{
		System.out.println(brand+" : "+price+" : "+name);
	}
	
//	public static void show1(Mobile obj)
//	{
//		System.out.println("static method");
//		System.out.println(obj.brand+" : "+obj.price+" : "+name);
//	}
}
public class typeofvariable {
	public static void main(String[] args) {
		Mobile obj1 =new Mobile();
		obj1.brand="apple";
		obj1.price=1500;
//		Mobile.name= "smart phone";
		Mobile obj2 =new Mobile();
		obj2.brand="samsung";
		obj2.price=1500;
//		Mobile.name= "phone";
//		obj1.show();  i
//		obj2.show();
//		Mobile.show1(obj1);
		
		
		//at the time of obj creation the class first load then it instatied the instance variable
		
		
		
		
	}
}
