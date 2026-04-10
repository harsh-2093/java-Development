package interfaces.com;

//@FunctionalInterface
interface a
{
	int  add(int a,int b);
}

public class FunctionalInterface { 
	public static void main(String[] args) {
		a obj=(a,b)-> a+b;
		
		System.out.println(obj.add(1,2));
	}
}
