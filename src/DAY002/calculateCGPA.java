package DAY002;

import java.util.Scanner;

public class calculateCGPA {
    public static void main(String[] args){
        System.out.println("Enter the first number");
    Scanner a = new Scanner(System.in);
    int num1 = a.nextInt();
        System.out.println("Enter the second number");
    Scanner b = new Scanner(System.in);
    int num2 = b.nextInt();
        System.out.println("Enter the third number");
    Scanner c = new Scanner(System.in);
    int num3 = c.nextInt();
    int sum=num1+num2+num3;
        System.out.println("Sum of three numbers: " + sum);
        int total=300;
        double percentage=sum*100/total;
        System.out.println(percentage);
        double cgpa=percentage/10;
        System.out.println(cgpa);
}
}
