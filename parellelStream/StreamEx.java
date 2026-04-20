package parellelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// import java.util.stream.Stream;

public class StreamEx {
  public static void main(String[] args) {
    List<Integer> nums =new ArrayList<>(10000);

    Random ran =new Random();

    for(int i=1;i<=10000;i++)
    {
      nums.add(ran.nextInt(100));
    }
    
    // int sum1=nums.stream()
    //             .map(i->i*2)
    //             .reduce(0,(c,e)->c+e);

    long startseq=System.currentTimeMillis();
    int sum2=nums.stream()
                  .map(i->{

                    try
                    {
                      Thread.sleep(1);
                    }
                    catch(Exception e)
                    {

                    }

                    return i*2;
                  })
                  .mapToInt(i->i)
                  .sum();
    long endseq=System.currentTimeMillis();
    long startseq2=System.currentTimeMillis();
    int sum3=nums.parallelStream()
                  .map(i->{

                    try
                    {
                      Thread.sleep(1);
                    }
                    catch(Exception e)
                    {

                    }

                    return i*2;
                  })
                  .mapToInt(i->i)
                  .sum();
     long endseq2=System.currentTimeMillis();
    System.out.println(sum2+" "+sum3);

    System.out.println("seq1: "+(endseq-startseq));
    System.out.println("seq2: "+(endseq2-startseq2));
  }
}
