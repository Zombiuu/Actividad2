package com.example.zmb.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zmb.R;

/**
 * Created by ramsesdiezgalvan on 28/11/17.
 */

public class ListFragmentAdapter extends RecyclerView.Adapter<ListFragmentAdapter.MiViewHolder> {






    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Aqui vinculamos vista con controlador
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_layout,null);
        MiViewHolder viewHolder = new MiViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {

        //metemos el contenido a la celda
        if (position == 0){
            holder.texto.setText("Yony");
        }else if (position == 1){
            holder.texto.setText("Javi");
        }else if (position == 2){
            holder.texto.setText("Hola");
        }else if (position == 3){
            holder.texto.setText("Yo");
        }else if (position == 4){
            holder.texto.setText("Me");
        }else if (position == 5){
            holder.texto.setText("Llamo");
        }else if (position == 6){
            holder.texto.setText("Ram");
        }else if (position == 7){
            holder.texto.setText(":D");
        }else if (position == 8){
            holder.texto.setText("^^");
        }

    }


    @Override
    public int getItemCount() {
        return 9;
    }

    class MiViewHolder extends RecyclerView.ViewHolder{

        //Linkamos el texto del list_cell_layout

        TextView texto;


        public MiViewHolder(View view){
            super(view);
            texto = view.findViewById(R.id.texto);
        }
    }

}


