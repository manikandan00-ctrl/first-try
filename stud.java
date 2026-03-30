import java.util.Scanner;
class stud1{
  int rollno;
  String name;
  String dept;
  stud1(int a,String b,String c){
    rollno=a;
    name=b;
    dept=c;
  }
  void studinfo(){
    System.out.println("Student name: "+name);
    System.out.println("Roll no: "+rollno);
    System.out.println("Department: "+dept);
  }
}
class marks extends stud1{
  int mark1;
  int mark2;
  int mark3;
  marks(int a,String b,String c,int a1,int a2,int a3){
    super(a,b,c);
    mark1=a1;
    mark2=a2;
    mark3=a3;
  }
  void calc(){
    int total=mark1+mark2+mark3;
    float avg=total/3;
    System.out.println("Mark1: "+mark1);
    System.out.println("Mark2: "+mark2);
    System.out.println("Mark3: "+mark3);
    System.out.println("Total: "+total);
    System.out.println("Average: "+avg);
    if (mark1>40 & mark2>40 & mark3>40){
      System.out.println("Result: PASS");
    }
    else{
      System.out.println("Result: FAIL");
    }
  }
}
public class stud{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rollno");
    int s1=sc.nextInt();
    System.out.println("Enter name");
    String s2=sc.next();
    System.out.println("Enter dept");
    String s3=sc.next();
    System.out.println("Enter mark1");
    int s4=sc.nextInt();
    System.out.println("Enter mark2");
    int s5=sc.nextInt();
    System.out.println("Enter mark3");
    int s6=sc.nextInt();
    marks m=new marks(s1,s2,s3,s4,s5,s6);
    m.studinfo();
    m.calc();
  }
}