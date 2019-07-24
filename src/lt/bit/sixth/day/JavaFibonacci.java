package lt.bit.sixth.day;

import java.math.BigInteger;

public class JavaFibonacci {
    public static void main(String[] args) {
        int n = 1200000;
        System.out.println(fibonacciNumberCounting(n));
    }

    private static BigInteger fibonacciNumberCounting(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
}
