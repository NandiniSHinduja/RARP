package TCPRARP;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    public static void main (String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String ip []={"165.165.80.80","165.165.79.1"};
        String mac[]={"AE:09:87:3F","89:E0:78:6F"};
        String str=din.readUTF().trim();
        for(int i=0;i<=mac.length;i++){
            if(str.equals(mac[i])){
                dout.writeUTF(ip[i]);
                break;
            }
            else{
                dout.writeUTF("This mac address is invalid.");
                break;
            }
        }


    }
    
}
