package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class bai51GridviewNangCao extends AppCompatActivity {
    GridView gvHinhAnh;
    ArrayList<HinhAnh> arrayImage;
    HinhAnhAdapter hinhAnhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai51_gridview_nang_cao);
        AnhXa();
        hinhAnhAdapter = new HinhAnhAdapter(this, R.layout.dong_hinh_anh, arrayImage);
        gvHinhAnh.setAdapter(hinhAnhAdapter);
        gvHinhAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(bai51GridviewNangCao.this, arrayImage.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa() {
        gvHinhAnh = (GridView) findViewById(R.id.gridviewHinhAnh);
        arrayImage = new ArrayList<>();
        arrayImage.add(new HinhAnh("Hinh Cua", R.drawable.cua));
        arrayImage.add(new HinhAnh("Hinh Tôm", R.drawable.tom));
        arrayImage.add(new HinhAnh("Hinh Gà", R.drawable.ga));
        arrayImage.add(new HinhAnh("Hinh Nai", R.drawable.nai));
        arrayImage.add(new HinhAnh("Hinh Bầu", R.drawable.bau));
        arrayImage.add(new HinhAnh("Hinh Cua", R.drawable.cua));

    }
}