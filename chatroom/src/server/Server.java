package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public  int  numberOfGuest=0;


    public static void main(String arg[]) {
        ServerSocket serverSocket = null;
        Socket sc=null;
        try {
            serverSocket = new ServerSocket(23333);
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (true)
        {

            try {

                System.out.println("等待ing");
                sc = serverSocket.accept();

                AWaiter re =new AWaiter(sc);
                System.out.println("有人进来了");





            } catch (IOException e) {
                e.printStackTrace();
            }

        }











    }
}
