package lt.bit.second.day;

public class JavaOperators {
    private static final int AGE = 30;

    public static void main(String[] args) {
        checkArithmeticsOperators();
        checkBitwiseOperators();
        checkRelationalOperators();
        checkAssignmentOperators();
    }

    private static void checkAssignmentOperators() {
        int number = 23;
        double myNumber = number;
//        number++;
        myNumber /= 10; // number = number + 1
        System.out.println(myNumber);
        System.out.println(number <<= 2);
    }

    private static void checkRelationalOperators() {
        byte numberOne = 100;
        byte numberTwo = 1;
        boolean result = numberOne == numberTwo;
        boolean resultTwo = numberOne >= numberTwo;
//        numberOne >= numberTwo;
        System.out.println(numberOne >= numberTwo);


    }

    private static void checkBitwiseOperators(){
        int numberOne = 5;
        printBinary(numberOne, 32);
        int numberTwo = 13;
        System.out.println("<<");
//        printBinary(numberTwo, 32);
        int result = numberOne << 2 ; //^ numberTwo; // &, ^, ~, >>, <<, >>>
        System.out.println("Result");
        printBinary(result, 32);
//        System.out.println(numberOne);
//        printBinary(numberOne, 32);
    }

    private static void printBinary(long value, long size) {
        for (long i = size - 1; i >= 0; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    private static void checkArithmeticsOperators() {
        int numberOne = 10, numberTwo = 5;
        int copyNumberOne = numberOne;
        boolean check = numberOne == copyNumberOne;
        int resultAdd = numberOne + numberTwo;
        int resultSubstract = numberOne - numberTwo;
        int resultMultiply = numberOne * numberTwo;
        int resultDivide = numberOne / numberTwo;
        int resultReminder = numberOne % numberTwo;
        System.out.println("add: " + resultAdd);
        System.out.println("substract: " + resultSubstract);
        System.out.println("multiply: " + resultMultiply);
        System.out.println("divide: " + resultDivide);
        System.out.println("reminder: " + resultReminder);
        System.out.println(numberOne);
        System.out.println(numberOne++);
        System.out.println(numberOne);
        System.out.println(++numberOne);
        System.out.println(numberOne++ + numberOne++);
        System.out.println(numberOne);
        System.out.println(AGE);
        System.out.println(copyNumberOne);
        System.out.println(--numberTwo + numberTwo++ +
                ++numberTwo + 2 * numberTwo++); // 5
        System.out.println(numberTwo);
    }

}
