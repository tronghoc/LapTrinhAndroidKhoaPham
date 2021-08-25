package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class HocProgressBar extends AppCompatActivity {
    Button btnDowload;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_progress_bar);
        btnDowload = (Button) findViewById(R.id.btnDowload);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnDowload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //10000: 10giay tổng thời gian đếm ngược
                //1000: 1 giây --> thời gian lặp lại 1 hành động nào đó.
                CountDownTimer countDownTimer = new CountDownTimer(10000,500) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int current = progressBar.getProgress();
                        int seCondary = progressBar.getSecondaryProgress();
                        if(current >= progressBar.getMax())
                        {
                            current = 0;
                            seCondary = 20;
                        }
                        progressBar.setProgress(current + 10);
                        progressBar.setSecondaryProgress(seCondary + 10);
                    }

                    @Override
                    public void onFinish() {
                        this.start();
                        Toast.makeText(HocProgressBar.this, "Hết giờ", Toast.LENGTH_SHORT).show();
                    }
                };
               countDownTimer.start();
            }
        });
    }
}