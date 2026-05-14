class Employee {

    int id;
    String name;

    Employee(int i, String n) {

        id = i;
        name = n;
    }

    void display() {

        System.out.println(id + " " + name);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul");

        e1.display();
    }
}