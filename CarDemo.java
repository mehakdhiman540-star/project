class Car {
    String color = "Red";

    void drive() {
        System.out.println("Car is driving");
    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.color);
        c1.drive();
    }
}