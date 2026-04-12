import java.util.Scanner;

class PrintDataType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a boolean (true/false): ");
        boolean isTrue = sc.nextBoolean();

        System.out.print("Enter a float value: ");
        float decimalNumber = sc.nextFloat();

        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);  // takes first character

        System.out.println("\n--- Output ---");
        System.out.println("Integer value: " + number);
        System.out.println("Boolean value: " + isTrue);
        System.out.println("Float value: " + decimalNumber);
        System.out.println("Character value: " + letter);

        sc.close();
    }
}