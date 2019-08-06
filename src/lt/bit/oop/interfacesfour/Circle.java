package lt.bit.oop.interfacesfour;

public class Circle {
    private double radius;
    private int centerPointX;
    private int getCenterPointY;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerPointX=" + centerPointX +
                ", getCenterPointY=" + getCenterPointY +
                '}';
    }

    public Circle(double radius, int centerPointX, int getCenterPointY) {
        this.radius = radius;
        this.centerPointX = centerPointX;
        this.getCenterPointY = getCenterPointY;
    }
}
