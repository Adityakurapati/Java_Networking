package Practise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class MainClient {
    public static void main(String[] args) throws IOException {
        int s=2000,c=3000;
        byte buffer[]=new byte[5000],bufferS[]=new byte[5000];
        DatagramSocket socket = new DatagramSocket(c);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ip = InetAddress.getByName("localhost");
        while(true){
            // Sending 
            System.out.println("Client : ");
            String clientInput=br.readLine();
            bufferS = clientInput.getBytes();
            DatagramPacket msg = new DatagramPacket (bufferS,clientInput.length(),ip,s);
            socket.send(msg);

                // Receiving 
            System.out.println("Server : ");
            DatagramPacket received = new DatagramPacket(buffer,buffer.length);
            socket.receive(received);
            String data = new String(received.getData(),0,received.getLength());
            System.out.println(data);

            if(data.equalsIgnoreCase("bye")){
                break;
            }
        }
        socket.close();
        
    }
}
