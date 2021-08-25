package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class baucua extends AppCompatActivity {
     Button btnPlay;
     ImageView imageAnh1, imageAnh2, imageAnh3;
     ArrayList<Integer> mang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baucua);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        imageAnh1 = (ImageView) findViewById(R.id.imageView1);
        imageAnh2 = (ImageView) findViewById(R.id.imageView2);
        imageAnh3 = (ImageView) findViewById(R.id.imageView3);

        mang = new ArrayList<Integer>();
        mang.add(R.drawable.bau);
        mang.add(R.drawable.cua);
        mang.add(R.drawable.tom);
        mang.add(R.drawable.ca);
        mang.add(R.drawable.nai);
        mang.add(R.drawable.ga);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int n = r.nextInt(mang.size());
                imageAnh1.setImageResource(mang.get(n));
                int m = r.nextInt(mang.size());
                imageAnh2.setImageResource(mang.get(m));
                int k = r.nextInt(mang.size());
                imageAnh3.setImageResource(mang.get(k));

            }
        });
    }
}