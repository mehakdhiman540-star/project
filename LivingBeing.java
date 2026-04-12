class LivingBeing {
    void breath() {
        System.out.println("All living beings can breathe.");
    }
}

class Animal extends LivingBeing {
    void eat() {
        System.out.println("Animals eat food.");
    }

class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly.");
    }
}
}

class Parrot extends birds {
    void speak() {
        System.out.println("Parrot can speak.");
    }
}


public class LivingBeingmain {
    public static void main(String[] args) {
        Parrot p = new Parrot();   // object of Parrot

        p.breath();
        p.eat();
        p.fly();
        p.speak();
    }
}


