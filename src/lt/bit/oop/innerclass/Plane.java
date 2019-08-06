package lt.bit.oop.innerclass;

public class Plane {
    private String planeNumber;

    public Plane(String planeNumber) {
        this.planeNumber = planeNumber;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }
public void fly(){
        Motor motor = new Motor();
        motor.startMotor();
    System.out.println("Plane " + this.planeNumber + "is flyissds" );

}
private  class Motor{
        public void startMotor(){
            System.out.println("Motor is working");
        }
}
    @Override
    public String toString() {
        return "Plane{" +
                "planeNumber='" + planeNumber + '\'' +
                '}';
    }
}


