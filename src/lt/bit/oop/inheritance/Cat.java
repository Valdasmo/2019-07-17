package lt.bit.oop.inheritance;

public class Cat extends Animals {


    public Cat(String name) {
        super(name);
    }

    public void meow(){
        System.out.println("Miau ...");
    }
}
