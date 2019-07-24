package lt.bit.sixth.day;

public class JavaSwappingNumbers {
    public static void main(String[] args) {
        double numberOne = -10;
        double numberTwo = 20;
        System.out.println("Numbers: " + numberOne + " and " + numberTwo);
        numberSwappingOne(numberOne, numberTwo);
        numberSwappingTwo(numberOne, numberTwo);
        numberSwappingThree(numberOne, numberTwo);
//        numberSwappingFour(numberOne, numberTwo);
    }

    private static void numberSwappingOne(double numberOne, double numberTwo) {
        double temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
        System.out.println("Numbers: " + numberOne + " and " + numberTwo);
    }

    private static void numberSwappingTwo(double numberOne, double numberTwo) { // 10 20
        numberOne = numberOne + numberTwo; // 30
        numberTwo = numberOne - numberTwo; // 30 - 20
        numberOne = numberOne - numberTwo; // 30 - 10
        System.out.println("Numbers: " + numberOne + " and " + numberTwo);
    }

    private static void numberSwappingThree(double numberOne, double numberTwo) {
        numberOne = numberOne * numberTwo;
        numberTwo = numberOne / numberTwo;
        numberOne = numberOne / numberTwo;
        System.out.println("Numbers: " + numberOne + " and " + numberTwo);
    }

    private static void numberSwappingFour(int numberOne, int numberTwo) {
        numberOne = numberOne ^ numberTwo;
        numberTwo = numberOne ^ numberTwo;
        numberOne = numberOne ^ numberTwo;
        System.out.println("Numbers: " + numberOne + " and " + numberTwo);
    }
}
