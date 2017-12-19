package com.example.examen.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.examen.Noticias;
import com.example.zmb.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ramsesdiezgalvan on 28/11/17.
 */

public class NoticiasFragmentAdapter extends RecyclerView.Adapter<NoticiasHolder> {
    public ArrayList<Noticias> noticias;
    public Context mContext;

    public NoticiasFragmentAdapter(ArrayList<Noticias> noticias, Context mContext) {

        this.noticias = noticias;
        this.mContext = mContext;
    }



    @Override
    public NoticiasHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        //Aqui vinculamos vista con controlador (Metodo para inflar un Layout)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_layout, null);
        NoticiasHolder viewHolder = new NoticiasHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(NoticiasHolder holder, int position) {
        holder.txtViewContenido.setText(noticias.get(position).contenido);
        holder.txtViewTitulo.setText(noticias.get(position).titulo);
        holder.txtViewUrl.setText(noticias.get(position).url);

       // Glide.with(mContext).load(noticias.get(position).url)
          //      .into(holder.imageView);

        Picasso.with(mContext).load(noticias.get(position).url).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return noticias.size();
    }



}

class NoticiasHolder extends RecyclerView.ViewHolder {


    public TextView txtViewContenido;
    public TextView txtViewTitulo;
    public TextView txtViewUrl;
    public ImageView imageView;



    public NoticiasHolder(View view) {
        super(view);
        //Linkamos el texto del list_cell_layout
        txtViewContenido = view.findViewById(R.id.txtViewContenido);
        txtViewTitulo = view.findViewById(R.id.txtViewTitulo);
        imageView = view.findViewById(R.id.imageView);
        txtViewUrl = view.findViewById(R.id.txtViewUrl);
    }
}



