public class SumRecursion {

    int sum(int n) {

        if(n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        SumRecursion s = new SumRecursion();

        System.out.println("Sum = " + s.sum(5));
    }
}