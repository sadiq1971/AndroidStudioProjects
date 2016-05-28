 package com.example.victor.mycalc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

 public class MainActivity extends AppCompatActivity {
     private static Button btn_sbm;

     /**
      * ATTENTION: This was auto-generated to implement the App Indexing API.
      * See https://g.co/AppIndexing/AndroidStudio for more information.
      */
     //private GoogleApiClient client;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         OnButtonClickListener();//This calls the onClickMethod

         // ATTENTION: This was auto-generated to implement the App Indexing API.
         // See https://g.co/AppIndexing/AndroidStudio for more information.
         //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
     }

     public void onButtonClick(View v) {
         EditText e1= (EditText)findViewById(R.id.editText);
         EditText e2= (EditText)findViewById(R.id.editText2);
         TextView t1 = (TextView)findViewById(R.id.editText3);
         int num1 = Integer.parseInt(e1.getText().toString());
         int num2 = Integer.parseInt(e2.getText().toString());
         int sum = num1 +num2;

         t1.setText(Integer.toString(sum));
     }

     public void OnButtonClickListener(){
         btn_sbm = (Button)findViewById(R.id.button2);
         btn_sbm.setOnClickListener(
                 new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         //Create an object of the intent
                         //Pass a p
                         Intent intent  = new Intent("com.example.victor.mycalc.SecondActivity");
                         startActivity(intent); //Calls the intent to call the activity
                     }
                 }
         );

     }



     @Override
     public void onStart() {
         super.onStart();

         // ATTENTION: This was auto-generated to implement the App Indexing API.
         // See https://g.co/AppIndexing/AndroidStudio for more information.
         //client.connect();
         Action viewAction = Action.newAction(
                 Action.TYPE_VIEW, // TODO: choose an action type.
                 "Main Page", // TODO: Define a title for the content shown.
                 // TODO: If you have web page content that matches this app activity's content,
                 // make sure this auto-generated web page URL is correct.
                 // Otherwise, set the URL to null.
                 Uri.parse("http://host/path"),
                 // TODO: Make sure this auto-generated app URL is correct.
                 Uri.parse("android-app://com.example.victor.mycalc/http/host/path")
         );
         //AppIndex.AppIndexApi.start(client, viewAction);
     }

     @Override
     public void onStop() {
         super.onStop();

         // ATTENTION: This was auto-generated to implement the App Indexing API.
         // See https://g.co/AppIndexing/AndroidStudio for more information.
         Action viewAction = Action.newAction(
                 Action.TYPE_VIEW, // TODO: choose an action type.
                 "Main Page", // TODO: Define a title for the content shown.
                 // TODO: If you have web page content that matches this app activity's content,
                 // make sure this auto-generated web page URL is correct.
                 // Otherwise, set the URL to null.
                 Uri.parse("http://host/path"),
                 // TODO: Make sure this auto-generated app URL is correct.
                 Uri.parse("android-app://com.example.victor.mycalc/http/host/path")
         );
         //AppIndex.AppIndexApi.end(client, viewAction);
         //client.disconnect();
     }
 }
