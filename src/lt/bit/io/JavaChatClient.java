package lt.bit.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class JavaChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 3333);
             DataInputStream dataInputStream =
                     new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream =
                     new DataOutputStream(socket.getOutputStream());
             BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(System.in))){
            String stringOne = "", stringTwo;
            while (!stringOne.equals("stop")){
                stringOne = bufferedReader.readLine();
                dataOutputStream.writeUTF(stringOne);
                dataOutputStream.flush();
                stringTwo = dataInputStream.readUTF();
                System.out.println("Sarver says: " + stringTwo);
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
}
