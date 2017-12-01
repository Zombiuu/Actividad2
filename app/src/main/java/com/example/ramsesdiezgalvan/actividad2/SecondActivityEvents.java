package com.example.ramsesdiezgalvan.actividad2;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.ramsesdiezgalvan.actividad2.firebase.FireBaseAdminListener;

/**
 * Created by ramsesdiezgalvan on 30/11/17.
 */

public class SecondActivityEvents implements View.OnClickListener, FireBaseAdminListener {

    private SecondActivity secondActivity;

    public SecondActivityEvents(SecondActivity secondActivity) {
        this.secondActivity = secondActivity;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignOut) {

            signOut();

    }
    }

    @Override
    public void createUserWithEmailAndPassword(String email, String password) {

    }

    @Override
    public void singInWithEmailAndPassword(String email, String password) {

    }

    @Override
    public void signOut() {
        Log.v("hola","TAYSIR BOTOOOOON");
        DataHolder.MyDataHolder.firebaseAuth.getInstance().signOut();

        Intent intent = new Intent(secondActivity,MainActivity.class);
        secondActivity.startActivity(intent);
        secondActivity.finish();


    }
}