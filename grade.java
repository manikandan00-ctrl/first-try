import java.util.Scanner;

public class grade{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int mark=sc.nextInt();
    
     if (mark>=90)
       System.out.println("Grade A");
     else if (mark>=80)
       System.out.println("grade B");
      else if (mark>=70)
       System.out.println("grade C");
       else if (mark>=60)
       System.out.println("grade d");
       else
         System.out.println("fail");
  }
}