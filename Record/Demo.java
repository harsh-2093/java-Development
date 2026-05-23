package Record;

//Record classes are the data carrier classes

record Alien(int id ,String name){
  public Alien(int id ,String name)
  {
    this.id = 0;
    if(id==0)
    {
      throw new IllegalArgumentException("id not be zero");
    }
  }
}

public class Demo {
  public static void main(String[] args) {
    Alien a1=new Alien(1,"harsh");
    Alien a2=new Alien(1,"harsh");
                  

    System.out.println(a1);
  }
}
