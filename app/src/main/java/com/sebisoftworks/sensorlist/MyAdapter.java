package com.sebisoftworks.sensorlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewholder> {

    ArrayList<String[]> mData;

    public MyAdapter(ArrayList<String[]> aData) {
        mData = aData;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.sensor_view, parent, false);
        MyViewholder viewholder = new MyViewholder(newView);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int pos) {
        String[] string = mData.get(pos);
        holder.tv_name.setText(string[0]);
        holder.tv_power.setText(string[1]);
        holder.tv_manufacterer.setText(string[2]);
        holder.tv_range.setText(string[3]);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
