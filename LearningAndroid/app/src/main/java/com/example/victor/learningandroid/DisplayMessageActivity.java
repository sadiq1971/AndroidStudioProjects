package com.example.victor.learningandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the message that was added into the app
        Intent intent = getIntent();

        //Get the string that was stored into the intent
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Create a text view where to display that message
        TextView textView = new TextView(this);
        textView.setTextSize(40); //set the
        //You can set the text message Inside the text area with the message
        // that was passed from the intent
        textView.setText(message);

        //Everything is set so:
        //now put the textView to your android device
        setContentView(textView);
    }
}
