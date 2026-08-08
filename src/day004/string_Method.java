package day004;
import java.util.Scanner;
public class string_Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String name = sc.nextLine();
        int value=name.length();
        System.out.println(value);
        String b = name.toLowerCase();
        System.out.println(b);
        String c = name.toUpperCase();
        System.out.println(c);
        String d = name.trim();
        System.out.println(d);
        String e = name.substring(5);
        System.out.println(e);
        String f = name.substring(6,9);
        System.out.println(f);
        String g = name.replace('b','f');
        System.out.println(g);
    }
}
