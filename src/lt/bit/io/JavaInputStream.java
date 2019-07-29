package lt.bit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaInputStream {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("test.txt")) {
    int byteNumber = 0;
            while ((byteNumber = inputStream.read()) != -1) {
        char chars = (char) byteNumber;
                System.out.print(chars);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        catch (IOException ex){
            System.out.println("file not found");
        }


    }
}
