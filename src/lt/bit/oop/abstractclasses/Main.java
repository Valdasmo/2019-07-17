package lt.bit.oop.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Dog  dog = new Dog("Kastonas");
        dog.eat();
        dog.makeSound();

        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.getName();
    }
}
