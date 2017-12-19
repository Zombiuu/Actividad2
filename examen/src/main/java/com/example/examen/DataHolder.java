package com.example.examen;

import com.example.examen.firebase.FireBaseAdmin;

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
