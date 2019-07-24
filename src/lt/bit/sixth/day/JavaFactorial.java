package lt.bit.sixth.day;

import java.math.BigInteger;

public class JavaFactorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingRecursion(5));
        System.out.println(factorialWithoutRecursion(15));
        System.out.println(factorialBigNumbers(41));
    }

    private static int factorialUsingRecursion(int i) {
        if (i <= 2) {
            return i;
        }
        return i * factorialUsingRecursion(i - 1);
    }

    private static long factorialWithoutRecursion(int n) {
        long factorialNumber = 1;
       for (int i = 2; i <= n; i++){
           factorialNumber *= i;
       }
        return factorialNumber;
    }

    private static BigInteger factorialBigNumbers(int n){
        BigInteger factorialNumber = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));
        }
        return factorialNumber;
    }
}
