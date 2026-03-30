class Student{
  int rollno;
  String name;
  int marks;


}








public class array {
  public static void main(String[] args) {
    //  int num[]={1,2,3};
    // //  int num[]=new int [4]; //default val ue=0

    // // for(int i=0;i<num.length;i++)
    // // {
    // //   System.out.println(num[i]);
    // // }

    // // 2-d array

    // int num[][]={
    //   {1,2,3},
    //   {4,5,6},
    // };

    // int num2[][]=new int [2][3];

    // int num3[][]=new int [2][]; //jagged arrray
    // num3[0]=new int[4];
    // num3[1]=new int[7];




    //normal loop
    // for(int i=0;i<num3.length;i++)
    // {
    //   for(int j=0;j<num3[i].length;j++)
    //   {
    //     num3[i][j]=(int)(Math.random()*10);
    //   }
    // }

    // //enhanced loop
    // for(int n[]:num3)
    // {
    //   for(int m:n)
    //   {
    //     System.out.print(m+" ");
        
    //   }
    //   System.out.println();
    // }
    Student s1=new Student();
    s1.name="harsh";
    s1.rollno=34;
    s1.marks=98;

    Student s2=new Student();
    s2.name="pritam";
    s2.rollno=34;
    s2.marks=98;

    Student s3=new Student();
    s3.name="srijan";
    s3.rollno=34;
    s3.marks=98;


    //array
    //int arr[]=new int[4];


    //student srray initializration
    Student students[]=new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;


    for(Student d:students)
    {
      System.out.println(d.name);
    }

    








  }
}
