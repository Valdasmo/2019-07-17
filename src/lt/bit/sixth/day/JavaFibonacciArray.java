package lt.bit.sixth.day;

public class JavaFibonacciArray {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.print(a + ", " + b);
        do {
            System.out.print(", " + c);
            a = b;
            b = c;
            c = a + b;
        } while (c < 1000000);
        System.out.println(".");
    }
}
