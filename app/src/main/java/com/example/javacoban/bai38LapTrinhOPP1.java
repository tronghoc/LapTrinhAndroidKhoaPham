package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class bai38LapTrinhOPP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai38_lap_trinh_o_p_p1);
        SinhVien sv = new SinhVien("Trọng Học", "Bà Rịa", 1999);
//        sv.HoTen = "Nguyễn Trọng Học";
//        sv.DiaChi = "Bà Rịa";
        //sv.NamSinh = 1997;
//        sv.SetNamSinh(1990);
        //Toast.makeText(bai38LapTrinhOPP1.this, sv.HoTen + "-" + sv.DiaChi + "-" + sv.NamSinh, Toast.LENGTH_LONG).show();
        Toast.makeText(this, sv.getDiaChi(), Toast.LENGTH_SHORT).show();
    }
}