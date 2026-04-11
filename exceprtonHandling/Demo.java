package exceprtonHandling;

public class Demo {
	public static void main(String[] args) {
//		int i=9;//normal statement
//		int j=0;
//		String s=null;
		
		int nums[]=new int[5];
		try
		{
//			j=s.length();
//			j=8/j; //critical statement
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("something went wrong.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("saty in limit.");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong"+e);
		}
		
		System.out.println("hi");
	}
}
