abstract class Bank {

    abstract int getRateOfInterest();
}

class SBI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {

    int getRateOfInterest() {
        return 8;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Interest: " + s.getRateOfInterest());
        System.out.println("HDFC Interest: " + h.getRateOfInterest());
    }
}