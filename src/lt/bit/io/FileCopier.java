package lt.bit.io;

import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
//       copyByteByByte();
       copyCharByChar();
//       copyLineByLine();
    }

    private static void copyLineByLine() {
        try (BufferedReader inputStream =
                     new BufferedReader(new FileReader("source.txt"));
        PrintWriter outputStream =
                new PrintWriter(new FileWriter("destination_line.txt"))) {
            String dataBox;
            while ((dataBox = inputStream.readLine()) != null){
                outputStream.println(dataBox);
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

    private static void copyCharByChar() {
        try (FileReader inputCharStream = new FileReader("Cat03.jpg");
        FileWriter outputCharStream = new FileWriter("new_char.jpg")){
            int dataBox;
            while ((dataBox = inputCharStream.read()) != -1){
                outputCharStream.write(dataBox);
            }
        } catch (IOException ex){
            System.out.println("Error " + ex);
        }
    }

    private static void copyByteByByte() {
        try (FileInputStream fis = new FileInputStream("Cat03.jpg");
             FileOutputStream fos = new FileOutputStream("new.jpg")){
            int dataBox;
            while ((dataBox = fis.read()) != -1){ // read from file
                fos.write(dataBox); // write to file
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
}
