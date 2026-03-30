import java.util.Scanner;

public class numbers{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}