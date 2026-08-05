package DAY002;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        int total=500;
        System.out.println("Total of 5 subject is 500");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Maths number:");
        int maths =a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter English number:");
        int english=b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Hindi number:");
        int hindi=c.nextInt();
        Scanner d = new Scanner(System.in);
        System.out.println("Enter Science number:");
        int science=d.nextInt();
        Scanner e = new Scanner(System.in);
        System.out.println("Enter Social.Studies number:");
        int social_studies=e.nextInt();
        int total_marks=maths+english+hindi+science+social_studies;
        double percentage=(total_marks*100.0)/total;
        System.out.println("Percentage of all five subjects are: " + percentage);
    }
}
