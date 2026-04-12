package TryWithResources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DEmo {
	public static void main(String[] args) {
//		int num=0;

		try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)))
		{
			
			int num=Integer.parseInt(bf.readLine());
			
		}
		catch(Exception e)
		{
			System.out.println("wrong!!");
		}
		System.out.println("bye");
	}
}
