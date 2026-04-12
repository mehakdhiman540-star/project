import java.util.Scanner;

public class Calculatorusingif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter first number");
        double a = sc.nextDouble();

        System.out.println("enter the operator( +, - , * , /)");
        char op = sc.next().charAt(0);

        System.out.println("enter second number");
        double b = sc.nextDouble();

        if (op == '+'){
            System.out.println("Result = " +( a + b));
        } else if ( op == '-'){
            System.out.println(" Result = " +( a - b ));
        } else if ( op =='*'){
            System.out.println("Result = " +(a * b));
        } else if (op == '/'){
            System.out.println("Result =" + (a / b));
        }else{
            System.out.println("invalid input");
        }
    }
}