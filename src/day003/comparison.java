package day003;
import java.util.Scanner;
public class comparison {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int user_input = sc.nextInt();
        int given_number=33;
        boolean result=user_input<(given_number);
        System.out.println(result);
    }
}
