public class FibonacciRecursion {

    int fibonacci(int n) {

        if(n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        FibonacciRecursion f = new FibonacciRecursion();

        for(int i = 0; i < 7; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
    }
}