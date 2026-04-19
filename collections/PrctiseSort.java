package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrctiseSort {
  public static void main(String[] args) {
    List <String> l1=new ArrayList<>();
    Comparator<String> com=new Comparator <String>()
    {
      public int compare(String i,String j)
      {
        if(i.length()>j.length())
        {
          return 1;
        }
        else{
          return -1;
        }
      }
    };

    l1.add("harsh");
    l1.add("harshq");
    l1.add("harsjqw");
    l1.add("h");
    l1.add("he");

    Collections.sort(l1,com);

    for(String e:l1)
    {
      System.out.println(e);
    }
  }
}
