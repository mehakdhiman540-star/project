public class PowerRecursion {

    int power(int base, int exp) {

        if(exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {

        PowerRecursion p = new PowerRecursion();

        System.out.println("Power = " + p.power(2, 3));
    }
}