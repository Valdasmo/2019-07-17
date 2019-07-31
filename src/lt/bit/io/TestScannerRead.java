package lt.bit.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TestScannerRead {
    public static void main(String[] args) {
//        readFileWithScanner();
        readFileWithScannerForSplitter();
    }

    public static void readFileWithScanner() {
        File fileForRead = new File("test.txt");
        try (Scanner scanner = new Scanner(fileForRead)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void readFileWithScannerForSplitter() {
        File fileForRead = new File("test.txt");
        try (Scanner scanner = new Scanner(fileForRead)) {
          String line = scanner.nextLine();
          String[] elements = line.split(";");
            System.out.println(Arrays.toString(elements));
            Long id = Long.parseLong(elements[1]);
            FileOutputStream write = new FileOutputStream("new.txt", true);
            PrintWriter wr  = new PrintWriter(write);
            wr.println(id);
            wr.flush();
//            DataOutputStream dout = new DataOutputStream(write);
//            dout.writeFloat(id);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
