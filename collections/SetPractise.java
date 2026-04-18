package collections;
import java.util.*;
public class SetPractise {
  Set <StringBuffer> s1= new TreeSet<StringBuffer>();

  public void insert(StringBuffer name)
  {
    s1.add(name);
  }
  public void show()
  {
    for(StringBuffer e:s1)
    {
      System.out.println(e);
    }
  }
}
