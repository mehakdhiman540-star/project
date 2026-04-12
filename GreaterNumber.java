import java.util.Scanner;

public class GreaterNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a first number");
        int a = sc.nextInt();
        System.out.println("enter a second number");
        int b = sc.nextInt();

        if( a > b ){
            System.out.println("a is grater");
        }else{
            System.out.println("b is greater");
        }
    }
}