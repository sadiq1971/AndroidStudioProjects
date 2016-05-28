package com.example.victor.charged;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private static Button button_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        OnButtonClickListener();//This calls the onClickMethod
    }

    public void OnButtonClickListener(){
        button_login= (Button)findViewById(R.id.button_login);
        button_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Create an object of the intent
                        //Pass a p
                        Intent intent  = new Intent("com.example.victor.charged.ListActivity");
                        startActivity(intent); //Calls the intent to call the activity
                    }
                }
        );

    }
}
