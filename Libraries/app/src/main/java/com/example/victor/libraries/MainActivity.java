package com.example.victor.libraries;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.andexert.library.RippleView;


public class MainActivity extends AppCompatActivity {


    //Create the variable button
    public static Button button_nextPage;

    //****DRAWER LAYOUT VARIABLES
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    //****END DRAWER LAYOUT VARIABLES



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OnButtonClickListener(); //This calls the activity created



        //################## ADD ALL THE BELOW AS IT IS
        final RippleView rippleView = (RippleView) findViewById(R.id.more);
        //final RippleView rippleView2 = (RippleView) findViewById(R.id.more2);

        rippleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: onRippleViewClick
            }
        });

        /*rippleView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: onRippleViewClick
            }
        });
        **/


        ///Ripple effect test on button here


        rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {

            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }

        });

        ///#############ADD ALL THE ABOVE AS IT IS##############




/**
        //=============START LDRAWER BELOW===============//

        DrawerArrowDrawable drawerArrow = new DrawerArrowDrawable(this) {
            //@Override
            public boolean isLayoutRtl() {
                return false;
            }
        };
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                drawerArrow, R.string.drawer_open,
                R.string.app_name) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }
        };


//=============END LDRAWER BELOW=================//

**/

    }






public void OnButtonClickListener() {
        button_nextPage = (Button) findViewById(R.id.button_nextPage);

        //Create the onClick response for the button_nextPage
        button_nextPage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Create an object of the intent
                        //Pass a p
                        Intent intent = new Intent("com.example.victor.libraries.AnotherActivity");

                        startActivity(intent); //Calls the intent to call the activity
                    }
                });
    }



}
