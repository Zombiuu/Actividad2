package com.example.ramsesdiezgalvan.actividad2;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ramsesdiezgalvan on 18/12/17.
 */

@IgnoreExtraProperties
public class FBCoche {

    public String marca;
    public String modelo;

    public FBCoche() {

    }

    public FBCoche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;


    }
}
