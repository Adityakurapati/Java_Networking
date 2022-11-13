package Practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MainServer {
    public static void main(String[] args) throws IOException {
        int s=2000,c=3000;
        byte buffer[]=new byte[5000],bufferR[]=new byte[5000];
        DatagramSocket socket = new DatagramSocket(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ip = InetAddress.getByName("localhost");
        while(true){
            // Receiving 
            System.out.println("Client : ");
            DatagramPacket received = new DatagramPacket(bufferR,bufferR.length);
            socket.receive(received);
            String data = new String(received.getData(),0,received.getLength());
            System.out.println(data);
            // Sending 
            System.out.println("Server  : ");
            String serverInput=br.readLine();
            buffer = serverInput.getBytes();
            DatagramPacket msg = new DatagramPacket (buffer,serverInput.length(),ip,c);
            socket.send(msg);
           
            if(data=="bye"){
                socket.send(new DatagramPacket("Bye".getBytes(),"bye".length(),ip,c));
                break;
            }
        }
        socket.close();
    }
}
