package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DrawableClip extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_clip);
        imageView = findViewById(R.id.imageView);
        imageView.setImageLevel(1000);
        button = findViewById(R.id.btnClip);
        ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        int currentLevel = clipDrawable.getLevel();
                        if(currentLevel >= 10000){
                            currentLevel = 0;
                        }
                        imageView.setImageLevel(currentLevel + 1000);
                        handler.postDelayed(this, 1000);
                    }
                },2000);

            }
        });
    }
}