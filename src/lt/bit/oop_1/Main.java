package lt.bit.oop_1;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperations count = new ArithmeticOperations();
        System.out.println(count.adder(5, 3));
        Car mercedes = new Car();
        mercedes.isWork = false;
        System.out.println(mercedes.isWork);
        System.out.println(mercedes.speed);
        mercedes.speed = 120;
        System.out.println(mercedes.getColor());
        System.out.println(mercedes.speed);
        Car toyota = new Car("Yaris", true, "red");
        System.out.println(toyota.getModel());
        System.out.println(toyota.getColor());
        toyota.setColor("green");
        System.out.println(toyota.getColor());
        toyota.weight = 1200;
    }
}
