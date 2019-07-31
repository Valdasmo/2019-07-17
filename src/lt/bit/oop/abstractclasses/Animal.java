package lt.bit.oop.abstractclasses;

public abstract class Animal extends Object{

    private String name;

    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }

    public void eat (){
        System.out.println("Animal is eating ...");
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
