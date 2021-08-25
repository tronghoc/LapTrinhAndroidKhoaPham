package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class HinhNgauNhien extends AppCompatActivity {
   LinearLayout linearLayout;
   ArrayList<Integer> arrayImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_ngau_nhien);
        linearLayout = (LinearLayout) findViewById(R.id.lineLayout);


        CountDownTimer countDownTimer = new CountDownTimer(10000,500) {
            @Override
            public void onTick(long millisUntilFinished) {
                arrayImage = new ArrayList<>();
                arrayImage.add(R.drawable.bg_android1);
                arrayImage.add(R.drawable.bg_android2);
                arrayImage.add(R.drawable.bg_android3);
                arrayImage.add(R.drawable.bg_android4);
                arrayImage.add(R.drawable.bg_android5);
            }

            @Override
            public void onFinish() {

            }
        };
        Random random = new Random();
        int vitri = random.nextInt(arrayImage.size());
        linearLayout.setBackgroundResource(arrayImage.get(vitri));
    }
}