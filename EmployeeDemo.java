abstract class Employee {

    abstract void salary();
}

class Manager extends Employee {

    void salary() {
        System.out.println("Manager Salary = 50000");
    }
}

class Developer extends Employee {

    void salary() {
        System.out.println("Developer Salary = 40000");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Manager m = new Manager();
        Developer d = new Developer();

        m.salary();
        d.salary();
    }
}