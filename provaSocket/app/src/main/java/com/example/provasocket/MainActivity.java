package com.example.provasocket;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText);
    }

    public void send(View v){
        SocketClient socketClient = new SocketClient();
        socketClient.execute(et.getText().toString());
    }
}