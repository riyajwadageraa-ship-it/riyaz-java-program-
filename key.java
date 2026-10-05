abstract class Animal {
    // Abstraction
    abstract void sound();
}

// Inheritance
class Dog extends Animal {

    // Encapsulation
    private String name = "Tommy";

    public String getName() {
        return name;
    }

    // Polymorphism
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println("Name: " + d.getName());
        d.sound();
    }
}