package lt.bit.io;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input String: ");
            String stringData = input.next();
            System.out.println("your string ... " + stringData.length());
        }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
