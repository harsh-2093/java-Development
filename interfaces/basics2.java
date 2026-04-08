package interfaces;

interface Computer
{
	 void code();
}                     

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code ,compile run");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code ,compile run,faster");
	}
}
class Developer
{
	public void devapp(Computer lap)
	{
		lap.code();    
	}
}

public class basics2 {
	public static void main(String[] args) {
		Computer lap=new Laptop();
		Computer des=new Desktop();
		Developer harsh =new Developer();
		harsh.devapp(lap); //loosely coupled
	}
}
