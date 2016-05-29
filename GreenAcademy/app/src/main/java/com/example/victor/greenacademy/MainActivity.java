package com.example.victor.greenacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static Button button_about;
    public static Button button_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OnButtonClickListener();//This calls the onClickMethod
    }

    public void OnButtonClickListener(){
        button_about= (Button)findViewById(R.id.button_about);
        button_join= (Button)findViewById(R.id.button_join);

        //Create the onClick response for the button_about
        button_about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Create an object of the intent
                        //Pass a p
                        Intent intent  = new Intent("com.example.victor.greenacademy.AboutActivity");

                        startActivity(intent); //Calls the intent to call the activity
                    }
                }
        );
        //Create the onClick response for the button_join
        button_join.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View x) {
                        //Create an object of the intent
                        Intent intent2  = new Intent("com.example.victor.greenacademy.JoinActivity");

                        startActivity(intent2); //Calls the intent to call the activity
                    }
                }
        );

    }
}
