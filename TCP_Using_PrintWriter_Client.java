package Practise;
import java.net.*;
import java.io.*;
public class TCP_Using_PrintWriter_Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1",5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File name : ");
        String file = br.readLine();

        // Sending File name 
        OutputStream o =s.getOutputStream();
        PrintWriter p = new PrintWriter(o);
        p.println(file);
        
        // Reading Contents
        InputStream i = s.getInputStream();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(i));
        String str;
       while((str = br2.readLine()) != null){
            System.out.println(str);
       }
       p.close();
       s.close();
       br.close();
       s.close();
    }
}
