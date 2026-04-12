class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    void fuel() {
        System.out.println("Transport fuel is used");
    }
}

// Subclass Bus
class Bus extends Transport {
    @Override
    void move() {
        System.out.println("Bus moves on road");
    }

    @Override
    void fuel() {
        System.out.println("Bus uses electricity as fuel");
    }
}

// Subclass Train
class Train extends Transport {
    @Override
    void move() {
        System.out.println("Train moves on tracks");
    }

    @Override
    void fuel() {
        System.out.println("Train uses electricity as fuel");
    }
}

// Subclass Aeroplane
class Aeroplane extends Transport {
    @Override
    void move() {
        System.out.println("Aeroplane flies in air");
    }

    @Override
    void fuel() {
        System.out.println("Aeroplane uses electricity as fuel");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t;

        t = new Bus();
        t.move();
        t.fuel();

        t = new Train();
        t.move();
        t.fuel();

        t = new Aeroplane();
        t.move();
        t.fuel();
    }
}