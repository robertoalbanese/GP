package com.example.provasocket;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient extends AsyncTask<String, Void, Void> {
    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {

        String message = voids[0];

        try {
            s = new Socket("192.168.1.74", 8080);
            pw = new PrintWriter((s.getOutputStream()));
            pw.write(message);
            pw.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}