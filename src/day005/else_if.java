package day005;
import java.util.Scanner;
public class else_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Child");
        }
        else if (age<=30) {
            System.out.println("Adult");
        }
        else if (age<=65) {
            System.out.println("Senior");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}
