package Practise;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_SERVER_DATAINPUTSTREAM {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7000);
        Socket s = ss.accept();
        DataInputStream  o = new DataInputStream(s.getInputStream());
        System.out.println("Server Listenung On Port "+s.getPort());
        while(true){
            String data = o.readUTF();
            System.out.println(data);
            if(data.equalsIgnoreCase("Exit")){
                break;
            }
        }
        ss.close();
    }
}
