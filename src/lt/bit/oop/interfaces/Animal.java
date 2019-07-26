package lt.bit.oop.interfaces;

public class Animal implements Info {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void showInfo() {
        System.out.println("Animal ID: " + this.id);
    }

}
