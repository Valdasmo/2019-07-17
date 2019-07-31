package lt.bit.io;

import java.io.File;
import java.io.IOException;

public class JavaFile {
    public static void main(String[] args) throws Exception{
        createNewFile();
        createNewDirectory();
        createNewDirectories();
        deleteFile();
    }

    private static void deleteFile() {
        File fileForDelete = new File("Cat03.jpg");
        boolean check = fileForDelete.delete();
        System.out.println(check);
    }

    private static void createNewDirectories() {
        File newDirectory = new File("A/B/C");
        boolean check = newDirectory.mkdirs();
        System.out.println(check);
    }

    private static void createNewDirectory() {
        File newDirectory = new File("NewDirectory");
        boolean check = newDirectory.mkdir();
        System.out.println(check);
    }

    private static void createNewFile() throws IOException {
        File newFile = new File("hello.txt");
        boolean check = newFile.createNewFile();
        System.out.println(check);
    }
}
