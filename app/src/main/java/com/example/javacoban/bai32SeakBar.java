package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class bai32SeakBar extends AppCompatActivity {

    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai32_seak_bar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("AAA", "Giá trị: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
              Log.d("AAA", "START");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
             Log.d("AAA", "STOP");
            }
        });
    }
}