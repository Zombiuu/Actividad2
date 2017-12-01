package com.example.ramsesdiezgalvan.actividad2.firebase;

/**
 * Created by ramsesdiezgalvan on 30/11/17.
 */

public interface FireBaseAdminListener {


    public void createUserWithEmailAndPassword(String email, String password);
    public void singInWithEmailAndPassword(String email, String password);
    public void signOut();

}
