package com.example.provasocket;

import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);

        Thread myThread = new Thread(new MyServerThread());
        myThread.start();
    }

    class MyServerThread implements Runnable {
        Socket s;
        ServerSocket ss;
        InputStreamReader isr;
        BufferedReader bufferedReader;
        Handler h = new Handler();

        String message;

        @Override
        public void run() {
            try {
                ss = new ServerSocket(8000);
                while (true) {
                    s = ss.accept();
                    isr = new InputStreamReader((s.getInputStream()));
                    bufferedReader = new BufferedReader(isr);
                    message = bufferedReader.readLine();
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void send(View v) {
        SocketClient socketClient = new SocketClient();
        socketClient.execute(et.getText().toString());
        Toast.makeText(getApplicationContext(), "sent", Toast.LENGTH_SHORT).show();
    }
}