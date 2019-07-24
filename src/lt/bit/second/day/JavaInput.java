package lt.bit.second.day;

import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = input.next();
        System.out.println("Your number is: " + number);
    }
}
