package com.example.aljos.myapplication.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.aljos.myapplication.Data.DataFish;
import com.example.aljos.myapplication.Data.DataHistorias;
import com.example.aljos.myapplication.R;

import java.util.Collections;
import java.util.List;


/**
 * Created by Maxor on 27/11/17.
 */

public class AdapterHisto extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataHistorias> data= Collections.emptyList();
    DataHistorias current;
    int currentPos=0;

    public AdapterHisto(Context context, List<DataHistorias> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_histo, parent,false);
        AdapterHisto.MyHolder holder=new AdapterHisto.MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        AdapterHisto.MyHolder myHolder= (AdapterHisto.MyHolder) holder;
        DataHistorias current=data.get(position);
        myHolder.textID.setText(current.idHisto);
        myHolder.textDes.setText("Marca: " + current.desHisto);
       // Darle color a un texto  myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

        // load image into imageview using glide
       // Glide.with(context).load("http://172.20.10.4/ProyectoFinal/servicios/images/" + current.fishImage)
         //       .placeholder(R.drawable.ic_error)
           //     .error(R.drawable.ic_error)
             //   .into(myHolder.ivFish);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class MyHolder extends RecyclerView.ViewHolder{

        //TextView textFishName;
        //ImageView ivFish;
        //TextView textSize;
        TextView textID;
        TextView textDes;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textID= (TextView) itemView.findViewById(R.id.textFishName);
           // ivFish= (ImageView) itemView.findViewById(R.id.ivFish);
          //  textSize = (TextView) itemView.findViewById(R.id.textSize);
            textDes = (TextView) itemView.findViewById(R.id.textType);
            //textPrice = (TextView) itemView.findViewById(R.id.textPrice);
        }

    }

}
