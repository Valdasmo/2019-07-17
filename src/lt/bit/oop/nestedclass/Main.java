package lt.bit.oop.nestedclass;

public class Main {
    public static void main(String[] args) {
        ElectroCar car = new ElectroCar(12345);
        ElectroCar.Motor motor = car.new Motor();
        motor.startMotor();
        car.start();
    }
}
