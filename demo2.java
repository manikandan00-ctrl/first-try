import java.util.Scanner;

public class demo2 {
    public static void main(String[]args){
      student s1=new student(102,"efg",20,76,79,98);
      s1.disp();
      s1.calc();
    }
  }
class student{

  int sno;
  String name;
  int age;
  int m1;
  int m2;
  int m3;
  student(int a,String b,int c,int d,int e,int f){
    sno=a;
    name=b;
    age=c;
    m1=d;
    m2=e;
    m3=f;
  }
  public void disp(){
    System.out.println("register no:"+sno);
    System.out.println("student name:"+name);
    System.out.println("stud age:"+age);
    System.out.println("m1:"+m1);
    System.out.println("m2:"+m2);
    System.out.println("m3:"+m3);}
  public void calc(){
    int cal;
    cal=m1+m2+m3;
    int avg;
    avg=cal/3;
      System.out.println("total:"+cal);
      System.out.println("average:"+avg);
  }
}


    
  