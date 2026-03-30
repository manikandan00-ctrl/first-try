import java.util.Scanner;

public class ebbill{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int units=sc.nextInt();
    int bill;
     
    if(units<=100)
      bill=units*1;
    else if(units<=200)
      bill=units*2;
      else
      bill=(100*1)+(200*2)+(units-200)*3;
    
    System.out.println("Total Electricity Bill: " +bill );
  }
}