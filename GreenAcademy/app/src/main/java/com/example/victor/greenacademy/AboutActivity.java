package com.example.victor.greenacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    public  static Button button_backhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        OnButtonClickListener(); //This calls the onclick listener

    }

    public void OnButtonClickListener(){
        button_backhome= (Button)findViewById(R.id.button_backhome);

        //Create the onClick response for the button_about
        button_backhome.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Create an object of the intent
                        //Pass a p
                        Intent intent  = new Intent("com.example.victor.greenacademy.HomeActivity");

                        startActivity(intent); //Calls the intent to call the activity
                    }
                }
        );
    }
}
