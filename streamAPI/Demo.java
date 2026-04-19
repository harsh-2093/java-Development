package streamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
  public static void main(String[] args) {
    List<Integer> nums= Arrays.asList(8,5,7,3,2,6);

    // Stream<Integer> s1= nums.stream();
    
    // Stream<Integer> s2=s1.filter(n->n%2==0);

    // Stream<Integer>s3=s2.map(n -> n*2);
    // int result=s3.reduce(0,(c,e)->c+e);




    //the same thing of above
    Stream <Integer> sorted=nums.stream()
        .filter(n->n%2==0)
        .sorted();
        

    sorted.forEach((n)->{
      System.out.println(n);
    });

  }
}
