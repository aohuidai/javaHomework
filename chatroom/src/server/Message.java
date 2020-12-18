package server;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    public static File file = new File("chat message");
    public static Date date = new Date();
    OutputStreamWriter outputStreamWriter;
    InputStreamReader inputStreamReader;

    public Message() throws FileNotFoundException {

        outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
        inputStreamReader= new InputStreamReader(new FileInputStream(file));

    }

    public void inPut(String string) throws IOException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        outputStreamWriter.append(simpleDateFormat.format(date) + ":");
        outputStreamWriter.append(string+'\n');


    }

    public String getString() {
        return "haah";

    }
}
