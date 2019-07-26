package lt.bit.oop.objects;

public class Human {
    private double weight;
    private double height;
    private int age;

    public Human() { }

    public Human(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
