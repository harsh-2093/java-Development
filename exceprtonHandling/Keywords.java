package exceprtonHandling;

public class Keywords {
	public static void main(String[] args) {
		int j=20;
		int i=0;
		try
		{
			i=7/j;
			if(i==0)
			{
				throw new Exception();
			}
		}
		catch(ArithmeticException e)
		{
//			System.out.println("not divide by zero");
			i =7/2;
		}
		catch(Exception e)
		{
			System.out.println("error" +e);
		}
		System.out.println("last line "+i);
	}
}

