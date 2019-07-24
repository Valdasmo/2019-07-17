package lt.bit.fourth.day;

class DifficultJavaRecursion {
    public static void main(String[] args) {
        difficultRecursionCall(10);
    }

    private static void difficultRecursionCall(int number) {
        System.out.println("First Call Recursion Section Start");
        makeRecursion(number);
        System.out.println("First Call Recursion Section End");
    }

    private static void makeRecursion(int number) {
        number--;
        System.out.println("First method section: " +  number);
        if (number != 0){
            makeRecursion(number);
            difficultRecursionCall(number);
        }
        System.out.println("Second method section: " + number);
    }
}
