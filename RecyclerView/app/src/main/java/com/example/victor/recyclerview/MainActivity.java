package com.example.victor.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        //Sets the recycler view size to fixed:
        // Optional and useful only if you are sure the layout in uniform accross



        // LinearLayoutManager subclass of LayoutManager will, by default, make your RecyclerView look like a ListView.
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rv.setLayoutManager(llm);

    }





    ///Create a class person a represention of the data we shall be using
    //========================
    class Person {
        String name;
        String age;
        int photoId;

        Person(String name, String age, int photoId) {
            this.name = name;
            this.age = age;
            this.photoId = photoId;
        }
    }

    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.coder));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.coder));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.coder));
    }
    //========================

}

