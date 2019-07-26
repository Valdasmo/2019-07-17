package lt.bit.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Info animalOne = new Animal(12345);
        Info personOne = new Person("Dave");

//        animalOne.sleep();
//        personOne.sayHello();

        animalOne.showInfo();
        personOne.showInfo();

        Dog dog = new Dog(827383);
        dog.showInfo();
    }
}
