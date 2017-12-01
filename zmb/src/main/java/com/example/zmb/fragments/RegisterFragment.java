package com.example.zmb.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.KeyListener;
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
public class RegisterFragment extends Fragment {


    //text

    private EditText txtMail;
    private EditText txtPass;

    //btn

    private Button btnOk;
    private Button btnBack;


    // comunicamos el fragment con su evento
    RegisterFragmentEvents events = new RegisterFragmentEvents(this);
    RegisterFragmentsListener listener;

    public void setListener(RegisterFragmentsListener listener) {
        this.listener = listener;
    }

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);

        //id txt
        txtMail = v.findViewById(R.id.txtRegMail);
        txtPass = v.findViewById(R.id.txtRegPass);

        //id btn
        btnBack = v.findViewById(R.id.btnRegBack);
        btnOk = v.findViewById(R.id.btnRegOk);

        //listener btn
        btnBack.setOnClickListener(events);
        btnOk.setOnClickListener(events);


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


class RegisterFragmentEvents implements View.OnClickListener{

    RegisterFragment registerFragment;

    public RegisterFragmentEvents(RegisterFragment registerFragment){
        this.registerFragment = registerFragment;
    }

    @Override
    public void onClick(View view) {
    if (view.getId() == R.id.btnRegBack){
        if (this.registerFragment.listener !=null)
            this.registerFragment.listener.OnBackClicked();

        }else if (view.getId() == R.id.btnRegOk){
        if (this.registerFragment.listener !=null)
            this.registerFragment.listener.OnOkClicked();
    }

    }


}
