package Practise;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.*;
class Inet {
    public static void main(String a[])throws UnknownHostException{
        try{
            InetAddress i = InetAddress.getByName("localhost");
            // InetAddress i2[] = InetAddress.getAllByName("www.google.com");
            InetAddress i3 = InetAddress.getByName("localhost");
            System.out.println(InetAddress.getLocalHost());
            System.out.println(i);
            System.out.println(i.getAddress());
            System.out.println(i.getHostAddress());
            System.out.println(i.getHostName());
            System.out.println(i3.equals(InetAddress.getByName("127.0.0.1")));
            System.out.println("Multicast " +i.isMulticastAddress());


            String value = i3.getHostName();
            System.out.println(value.equals("localhost"));
        }catch(Exception e){
            System.out.println(e);
        }


    }
}