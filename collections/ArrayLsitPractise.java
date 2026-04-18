package collections;

import collections.*;
import java.util.*;
import java.util.Collections;

public class ArrayLsitPractise {
  List<String> a1=new ArrayList<String>();

  public void insert(String name)
  {
    a1.add(name);
  }

  public void show()
  {
    Collections.sort(a1);
    a1.forEach((name)->
  {
    System.out.println(name);
  });
  }

  public static void main(String[] args) {
      ArrayLsitPractise classV=new  ArrayLsitPractise ();
    StringBuffer name=new StringBuffer("harsh");
    String naam="harsh";
    for(int i=0;i<5;i++)
    {
      classV.insert(naam+(5-i));

    }

    classV.show();
  }



}
