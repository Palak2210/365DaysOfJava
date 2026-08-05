package DAY002;
import java.util.Scanner;
public class kilometersToMiles {
    public static void main(String[] args){
        System.out.println("Enter the kilometers");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        double miles=a/1.609344;
        System.out.println("miles are" + miles);
    }
}
