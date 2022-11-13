package Practise;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
class TCP_Server{
        public static void main(String a[])throws IOException{
            int i,m=0,n,flag=0;
            try (ServerSocket s = new ServerSocket(9050)) {
                Socket ss = s.accept();
                DataInputStream in = new DataInputStream(ss.getInputStream());
                DataOutputStream out = new DataOutputStream(ss.getOutputStream());
                String  input = in.readUTF();
                n= Integer.parseInt(input);
                m=Integer.parseInt(input)/2;
                if(n==0||n==1){
                    out.writeUTF(input + "  Number Is Not Prime");
                }
                else{
                    for(i=2;i<-m;i++){
                        if(n%i==0){
                            out.writeUTF(input + "  Number Is Not Prime");
                            flag=1;
                            break;
                        }


                        if(flag==0){
                            out.writeUTF(input + "  Number Is  Prime");
                        }

                    }
                   
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            
        }
}