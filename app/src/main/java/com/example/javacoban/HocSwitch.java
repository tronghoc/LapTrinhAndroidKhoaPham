package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class HocSwitch extends AppCompatActivity {
    Switch aSwitch;
    TextView textView1;
    CheckBox cbIOS, cbAndroid;
    RadioGroup radioGroup;
    RadioButton radioSang, radioTrua, radioToi;
    Button btnXN;
    Button btnRadioCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_switch);
        aSwitch = (Switch) findViewById(R.id.SwitchWifi);
        textView1 = (TextView) findViewById(R.id.txtMau);
        btnXN = (Button) findViewById(R.id.btnXacNhan);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        btnRadioCheck = (Button) findViewById(R.id.btnCheck);
        radioSang = (RadioButton) findViewById(R.id.radioSang);
        radioTrua = (RadioButton) findViewById(R.id.radioTrua);
        radioToi = (RadioButton) findViewById(R.id.radioToi);
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc = "Bạn đã chọn môn học: \n";
                if(cbAndroid.isChecked())
                {
                    monhoc += cbAndroid.getText() + "\n";
                }
                if(cbIOS.isChecked())
                {
                    monhoc +=cbIOS.getText() + "\n";
                }
                Toast.makeText(HocSwitch.this, monhoc, Toast.LENGTH_SHORT).show();
            }
        });
        Anhxa();
        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(HocSwitch.this, "Bạn đã chọn Android", Toast.LENGTH_SHORT).show();
                }else
                    {
                        Toast.makeText(HocSwitch.this, "Bạn bỏ chọn Android", Toast.LENGTH_SHORT).show();
                    }
            }
        });
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    String noidung = "Bật mở WIFI";
                    Toast.makeText(HocSwitch.this,noidung , Toast.LENGTH_SHORT).show();
                    textView1.setText("Trọng Học");
                }
                else
                    {
                        Toast.makeText(HocSwitch.this, "Bạn đã tắt WIFI", Toast.LENGTH_SHORT).show();
                        textView1.setText("Trọng Học2");

                    }

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId)
               {
                   case R.id.radioSang:
                       Toast.makeText(HocSwitch.this, "Bạn chọn sáng", Toast.LENGTH_SHORT).show();
                   break;

                   case  R.id.radioTrua:
                       Toast.makeText(HocSwitch.this, "Bạn chọn trưa", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.radioToi:
                       Toast.makeText(HocSwitch.this, "Bạn chọn tối", Toast.LENGTH_SHORT).show();
                       break;
               }
            }
        });
        btnRadioCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioSang.isChecked())
                {
                    Toast.makeText(HocSwitch.this, radioSang.getText(), Toast.LENGTH_SHORT).show();
                }
                if(radioTrua.isChecked())
                {
                    Toast.makeText(HocSwitch.this, radioTrua.getText(), Toast.LENGTH_SHORT).show();
                }
                if(radioToi.isChecked())
                {
                    Toast.makeText(HocSwitch.this, radioToi.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa()
    {
        cbIOS = (CheckBox) findViewById(R.id.checkIOS);
        cbAndroid = (CheckBox) findViewById(R.id.checkAndroid);
    }
}