package lt.bit.lt.bit.oop;

public class Car {
    protected short speed = 100;
    private String model;
    public float weight;
    private String color = "...";
    boolean isWork;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    Car(){}

    protected Car(String model, boolean isWork, String color) {
        this.model = model;
        this.isWork = isWork;
        if (color.equals("red")) {
            this.color = "black";
        } else {
            this.color = color;
        }
    }

    public String getModel() {
        return model;

    }

    public boolean isWork() {
        return isWork;
    }
}
