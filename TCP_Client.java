package Practise;
import java.io.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class TCP_Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost",9050);
        DataInputStream in  = new DataInputStream(s.getInputStream());
        DataOutputStream out  = new DataOutputStream(s.getOutputStream());
        String input = new Scanner(System.in).next();
        out.writeUTF(input.toString());
        System.out.println(in.readUTF());

    }
}
