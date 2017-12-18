package com.example.ramsesdiezgalvan.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.zmb.fragments.ListFragment;

public class SecondActivity extends AppCompatActivity {


    private Button btnSignOut;
    private SecondActivityEvents events;
    ListFragment listFragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        events = new SecondActivityEvents(this);

        DataHolder.MyDataHolder.fireBaseAdmin.setFireBaseAdminListener(events);

        this.btnSignOut = this.findViewById(R.id.btnSignOut);

        this.btnSignOut.setOnClickListener(events);

        listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentList);
        //Descargamos la rama que queramos
        DataHolder.MyDataHolder.fireBaseAdmin.downAndObserveBranch("Coches");
    }
}
