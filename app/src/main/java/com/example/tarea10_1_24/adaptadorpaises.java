package com.example.tarea10_1_24;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
public class adaptadorpaises extends ArrayAdapter<Paises> {
    public adaptadorpaises(Context context, ArrayList<Paises> datos) {
        super(context, R.layout.bandera, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.bandera, null);
        TextView lblNombre = (TextView) item.findViewById(R.id.txtViewnombre);
        lblNombre.setText(getItem(position).getNombre());

        ImageView imageView = (ImageView)item.findViewById(R.id.imgviewbandera);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlLogo())
                .into(imageView);
        return (item);
    }
}