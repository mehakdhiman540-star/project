import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        int i,t1 = 0, t2 = 1, nextTerm;
        try( Scanner sc  = new Scanner(System.in)){
        
     System.out.println("print febonnacci series ");

System.out.println("n:");
int n = sc.nextInt();
for (i = 1; i <= n; i++) {
     nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;

    }
    System.out.println("n");
    
}
}
}