package LVTI;
//local variable type inference

import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {
    int a=9;
    var b=10;

    int c;
    // but
    // --> issue var d;
    int[] nums=new int[10];
    var num=new int[10];

    // var obj =new Alien();
  }
}
