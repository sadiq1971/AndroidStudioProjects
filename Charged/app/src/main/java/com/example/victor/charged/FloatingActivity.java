package com.example.victor.charged;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class FloatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating);

    }

    // in Activity Context
    ImageView icon = new ImageView(this); // Create an icon
    icon.setImageDrawable(...);

    FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
            .setContentView(icon)
            .build();



    SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
    // repeat many times:
    ImageView itemIcon = new ImageView(this);
    itemIcon.setImageDrawable( ... );
    SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

    FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
            .addSubActionView(button1)
            .addSubActionView(button2)
            // ...
            .attachTo(actionButton)
            .build();
}
