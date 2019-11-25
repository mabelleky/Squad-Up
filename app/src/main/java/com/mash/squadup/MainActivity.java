package com.mash.squadup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.mash.squadup.Screen.CalendarFragment;
import com.mash.squadup.Screen.MapFragment;
import com.mash.squadup.Screen.MeetupFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);


        Button mapButton = (Button)findViewById(R.id.mapNav);
        mapButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Map", Toast.LENGTH_SHORT).show();
                Fragment fragment = new MapFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, fragment); // replace a Fragment with Frame Layout
                transaction.commit(); // commit the changes
            }
        });

        Button calButton = (Button)findViewById(R.id.calendarNav);
        calButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Calendar", Toast.LENGTH_SHORT).show();
                Fragment fragment = new CalendarFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, fragment); // replace a Fragment with Frame Layout
                transaction.commit(); // commit the changes
            }
        });
        Button meetButton = (Button)findViewById(R.id.meetupNav);
        meetButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "Meet Up", Toast.LENGTH_SHORT).show();
                Fragment fragment = new MeetupFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, fragment); // replace a Fragment with Frame Layout
                transaction.commit(); // commit the changes
            }
        });
    }
}


