package Practise;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCP_Using_ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6000);
        ObjectOutputStream o=new ObjectOutputStream(s.getOutputStream());
        o.writeUTF("hellooo");
        o.flush();
        o.close();
        s.close();
    }
}
