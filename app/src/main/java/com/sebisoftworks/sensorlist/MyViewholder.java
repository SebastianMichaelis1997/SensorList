package com.sebisoftworks.sensorlist;

import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyViewholder extends RecyclerView.ViewHolder {
    TextView tv_name;
    TextView tv_power;
    TextView tv_range;
    TextView tv_manufacterer;

    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.tv_name);
        tv_manufacterer = itemView.findViewById(R.id.tv_manufacterer);
        tv_range = itemView.findViewById(R.id.tv_range);
        tv_power = itemView.findViewById(R.id.tv_power);
    }
}
