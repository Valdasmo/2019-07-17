package lt.bit.second.day;

import java.math.BigDecimal;

public class JavaMath {
    public static void main(String[] args) {
        int numberOne = 12;
        int numberTwo = 24;
        System.out.println(numberOne * numberOne);
        System.out.println(Math.pow(numberOne, 2));
        System.out.println(Math.sin(numberOne));
        System.out.println(Math.max(numberOne, numberTwo));
        double numberPi = Math.PI;
        System.out.println(10 * numberPi); // BigDecimal
        BigDecimal bigNumber = new BigDecimal(Math.PI);
        System.out.println(bigNumber);
        System.out.println(bigNumber.floatValue());
    }
}
