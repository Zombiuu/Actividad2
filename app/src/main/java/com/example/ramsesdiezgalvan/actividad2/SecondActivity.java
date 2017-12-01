package com.example.ramsesdiezgalvan.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    Button btnSignOut;
    SecondActivityEvents events;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        events = new SecondActivityEvents(this);

        this.btnSignOut = this.findViewById(R.id.btnSignOut);

        this.btnSignOut.setOnClickListener(events);

    }
}
