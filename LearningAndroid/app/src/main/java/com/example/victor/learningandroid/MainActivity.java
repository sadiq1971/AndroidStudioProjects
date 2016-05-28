package com.example.victor.learningandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.victor.learningandroid.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This create the functionality to the submit button defined in the layout
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class );

        //Create a text area inside our new view for our new activity
        EditText editText = (EditText) findViewById(R.id.edit_message);

        //get the message from the edited area above(R.id.edit_messsage)
        String message = editText.getText().toString();

        //Intent to call the displayMessageActivity
        intent.putExtra(EXTRA_MESSAGE, message);

        //Get that activity displayed on a screen
        startActivity(intent);
    }
}
