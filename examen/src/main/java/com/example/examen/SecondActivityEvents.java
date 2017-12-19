package com.example.examen;

import android.content.Intent;
import android.util.Log;
import android.view.View;

//import com.example.ramsesdiezgalvan.actividad2.Adapter.ListFragmentAdapter;
import com.example.examen.adapter.NoticiasFragmentAdapter;
import com.example.examen.firebase.FireBaseAdminListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.GenericTypeIndicator;

import java.util.ArrayList;

/**
 * Created by ramsesdiezgalvan on 30/11/17.
 */

public class SecondActivityEvents implements View.OnClickListener, FireBaseAdminListener {

    SecondActivity secondActivity;

    public SecondActivityEvents(SecondActivity secondActivity) {
        this.secondActivity = secondActivity;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignOut) {

            DataHolder.instance.fireBaseAdmin.signOut();

        }
    }


    @Override
    public void logInOk(boolean ok) {

    }

    @Override
    public void registerOk(boolean ok) {

    }

    @Override
    public void signOutOk(boolean ok) {
        if (ok) {

            Intent intent = new Intent(secondActivity, MainActivity.class);
            secondActivity.startActivity(intent);
            secondActivity.finish();
        }
    }

    @Override
    public void fireBaseDownloadBranch(String branch, DataSnapshot dataSnapshot) {


      GenericTypeIndicator<ArrayList<Noticias>> indicator = new GenericTypeIndicator<ArrayList<Noticias>>() {};

        Log.v("hey","noticias: "+dataSnapshot.getValue());
       ArrayList<Noticias> noticias = dataSnapshot.getValue(indicator);


       NoticiasFragmentAdapter listFragmentAdapter = new NoticiasFragmentAdapter(noticias,secondActivity);

        secondActivity.listFragment.recyclerView.setAdapter(listFragmentAdapter);


    }



}