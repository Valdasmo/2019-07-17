package lt.bit.oop.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person personOne = new Person(1, "Tommy", 23);
        Person personTwo = new Person(2, "Mouzeris", 4);
        Person personThree = new Person(3, "No name", 100);

        try (FileOutputStream fos = new FileOutputStream("peoples.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(personOne);
            oos.writeObject(personTwo);
            oos.writeObject(personThree);
        }
catch (IOException ex) {
ex.printStackTrace();
}

    }
}
