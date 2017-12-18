package com.example.ramsesdiezgalvan.actividad2;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.ramsesdiezgalvan.actividad2.firebase.FireBaseAdminListener;
import com.google.firebase.database.DataSnapshot;

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

            DataHolder.MyDataHolder.fireBaseAdmin.signOut();

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


    }


}