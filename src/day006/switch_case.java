package day006;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        switch (age){
            case 14:
                System.out.println("You are Child");
                System.out.println("Enjoy");
                break;
            case 30:
                System.out.println("You are adult");
                break;
            case 56:
                System.out.println("You are Senior");
                break;
            case 75:
                System.out.println("You are Senior-Citizen");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
