package lt.bit.oop.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("peoples.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person personOne = (Person) ois.readObject();
            Person personTwo = (Person) ois.readObject();
            Person personThree = (Person) ois.readObject();
            System.out.println(personOne);
            System.out.println(personTwo);
            System.out.println(personThree);

        } catch (IOException ex) {
            ex.printStackTrace();

        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

}

