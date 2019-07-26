package lt.bit.oop.inheritance;

public class Dog extends Animals {

//    String name = "Dog";
//    Dog(){}

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("Dog is barking ...");
    }

////    @Override // annotation
//    public String eat(){
////        System.out.println("Dog is eating ...");
//        return null;
//    }

}
