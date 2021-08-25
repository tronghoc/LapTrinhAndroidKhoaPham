package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CuocDuaKyThu extends AppCompatActivity {
    TextView textDiemSo;
    ImageButton btnPlay;
    CheckBox cbOne, cbTwo, cbThree;
    SeekBar sbOne, sbTwo, sbThree;
    int soDiem = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuoc_dua_ky_thu);
        AnhXa();
        sbTwo.setEnabled(false);
        sbOne.setEnabled(false);
        sbThree.setEnabled(false);
        textDiemSo.setText(soDiem + "");
        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number = 5;
                Random random = new Random();
                int One = random.nextInt(number);
                int Two = random.nextInt(number);
                int Three = random.nextInt(number);
                //Kiểm tra Win One
                if(sbOne.getProgress() >= sbOne.getMax())
                {
                    this.cancel();
                    Toast.makeText(CuocDuaKyThu.this, "One Win", Toast.LENGTH_LONG).show();
                    btnPlay.setVisibility(View.VISIBLE);
                    if(cbOne.isChecked()){
                        soDiem +=10;
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán chính xác", Toast.LENGTH_LONG).show();
                    }else {
                        soDiem -=5;
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán sai", Toast.LENGTH_LONG).show();
                    }
                    textDiemSo.setText(soDiem + "");
                    EnableCheckBox();
                }
                //Kiểm tra Win Two
                if(sbTwo.getProgress() >= sbTwo.getMax()){
                    this.cancel();
                    Toast.makeText(CuocDuaKyThu.this, "Two Win", Toast.LENGTH_LONG).show();
                    btnPlay.setVisibility(View.VISIBLE);
                    if(cbTwo.isChecked()){
                        soDiem +=10;
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán chính xác", Toast.LENGTH_LONG).show();
                    }else {
                        soDiem -=5;
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán sai", Toast.LENGTH_LONG).show();
                    }
                    textDiemSo.setText(soDiem + "");
                    EnableCheckBox();
                }
                //Kiểm tra Win Three
                if(sbThree.getProgress() >= sbThree.getMax()){
                    this.cancel();
                    Toast.makeText(CuocDuaKyThu.this, "Three Win", Toast.LENGTH_LONG).show();
                    btnPlay.setVisibility(View.VISIBLE);
                    if(cbThree.isChecked()){
                        soDiem +=10;
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán chính xác", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(CuocDuaKyThu.this, "Bạn đoán sai", Toast.LENGTH_LONG).show();
                        soDiem -=5;
                    }
                    textDiemSo.setText(soDiem + "");
                    EnableCheckBox();
                }
                sbOne.setProgress(sbOne.getProgress() + One);
                sbTwo.setProgress(sbTwo.getProgress() + Two);
                sbThree.setProgress(sbThree.getProgress() + Three);
            }

            @Override
            public void onFinish() {

            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbOne.isChecked() || cbTwo.isChecked() || cbThree.isChecked())
                {
                    sbOne.setProgress(0);
                    sbThree.setProgress(0);
                    sbTwo.setProgress(0);
                    btnPlay.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    DisableCheckBox();
                }else {
                    Toast.makeText(CuocDuaKyThu.this, "Vui lòng đặt cược trước khi chơi!.", Toast.LENGTH_LONG).show();
                }

            }
        });
        cbOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    //Bỏ check 2,3
                    cbTwo.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbOne.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbOne.setChecked(false);
                    cbTwo.setChecked(false);
                }
            }
        });
    }
    private void  EnableCheckBox(){
        cbOne.setEnabled(true);
        cbTwo.setEnabled(true);
        cbThree.setEnabled(true);
    }
    private void DisableCheckBox(){
        cbOne.setEnabled(false);
        cbTwo.setEnabled(false);
        cbThree.setEnabled(false);
    }
    private  void AnhXa()
    {
        textDiemSo =(TextView) findViewById(R.id.txtDiemSo);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        cbOne = (CheckBox) findViewById(R.id.checkBoxOne);
        cbTwo = (CheckBox) findViewById(R.id.checkBoxTwo);
        cbThree = (CheckBox) findViewById(R.id.checkBoxThree);
        sbOne = (SeekBar) findViewById(R.id.seebarOne);
        sbTwo = (SeekBar) findViewById(R.id.seebarTwo);
        sbThree = (SeekBar) findViewById(R.id.seebarThree);
    }
}