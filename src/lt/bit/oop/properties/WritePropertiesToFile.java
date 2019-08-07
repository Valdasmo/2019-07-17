package lt.bit.oop.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesToFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("color", "green");
        properties.setProperty("Lang", "LT");
        properties.setProperty("font", "Arial");
        try (OutputStream os = new FileOutputStream("MyProps.properties")) {
           properties.store(os,"My properties file!");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
