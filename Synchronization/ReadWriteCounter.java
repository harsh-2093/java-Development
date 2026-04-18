package Synchronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
// import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class ReadWriteCounter {
  private int count=0;

  private final ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

  private final Lock readLock=lock.readLock();


  private final Lock writeLock=lock.writeLock();




  public int getCount()
  {
    readLock.lock();
    try
    {
      return count;
    }
    finally{
      readLock.unlock();
    }
  }
  public void increment() {
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }
    }


    public static void main(String[] args) 
    {
      ReadWriteCounter counter =new ReadWriteCounter();

      Runnable readtask =()->
          {
            for(int i=0;i<10;i++)
            {
              System.out.println(Thread.currentThread().getName()+"read: "+counter.getCount());
              try {
                Thread.sleep(100);
              } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          };
       Runnable writetask =()->
          {
            for(int i=0;i<10;i++)
            {
              counter.increment();
              System.out.println(Thread.currentThread().getName()+"incremented");
            }
         
          };
        Thread t1 =new Thread(readtask,"thread 1");
        Thread t2 =new Thread(writetask,"thread 2");
        Thread t3 =new Thread(readtask,"thread 3");

        t1.start();
        t2.start();
        t3.start();
          



    }
}
