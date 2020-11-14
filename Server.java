package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String arg[]) {
        ServerSocket serverSocket = null;
        Socket sc=null;


        try {
            serverSocket = new ServerSocket(23333);


        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            System.out.println("等待ing");
            sc = serverSocket.accept();
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());

            DataInputStream in=new DataInputStream(sc.getInputStream());
            System.out.println(in.toString());
            System.out.println(out.toString());




        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
