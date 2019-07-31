package lt.bit.oop.abstractclasses;

public class Dog  extends Animal{
    public Dog(){}

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating ...");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking ...");
    }
}
