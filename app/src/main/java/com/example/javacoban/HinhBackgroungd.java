package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

public class HinhBackgroungd extends AppCompatActivity {

    RelativeLayout manhinh;
    TextView txtChuoi;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_backgroungd);
        txtChuoi = (TextView) findViewById(R.id.txtChuoi);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtChuoi.setText("Lập trình Android Studio trên Java");
            }
        });
//        manhinh = (RelativeLayout) findViewById(R.id.manHinh);
        //manhinh.setBackgroundColor(Color.rgb(123,33,200));

    }
}