package DAY002;
import java.util.Scanner;
public class greet {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println("Hello "+a+" ,have a good day");
    }
}
