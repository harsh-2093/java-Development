package Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount extends Thread {
	private int balance =100;
	
	private final Lock lock =new ReentrantLock();
	
	public  void withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName()+"attempting to withdraw"+amount);
		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
			{
				if(balance>=amount)
				{
					try
					{
						System.out.println(Thread.currentThread().getName()+"procedding");
						Thread.sleep(3000);
						balance-=amount;
						System.out.println(Thread.currentThread().getName()+"successful"+balance);
					}
					catch(Exception e)
					{
						Thread.currentThread().interrupt();
					}
					finally
					{
						lock.unlock();
					}
					
				}
				else
				{
					System.out.println("insufficient balance");
				}
			}else
			{
				System.out.println(Thread.currentThread().getName()+"could not acquire lock try again");
			}
		}
		catch(Exception e)
		{
			Thread.currentThread().interrupt();
		}

	}
	
}
