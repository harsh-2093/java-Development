package interfaces;
enum laptop  //define all name constants
{
	macbook(2000),xps(2200),surface(),thinkpad(1800);
	private int price;
	//named constants
	

	private laptop(int price) {
		this.price = price;
	}

	private laptop() {
		price=500; 
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class enumDEmo {
	public static void main(String[] args) {
		int i=5;
//		Status[] s=Status.values();
////		System.out.println(s.ordinal());
//		System.out.println(s[0]);
//		Status s=Status.failed;
		
//		if(s==Status.running)
//		{
//			System.out.println("all good");
//		}
//		else if(s==Status.pending)
//		{
//			System.out.println("wait");
//		}
		
//		switch(s)
//		{
//		case running:
//			System.out.println("all good");
//			break;
//		case successs:
//			System.out.println("done");
//			break;
//		default:
//			System.out.println("heh");
//		}
		
//		laptop lap= laptop.macbook;
//		lap.setPrice(6789);
//		
//		System.out.println(lap.getPrice());
		
		laptop lap[]=laptop.values();
		
		
		for(laptop s:lap)
		{
			s.setPrice(0);
			System.out.println(s+":"+s.getPrice());
		}

		
	}
}
