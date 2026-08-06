package day003;

import java.util.Scanner;

public class equation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter v: ");
        int v = sc.nextInt();

        System.out.print("Enter u: ");
        int u = sc.nextInt();

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter s: ");
        int s = sc.nextInt();

        double result = (double) (v * v - u * u) / (2 * a * s);

        System.out.println("Result = " + result);

    }
}
