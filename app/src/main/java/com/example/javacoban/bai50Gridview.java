package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class bai50Gridview extends AppCompatActivity {
    GridView gvTen;
    String[] arrayName = {"A", "B","C", "D","E","Q","E","R","T","Y","Y","U","I","O","P"}; //khai báo mảng dạng tên;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai50_gridview);
        gvTen = (GridView) findViewById(R.id.gridviewTen); //ánh xạ
        ArrayAdapter adapter = new ArrayAdapter(bai50Gridview.this,
                android.R.layout.simple_list_item_1,arrayName);
        gvTen.setAdapter(adapter);
        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(bai50Gridview.this, arrayName[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}