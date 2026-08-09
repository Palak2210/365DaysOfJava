package day005;

public class logical_Operator {
    public static void main(String[] args){
        boolean a=true;
        boolean b=false;
        if(a && b){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        if(a||b){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(!a);
        System.out.println(!b);
    }
}
