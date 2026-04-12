import java.util.Scanner;

class InchesToMeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    

        System.out.print("Enter length in inches: ");
        double inches = sc.nextDouble();

        double meters = inches * 0.0254;   // 1 inch = 0.0254 meters

        System.out.println("Length in meters: " + meters);

        sc.close();
    }
}