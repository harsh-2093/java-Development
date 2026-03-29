class Calcu {

   public int add(int n1,int n2)
   {
      return n1+n2;
   }

   public int add(int n1,int n2,int n3)
   {
      return n1+n2+n3;
   }
}

public class demo {

   public static void main(String[] args) {
      Calcu obj =new Calcu();
      System.out.println(obj.add(3, 6,9));

   }

}

// oop
// object-properties and behavoiur

// class
// ->template/blueprint
// ->do not consume space
// ->declared once

// object
// ->a real-world entity/instance
// ->consume space ->heap
// ->can be created many times