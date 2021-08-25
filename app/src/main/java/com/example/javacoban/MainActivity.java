package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       imageView = findViewById(R.id.image);
      textView = findViewById(R.id.textview);
       findViewById(R.id.btn_center).setOnClickListener(clickListener);
       findViewById(R.id.btn_centerCrop).setOnClickListener(clickListener);
       findViewById(R.id.btn_centerInside).setOnClickListener(clickListener);
       findViewById(R.id.btn_fitCenter).setOnClickListener(clickListener);
       findViewById(R.id.btn_fitEnd).setOnClickListener(clickListener);
       findViewById(R.id.btn_fitStart).setOnClickListener(clickListener);
       findViewById(R.id.btn_fitXY).setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
          ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
          switch (v.getId()){
              case R.id.btn_center:
                  scaleType = ImageView.ScaleType.CENTER;
                  break;
              case  R.id.btn_centerCrop:
                  scaleType = ImageView.ScaleType.CENTER_CROP;
                  break;
              case R.id.btn_centerInside:
                  scaleType = ImageView.ScaleType.CENTER_INSIDE;
                  break;
              case R.id.btn_fitCenter:
                  scaleType = ImageView.ScaleType.FIT_CENTER;
                  break;
              case  R.id.btn_fitEnd:
                  scaleType = ImageView.ScaleType.FIT_END;
                  break;
              case R.id.btn_fitStart:
                  scaleType = ImageView.ScaleType.FIT_START;
                  break;
              case  R.id.btn_fitXY:
                  scaleType = ImageView.ScaleType.FIT_XY;
                  break;
          }
          imageView.setScaleType(scaleType);
          textView.setText(((Button)v).getText());
        }
    };

    public void chuyenTrang(View view) {
        Intent intent =new Intent(MainActivity.this, Spiner.class);
        startActivity(intent);
    }
}