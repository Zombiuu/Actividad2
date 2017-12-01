package com.example.ramsesdiezgalvan.actividad2.firebase;

import com.example.ramsesdiezgalvan.actividad2.DataHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by ramsesdiezgalvan on 30/11/17.
 */

public class FireBaseAdmin {
    private FirebaseAuth mAuth;

    public FireBaseAdmin(){

        this.setmAuth(FirebaseAuth.getInstance());
        DataHolder.MyDataHolder.firebaseAuth = getmAuth();

    }



    public FirebaseAuth getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }




}
