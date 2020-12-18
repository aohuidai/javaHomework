package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ExtraRunnable implements  Runnable{
    public Socket socket;
    Message message;


    @Override
    public void run() {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in=new DataInputStream(socket.getInputStream());

            message.inPut(in.toString());
            message.getString();




            System.out.println(in.toString());
            System.out.println(out.toString());
            System.out.println("finished");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}
