package lt.bit.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(3333);
             Socket socket = serverSocket.accept();
             DataInputStream dataInputStream =
                     new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream =
                     new DataOutputStream(socket.getOutputStream());
             BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(System.in))
        ){
            String stringOne = "", stringTwo;
            while (!stringOne.equals("stop")){
                stringOne = dataInputStream.readUTF();
                System.out.println("Client says: " + stringOne);
                stringTwo = bufferedReader.readLine();
                dataOutputStream.writeUTF(stringTwo);
                dataOutputStream.flush();
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
}
