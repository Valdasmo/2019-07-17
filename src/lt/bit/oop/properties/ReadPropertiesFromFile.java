package lt.bit.oop.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFromFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream is = new FileInputStream("MyProps.properties")) {
            properties.load(is);
            System.out.println("Font: " + properties.getProperty("Font".toLowerCase()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
