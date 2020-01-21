package com.sebisoftworks.sensorlist;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String[]> mData;
    MyAdapter mMyAdapter;
    List<Sensor> listsensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new ArrayList<>();

        SensorManager manager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        listsensor = manager.getSensorList(Sensor.TYPE_ALL);
        for (int i = 0; i < listsensor.size(); i++) {
            Sensor s = listsensor.get(i);
            String[] data = new String[4];
            data[0] = s.getName();
            data[1] = String.valueOf(s.getPower());
            data[2] = s.getVendor();
            data[3] = String.valueOf(s.getMaximumRange());
            mData.add(data);
        }

        mMyAdapter = new MyAdapter(mData);
        RecyclerView resiglerView = findViewById(R.id.recyclerView);
        resiglerView.setLayoutManager(new LinearLayoutManager(this));
        resiglerView.setAdapter(mMyAdapter);


    }
}
