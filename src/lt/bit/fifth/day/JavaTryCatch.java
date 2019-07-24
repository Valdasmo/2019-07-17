package lt.bit.fifth.day;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaTryCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);
             FileReader fileReader = new FileReader(new File("names.txt"))){
            int number = input.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Error");
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
