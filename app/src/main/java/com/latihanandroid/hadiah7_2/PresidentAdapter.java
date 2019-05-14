package com.latihanandroid.hadiah7_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.PresidentViewHolder> {
    private ArrayList<President> presidents;
    private Context context;

    public ArrayList<President> getPresidents() {
        return presidents;
    }

    public void setPresidents(ArrayList<President> presidents) {
        this.presidents = presidents;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public PresidentAdapter(ArrayList<President> presidents, Context context) {
        this.presidents = presidents;
        this.context = context;
    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow= LayoutInflater.from(context).inflate(R.layout.item_rows_president,parent,false);
        return new PresidentViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {
        holder.tvName.setText(presidents.get(position).getMnama());
        holder.tvRemarks.setText(presidents.get(position).getMremarks());
        Glide.with(context).load(presidents.get(position).getMphoto()).override(110,110).into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return presidents.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName,tvRemarks;
        public ImageView imgPhoto;
        public PresidentViewHolder(View itemView) {
            super(itemView);
            tvName=(TextView) itemView.findViewById(R.id.tvName);
            tvRemarks=(TextView) itemView.findViewById(R.id.tvRemarks);
            imgPhoto=(ImageView) itemView.findViewById(R.id.imgPhoto);
        }
    }
}
