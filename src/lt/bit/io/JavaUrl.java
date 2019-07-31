package lt.bit.io;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaUrl {
    public static void main(String[] args) {
       try {
           URL url = new URL("https://upload.wikimedia.org/" +
                   "wikipedia/commons/3/3a/Cat03.jpg");
           System.out.println(url.getProtocol());
           System.out.println(url.getHost());
           System.out.println(url.getPort());
           System.out.println(url.getFile());
           System.out.println(url.getAuthority());

       } catch (MalformedURLException ex) {
           System.out.println("Error " + ex);
       }
    }
}
