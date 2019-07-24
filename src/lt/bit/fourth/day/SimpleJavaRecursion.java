package lt.bit.fourth.day;

public class SimpleJavaRecursion {
    public static void main(String[] args) {
        makeSimpleRecursion(5);
    }

    private static void makeSimpleRecursion(int number) {
        number--;
        System.out.println("First method section: " +  number);
        if (number != 0){
            makeSimpleRecursion(number);
        }
        System.out.println("Second method section: " + number);
    }
}
