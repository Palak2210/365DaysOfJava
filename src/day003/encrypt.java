package day003;
import java.util.Scanner;
public class encrypt {
    public static void main(String[] args){
        System.out.println("Enter the Character");
        Scanner sc = new Scanner(System.in);
        char grade= sc.next().charAt(0);
        char encrypted = (char)(grade+8);
        char decrypted=(char)(encrypted-8);
        System.out.println(grade);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}
