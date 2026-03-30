import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat("LUCKY");
        System.out.println("Length: " + s1.length());
        System.out.println("Lowercase: " + s1.toLowerCase());
        StringBuffer sb = new StringBuffer("HOW ARE YOU");
        sb.append("WELCOME TO JAVA");
        System.out.println("Append: " + sb);
        sb.delete(5, 6);
        System.out.println("Delete: " + sb);
    }
}