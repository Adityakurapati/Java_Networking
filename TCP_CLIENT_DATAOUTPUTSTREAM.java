package Practise;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_CLIENT_DATAOUTPUTSTREAM {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("localhost",7000);
        DataOutputStream  o = new DataOutputStream(s.getOutputStream());
        while(true){
            System.out.println("Enter Ur Msg : ");
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
            o.writeUTF(str);
        }
        
    }

}
