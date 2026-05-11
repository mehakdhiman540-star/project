abstract class ATM {

    abstract void withdraw();

    void checkBalance() {
        System.out.println("Balance Checked");
    }
}

class SBI extends ATM {

    void withdraw() {
        System.out.println("Money Withdrawn from SBI ATM");
    }
}

public class ATMExample {

    public static void main(String[] args) {

        SBI s = new SBI();

        s.withdraw();
        s.checkBalance();
    }
}