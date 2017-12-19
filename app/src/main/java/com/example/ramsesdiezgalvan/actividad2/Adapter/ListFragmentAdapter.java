package com.example.ramsesdiezgalvan.actividad2.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ramsesdiezgalvan.actividad2.FBCoche;
import com.example.zmb.R;
import com.example.zmb.fragments.ListFragment;

import java.util.ArrayList;

/**
 * Created by ramsesdiezgalvan on 28/11/17.
 */

public class ListFragmentAdapter extends RecyclerView.Adapter<MiViewHolder> {
    public ArrayList<FBCoche> coches;
    public Context mContext;

    public ListFragmentAdapter(ArrayList<FBCoche> coches, Context mContext) {

        this.coches = coches;
        this.mContext = mContext;
    }


    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        //Aqui vinculamos vista con controlador (Metodo para inflar un Layout)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_layout, null);
        MiViewHolder viewHolder = new MiViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.txtViewModelo.setText(coches.get(position).modelo);
        holder.txtViewMarca.setText(coches.get(position).marca);

    }





    @Override
    public int getItemCount() {
        return coches.size();
    }



}
class MiViewHolder extends RecyclerView.ViewHolder {


    public TextView txtViewMarca;
    public TextView txtViewModelo;


    public MiViewHolder(View view) {
        super(view);
        //Linkamos el texto del list_cell_layout
        txtViewMarca = view.findViewById(R.id.txtViewMarca);
        txtViewModelo = view.findViewById(R.id.txtViewModelo);
    }
}

