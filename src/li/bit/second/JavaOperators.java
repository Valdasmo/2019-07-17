package li.bit.second;

public class JavaOperators {
    public static void main(String[] args) {
        checkArithmeticOperators ();
        checkBitwiseOperators ();
        checkRelationOperators ();

    }



    private static void checkArithmeticOperators() {
        int numberOne = 10;
        int numberTwo = 5;
        int resultAdd = numberOne + numberTwo;
        int resultSubstract = numberOne - numberTwo;
        int resultMultiply = numberOne * numberTwo;

    }

    private static void checkBitwiseOperators() {
        int numberOne = 10;
        printBinary(numberOne, 32);
        int numberTwo = 13;
        System.out.println("|");
        printBinary(numberTwo, 32);
        int result = numberOne | numberTwo;
        System.out.println("Result");
        printBinary(result, 32);
//        System.out.println(numberOne);
//        printBinary(numberOne, 32);

    }

    public static void printBinary(long value, long size) {
    for (long i = size - 1; i >= 0; i--) {
        long mask = 1 << i;
        long result = (mask & value) >> i;
        System.out.print(result);
    }
        System.out.println();

    }

    private static void checkRelationOperators() {
    }
}
