package com.example.ramsesdiezgalvan.actividad2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;

import com.example.ramsesdiezgalvan.actividad2.firebase.FireBaseAdminListener;
import com.example.zmb.fragments.LoginFragmentsListener;
import com.example.zmb.fragments.RegisterFragmentsListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

/**
 * Created by ramsesdiezgalvan on 21/11/17.
 */

public class MainActivityEvents implements LoginFragmentsListener,RegisterFragmentsListener , FireBaseAdminListener{
    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void OnRegisteredClicked() {
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(this.mainActivity.registerFragment);
        transition.hide(this.mainActivity.loginFragment);
        transition.commit();
    }

    @Override
    public void OnLoginClicked() {

        singInWithEmailAndPassword(this.mainActivity.loginFragment.getTxtMail().getText().toString(),this.mainActivity.loginFragment.getTxtPass().getText().toString());

    }


    @Override
    public void OnOkClicked() {
        createUserWithEmailAndPassword(this.mainActivity.registerFragment.getTxtMail().getText().toString(),this.mainActivity.registerFragment.getTxtPass().getText().toString());
    }

    @Override
    public void OnBackClicked() {
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.hide(this.mainActivity.registerFragment);
        transition.show(this.mainActivity.loginFragment);
        transition.commit();


    }

    @Override
    public void createUserWithEmailAndPassword(String email, String password) {
        this.mainActivity.getFireBaseAdmin().getmAuth().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent intent = new Intent(mainActivity, SecondActivity.class);
                            mainActivity.startActivity(intent);
                            mainActivity.finish();


                        }
                    }


                });
    }
    @Override
    public void singInWithEmailAndPassword(String email, String password) {

        if (this.mainActivity.getFireBaseAdmin().getmAuth().getCurrentUser() != null) {
            // Already signed in
            // Do nothing
            System.out.println("    ESTOY LOGUEADO!!!!!!!!!");
        } else {
            this.mainActivity.getFireBaseAdmin().getmAuth().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            System.out.println("ACABO DE LOGUEARME!!!!!!!!");
                            if (task.isSuccessful()) {
                                Intent intent = new Intent(mainActivity, SecondActivity.class);
                                mainActivity.startActivity(intent);
                                mainActivity.finish();
                            }
                        }
                    });
        }

    }

    @Override
    public void signOut() {

    }
}
