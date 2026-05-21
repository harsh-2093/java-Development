package sealedClass;

sealed class A permits B,C {
  
}
non-sealed class B extends A{

}
final class C extends A{

}
final class D extends B{

}
sealed interface x permits y{

}
non-sealed interface y extends x{

}
public class Demo {
  public static void main(String[] args) {
    
  }
}
