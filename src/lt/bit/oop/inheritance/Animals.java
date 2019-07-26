package lt.bit.oop.inheritance;

public class Animals {

    String name;

    Animals(){}

    public Animals(String name) {
        this.name = name;
    }

    String eat(){
//        System.out.println("Animal is eating ...");
        return "Animal is eating ...";
    }

    public void sleep(){
        System.out.println("Animal is sleeping ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
