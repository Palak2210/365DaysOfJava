package day004;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str= sc.nextLine(); //print whole sentence
        System.out.println(str);
        System.out.println("Enter another sentence: ");
        String str1=sc.next(); //print one word
        System.out.println(str1);
    }
}
