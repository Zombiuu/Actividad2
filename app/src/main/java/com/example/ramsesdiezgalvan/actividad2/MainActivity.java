package com.example.ramsesdiezgalvan.actividad2;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ramsesdiezgalvan.actividad2.firebase.FireBaseAdmin;
import com.example.zmb.fragments.LoginFragment;
import com.example.zmb.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    private LoginFragment loginFragment;
    private RegisterFragment registerFragment;
    private MainActivityEvents mainActivityEvents;
    private FireBaseAdmin fireBaseAdmin;

    public FireBaseAdmin getFireBaseAdmin() {
        return fireBaseAdmin;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fireBaseAdmin = new FireBaseAdmin();
        setContentView(R.layout.activity_main);

        // id de fragments

        loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLog);
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentReg);

        // presentamos al main con su events

        mainActivityEvents = new MainActivityEvents(this);
        fireBaseAdmin.setFireBaseAdminListener(mainActivityEvents);
        // seteamos el listener de los fragments que sera el events del main
        loginFragment.setListener(mainActivityEvents);
        registerFragment.setListener(mainActivityEvents);

        //transicion
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.hide(registerFragment);
        transition.show(loginFragment);
        transition.commit();

    }

    public LoginFragment getLoginFragment() {
        return loginFragment;
    }

    public void setLoginFragment(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }

    public RegisterFragment getRegisterFragment() {
        return registerFragment;
    }

    public void setRegisterFragment(RegisterFragment registerFragment) {
        this.registerFragment = registerFragment;
    }


}
