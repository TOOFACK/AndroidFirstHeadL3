package com.example.paulr.mymessagge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Recivier extends AppCompatActivity {

    public static final String EXTRA_MESSAGGE = "messagge" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recivier);
        TextView textView = findViewById(R.id.getterMes);
        Intent intent = getIntent();
        String string = intent.getStringExtra(EXTRA_MESSAGGE);
        textView.setText(string);
    }
}
