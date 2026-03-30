import java.util.Scanner;
public class Allexcept{
  public static void main(String args[]){
    try{
      Scanner sc=new Scanner (System.in);
      System.out.println("enter array");
      int arr[]=new int[5];
      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(+arr[6]);
      System.out.println("enter a:");
      int a=sc.nextInt();
      System.out.println("enter b:");
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("the division is "+c);
      System.out.println("enter a number:");
      String a1=sc.next();
      int a2=Integer.parseInt(a1);}
    catch(ArithmeticException e){
      System.out.println("arithmetic exception occur");}
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("array index exception occured");}
    catch(NumberFormatException e){
      System.out.println("number format exception occur");}
  }
}

      
      