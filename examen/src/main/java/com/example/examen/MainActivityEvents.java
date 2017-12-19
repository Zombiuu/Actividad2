package com.example.examen;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;

import com.example.examen.firebase.FireBaseAdminListener;
import com.example.zmb.fragments.LoginFragmentsListener;
import com.example.zmb.fragments.RegisterFragmentsListener;
import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DataSnapshot;

/**
 * Created by ramsesdiezgalvan on 21/11/17.
 */

public class MainActivityEvents implements LoginFragmentsListener, RegisterFragmentsListener, FireBaseAdminListener {
    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void OnRegisteredClicked() {
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(this.mainActivity.getRegisterFragment());
        transition.hide(this.mainActivity.getLoginFragment());
        transition.commit();
    }

    @Override
    public void OnLoginClicked() {

        this.mainActivity.getFireBaseAdmin().singInWithEmailAndPassword(this.mainActivity.getLoginFragment().getTxtMail().getText().toString(), this.mainActivity.getLoginFragment().getTxtPass().getText().toString());

    }


    @Override
    public void OnOkClicked() {
        this.mainActivity.getFireBaseAdmin().createUserWithEmailAndPassword(this.mainActivity.getRegisterFragment().getTxtMail().getText().toString(), this.mainActivity.getRegisterFragment().getTxtPass().getText().toString());

    }

    @Override
    public void OnBackClicked() {
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.hide(this.mainActivity.getRegisterFragment());
        transition.show(this.mainActivity.getLoginFragment());
        transition.commit();


    }


    @Override
    public void logInOk(boolean ok) {
        if (ok) {
            Intent intent = new Intent(mainActivity, SecondActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }

    }

    @Override
    public void registerOk(boolean ok) {
        if (ok) {
            Intent intent = new Intent(mainActivity, SecondActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
    }

    @Override
    public void signOutOk(boolean ok) {


    }

    @Override
    public void fireBaseDownloadBranch(String branch, DataSnapshot dataSnapshot) {

    }



}
