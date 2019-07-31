package lt.bit.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaWebCopier {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/List_of_HTTP_header_fields");
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            for (int i = 1; i <= 8; i++){
                System.out.println(httpURLConnection.getHeaderField(i) + " = "
                        + httpURLConnection.getHeaderFieldKey(i));
            }

            URLConnection urlConnection = url.openConnection();
            InputStream dataStream = urlConnection.getInputStream();
            File file = new File("index.html");
            FileOutputStream outputStream = new FileOutputStream(file);
            int dataBox;
            while ((dataBox = dataStream.read()) != -1) {
                System.out.print((char) dataBox);
                outputStream.write(dataBox);
            }

        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
