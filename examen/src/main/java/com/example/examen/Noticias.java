package com.example.examen;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ramsesdiezgalvan on 19/12/17.
 */
@IgnoreExtraProperties
public class Noticias {
    String titulo;
    String contenido;
    String url;

    public Noticias(){

    }
    public Noticias(String titulo, String contenido, String url){
    this.contenido = contenido;
    this.titulo = titulo;
    this.url = url;
    }
}
