package com.example.examen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.zmb.fragments.ListFragment;

public class SecondActivity extends AppCompatActivity {


    private Button btnSignOut;
    private SecondActivityEvents events;
    public ListFragment listFragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        events = new SecondActivityEvents(this);

        DataHolder.instance.fireBaseAdmin.setFireBaseAdminListener(events);

        this.btnSignOut = this.findViewById(R.id.btnSignOut);

        this.btnSignOut.setOnClickListener(events);

        listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentList);
        //Descargamos la rama que queramos
        DataHolder.instance.fireBaseAdmin.downAndObserveBranch("Coches");
    }
}
