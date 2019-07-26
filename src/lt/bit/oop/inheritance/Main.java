package lt.bit.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Kastonas");
        dog.sleep();
        dog.eat();
        System.out.println(dog.name);
        dog.bark();
        Cat cat = new Cat("Mauzeris");
        cat.meow();
        cat.setName("Mauzeris");
        System.out.println(cat.getName());
        Kastonas myPet = new Kastonas("Katinas");
        myPet.eat();
        myPet.sleep();
        myPet.bark();
        System.out.println("oho " + myPet.getName());
    }
}
