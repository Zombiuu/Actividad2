package com.example.ramsesdiezgalvan.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    private Button btnSignOut;
    private SecondActivityEvents events;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        events = new SecondActivityEvents(this);

        DataHolder.MyDataHolder.fireBaseAdmin.setFireBaseAdminListener(events);

        this.btnSignOut = this.findViewById(R.id.btnSignOut);

        this.btnSignOut.setOnClickListener(events);

    }
}
