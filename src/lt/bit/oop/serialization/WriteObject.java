package lt.bit.oop.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person personOne = new Person(1, "Tommy");
        Person personTwo = new Person(2, "Mouzeris");
        Person personThree = new Person(3, "No name");

        try (FileOutputStream fos = new FileOutputStream("people.bin");
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
