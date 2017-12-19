package com.example.zmb.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zmb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    public RecyclerView recyclerView;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        // conectamos la vista con el codigo
        recyclerView = v.findViewById(R.id.miLista);


        //setear el layout para que sea de tipo Grid(Rejilla)
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        //los adapters son para las listas, o elementos visuales que se reciclan el contenido de manera sistematica para meter contenido.



        return v;


    }

}
