package Practise;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.nio.channels.ServerSocketChannel;
import java.net.Socket;
public class TCP_Using_ObjectInputStream {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6000);
        Socket s = ss.accept();
        ObjectInputStream o = new ObjectInputStream(s.getInputStream());
        String data = (String)o.readUTF();
        System.out.println("Message "+data);
        ss.close();
    }
}
