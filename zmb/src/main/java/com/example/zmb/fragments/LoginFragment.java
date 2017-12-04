package com.example.zmb.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zmb.R;


/**
 * A simple {@link Fragment} subclass.
 */


/**
 * ESTO ES "A"
 */
public class LoginFragment extends Fragment {


    //text
    private EditText txtMail;
    private EditText txtPass;

    //btn
    private Button btnLog;
    private Button btnReg;


    /**
     * Con esto conectamos "A" con "B"
     */
    //events

    LoginFragmentsEvents events = new LoginFragmentsEvents(this);
    LoginFragmentsListener listener;


    public LoginFragment() {
        // Required empty public constructor
    }


    // necesario para poder setear C desde el MainActivity
    public void setListener(LoginFragmentsListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // cambiamos el return para meterlo en una View y en el return la View creada.

        View v = inflater.inflate(R.layout.fragment_login, container, false);

        //le damos id a los txt
        txtMail = v.findViewById(R.id.txtLogMail);
        txtPass = v.findViewById(R.id.txtLogPass);

        // le damos id a los btn

        btnReg = v.findViewById(R.id.btnLogReg);
        btnLog = v.findViewById(R.id.btnLogLog);

        // le seteamos los listener

        btnReg.setOnClickListener(events);
        btnLog.setOnClickListener(events);

        return v;
    }

    public EditText getTxtMail() {
        return txtMail;
    }

    public void setTxtMail(EditText txtMail) {
        this.txtMail = txtMail;
    }

    public EditText getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(EditText txtPass) {
        this.txtPass = txtPass;
    }
}


/**
 * ESTO ES "B"
 */

class LoginFragmentsEvents implements View.OnClickListener {

    //creamos un obj de A en B, no se puede hacer new de el.

    LoginFragment loginFragment;

    public LoginFragmentsEvents(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnLogReg) {
            if (this.loginFragment.listener != null)
                this.loginFragment.listener.OnRegisteredClicked();


        } else if (view.getId() == R.id.btnLogLog) {
            if (this.loginFragment.listener != null)
                this.loginFragment.listener.OnLoginClicked();

        }

    }
}


