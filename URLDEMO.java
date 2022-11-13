package Practise;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.lang.System;
public class URLDEMO {
    public static void main(String[] args) throws IOException {
        URL u = new URL("http://www.internic.net");
        URLConnection conn = u.openConnection();

        //  Url Methods 
        System.out.println(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getHost());
        System.out.println(u.getAuthority());
        System.out.println(u.getPath());
        System.out.println(u.hashCode());
        
        // Url Connection Methods 
        System.out.println(conn.getExpiration());
        System.out.println(conn.getDefaultUseCaches());
        System.out.println(conn.getDate());
        System.out.println(conn.getContentType());


        InputStream i = conn.getInputStream();
        int len = conn.getContentLength();
        if(len==-1){
            System.out.println("No Content Available ");
        }
        else{
            char c;
            if(len >0){
                System.out.println("Contents : - ");
                while(((c = (char) i.read())!=-1)){
                    System.out.println(c);
                }
            }
        }


    }
}
