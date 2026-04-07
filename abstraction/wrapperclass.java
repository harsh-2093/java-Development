package abstraction;

public class wrapperclass {
	//wrapper classes
	//int->Integer
	//char->Character
	//double->Double
	
	//because we cannot use primitive dta type in collection we can use only object so for that there we can us e wrapper classes
	public static void main(String[] args) {
		int num7=9;
//		Integer num1=new Integer(8);//not good way
		
		Integer num1=num7;//auto boxing
		//boxing :when we store a primitive data type into prmitive object or a wrpper object
		Integer num3=num1; //auto unboxing
		
		
		System.out.println(num3);
		String str="11";
		int num4=Integer.parseInt(str); //parse str into int
		System.out.println(num4);
	}
}
