package collections;
import java.util.*;
public class MapsPractise {
  Map<String,Integer> mpp=new HashMap<String,Integer>();

  public void insert(String name,int rollno)
  {
    mpp.put(name,rollno);
  }

  public void show()
  {
    mpp.forEach((name,rollno)->{
      System.out.println("Name:"+name+"Roll no:"+rollno);
    });
  }




  public static void main(String[] args) {
    MapsPractise  classV=new MapsPractise();

 Scanner a1=new Scanner(System.in);
    for(int i=1;i<=5;i++)
    {
      
     
      String name=a1.nextLine();
      classV.insert(name, i);

    }
    classV.show();
  }
}
