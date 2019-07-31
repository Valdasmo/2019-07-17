package lt.bit.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaOutputStream {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("test.txt");
             OutputStream os = new FileOutputStream("newtest.txt")){
            int byteNumber = 0;
            while ((byteNumber = is.read()) != -1){
                os.write(byteNumber);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
