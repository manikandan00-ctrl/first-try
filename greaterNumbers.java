import java.util.Scanner;

public class greaterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a>b) {
            System.out.println("the number is greater");
        }
        else {
            System.out.println("the number is lesser");
        }
    }
}
