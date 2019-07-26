package lt.bit.oop.interfaces;

public class Person implements Info{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Person Name: " + this.name);
    }
}
