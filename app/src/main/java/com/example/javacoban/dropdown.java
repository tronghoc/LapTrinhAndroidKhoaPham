package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class dropdown extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown);
        autoCompleteTextView = findViewById(R.id.ddlTinh);
        String a = "Hoà Bình";
        String[] b = {"Điện Biên", "Thanh Hoá", "Nghệ An"};
        String[]option = {"Bà Rịa - Vũng Tàu", "Hà Nội", "Bình Dương", "Đồng Nai", "Hồ Chí Minh", a,
        "Nam Định", "Lai Châu", "Hà Tĩnh", "Quảng Nam", "Sơn La", "Phú Thọ", "Hà Nam", "Quảng Ninh" + b};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.option_item,option);
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(),false);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }
}