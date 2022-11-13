package Practise;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TCP_Using_PrintWriter_Server {
    public static void main(String[] args) throws IOException {
        // Getting Input File Name 
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        InputStream i = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(i));
        String file= br.readLine();

        // Reading File
            BufferedReader br2 = new BufferedReader(new FileReader(file));

            // Sending Content Of File 
            OutputStream o = s.getOutputStream();
            PrintWriter w = new PrintWriter(o,true);
            String data;
            while((data=br2.readLine())!=null){
                w.println(data);
            }
            br2.close();
            s.close();
            i.close();
            o.close();
    }
}
