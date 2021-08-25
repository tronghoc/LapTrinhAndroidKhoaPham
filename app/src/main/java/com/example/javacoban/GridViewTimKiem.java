package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridViewTimKiem extends AppCompatActivity {

    GridView gridViewTK;
    ArrayList<TimKiemHA> arrayListTimKiem;
    AdapterCustomer customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_tim_kiem);
        AnhXa();
        customerAdapter = new AdapterCustomer(this, R.layout.row_items, arrayListTimKiem);
        gridViewTK.setAdapter(customerAdapter);

    }

    private void AnhXa() {
        gridViewTK = (GridView) findViewById(R.id.gridViewTK);
        arrayListTimKiem = new ArrayList<>();
        arrayListTimKiem.add(new TimKiemHA(R.drawable.cua, "Con cua", "This is con cua"));
        arrayListTimKiem.add(new TimKiemHA(R.drawable.tom, "Con tôm", "This is con tôm"));
        arrayListTimKiem.add(new TimKiemHA(R.drawable.ca, "Con cá", "This is con cá"));
        arrayListTimKiem.add(new TimKiemHA(R.drawable.nai, "Con nai", "This is con nai"));
        arrayListTimKiem.add(new TimKiemHA(R.drawable.ga, "Con ga", "This is con gà"));
    }

}