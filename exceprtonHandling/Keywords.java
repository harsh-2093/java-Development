package exceprtonHandling;
//throw keyword is used to throw the exception 
// actch block catches the exception
class HarshException extends Exception
{
	public HarshException(String a)
	{
		super(a);
	}
}
public class Keywords {
	public static void main(String[] args) {
		int j=20;
		int i=0;
		try
		{
			i=7/j;
			if(i==0)
			{
				throw new HarshException("i will notprint zero");
			}
		}
		catch(HarshException e)
		{
			System.out.println("hahahah  " +e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("not divide by zero"+e);
			i =7/2;
			
		}
		catch(Exception e)
		{
			System.out.println("error hogi veere");
		}
		System.out.println("last line "+i);
	}
}

