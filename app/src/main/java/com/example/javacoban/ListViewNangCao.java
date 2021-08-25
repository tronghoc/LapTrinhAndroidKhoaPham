package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewNangCao extends AppCompatActivity {
   ListView lvTraiCay;
   ArrayList<TraiCay> arrayTraiCay;
   TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_nang_cao);

        AnhXa();
        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }

    private void AnhXa() {
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Bầu", "Quả bầu",R.drawable.bau));
        arrayTraiCay.add(new TraiCay("Gà", "Con gà", R.drawable.ga));
        arrayTraiCay.add(new TraiCay("Tôm", "Con tôm", R.drawable.tom));
        arrayTraiCay.add(new TraiCay("Cua", "Con cua", R.drawable.cua));
        arrayTraiCay.add(new TraiCay("Nai", "Con nai", R.drawable.nai));
    }
}