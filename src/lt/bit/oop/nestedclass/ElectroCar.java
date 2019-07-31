package lt.bit.oop.nestedclass;

public class ElectroCar {
    private int id;

    ElectroCar(int id) {
        this.id = id;
    }

    class Motor {
        void startMotor(){
            System.out.println("Motor started");
        }
    }

    public void start(){
        System.out.println("Car is driving ...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
