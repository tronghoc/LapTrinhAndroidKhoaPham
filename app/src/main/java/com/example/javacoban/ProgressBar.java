package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

import com.agrawalsuneet.dotsloader.loaders.CircularDotsLoader;
import com.github.ybq.android.spinkit.SpinKitView;

public class ProgressBar extends AppCompatActivity {
   private SpinKitView spibkit1, spibkit2,spibkit3,spibkit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
         spibkit1 = findViewById(R.id.spin_kit1);
        spibkit2 = findViewById(R.id.spin_kit2);
        spibkit3 = findViewById(R.id.spin_kit3);
        spibkit4 = findViewById(R.id.spin_kit4);


        spibkit2.setVisibility(View.GONE);
        CircularDotsLoader loader = findViewById(R.id.loader1);
        loader.setDefaultColor(ContextCompat.getColor(this,R.color.red));
        loader.setSelectedColor(ContextCompat.getColor(this,R.color.yellow));
        loader.setBigCircleRadius(80);
        loader.setRadius(24);
        loader.setAnimDur(300);
        loader.setShowRunningShadow(true);
        loader.setFirstShadowColor(ContextCompat.getColor(this, R.color.green));
        loader.setSecondShadowColor(ContextCompat.getColor(this, R.color.red));
        loader.setVisibility(View.VISIBLE);
    }
}