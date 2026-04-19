package collections;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>
{
  int age;
  String name;
  


  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }



  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  public int compareTo(Student that){
    if(this.age>that.age)
    {
    return 1;
    }
    else{
      return -1;
    }
  }

  
}


public class PrctiseSort {
  public static void main(String[] args) {
    List <Student> l1=new ArrayList<>();
    // Comparator<Student> com=new Comparator <Student>()
    // {
    //   public int compare(Student i,Student j)
    //   {
    //     if(i.age>j.age)
    //     {
    //       return 1;
    //     }
    //     else{
    //       return -1;
    //     }
    //   }
    // };

    l1.add(new Student(23, "harsh"));
    l1.add(new Student(23, "kaniskha"));
    l1.add(new Student(19,"isha"));
    l1.add(new Student(32, "ishika"));
    l1.add(new Student(34,"gauri"));
    Collections.sort(l1);

    for(Student e:l1)
    {
      System.out.println(e.toString());
    }
  }
}
