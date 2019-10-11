package com.mash.squadup;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.mash.squadup.Screen.ScreenLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        LinearLayout view = (LinearLayout)findViewById(R.id.myLayout);

        Toolbar toolBarOne = new Toolbar(this);

        Spinner spinner = new Spinner(this);
        view.addView(toolBarOne);
        toolBarOne.setBackgroundColor(Color.rgb(150, 0, 150));

        ScreenLayout screenlayout = new ScreenLayout(this, view);
        CalendarView cView = new CalendarView(this);

        //screenlayout.AddButton("Settings", Color.RED);
        //screenlayout.AddButton("Test Huehuehue");
        view.addView(cView);


        /*
        Spinner spinner = new Spinner(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("Settings");
        list.add("Main Menu");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        Toolbar toolBarOne = new Toolbar(this);
        toolBarOne.addView(spinner);
        toolBarOne.setBackgroundColor(Color.rgb(150, 150, 55));
        setSupportActionBar(toolBarOne);
        */
    }
}
