package com.example.ramsesdiezgalvan.actividad2;

import com.example.ramsesdiezgalvan.actividad2.firebase.FireBaseAdmin;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by ramsesdiezgalvan on 30/11/17.
 */

public class DataHolder {
    public static DataHolder instance = new DataHolder();
    public FireBaseAdmin fireBaseAdmin;

    public DataHolder(){
        fireBaseAdmin = new FireBaseAdmin();
    }

}
