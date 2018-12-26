package com.example.paulr.mymessagge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);


    }

    public void Send(View view) {
        EditText text = findViewById(R.id.text);
        Intent intent = new Intent(Intent.ACTION_SEND);
        String tex = text.getText().toString();
        intent.putExtra(intent.EXTRA_TEXT,tex);
        intent.setType("text/plain");
        Intent chosenIntent = Intent.createChooser(intent, "Send message via...");
        startActivity(chosenIntent);
    }
}
