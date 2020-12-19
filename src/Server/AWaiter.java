package Server;

import java.net.Socket;

public class AWaiter {

    ExtraRunnable extraRunnable = new ExtraRunnable();
    Thread thread;

    public AWaiter(Socket sc) {
        System.out.println("a waiter has been created");

        extraRunnable.socket=sc;
        thread = new Thread(extraRunnable);
        thread.start();


    }


}
