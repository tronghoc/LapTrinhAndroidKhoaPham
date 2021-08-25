package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.threeten.bp.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class TaoSoNgauNhieu extends AppCompatActivity {
    TextView txtRadom;
    EditText editMax;
    EditText editMin;
    Button btnNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_so_ngau_nhieu);
        txtRadom = (TextView) findViewById(R.id.txtRadom);
        btnNhap = (Button) findViewById(R.id.btnRadom);
        editMax = (EditText) findViewById(R.id.editMax);
        editMin = (EditText) findViewById(R.id.editMin);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    Random random = new Random();
//                    int number = random.nextInt(100);
//                    txtRadom.setText(number + "");
                String chuoiMin = editMin.getText().toString();
                String chuoiMax = editMax.getText().toString();
                if(chuoiMin.isEmpty() || chuoiMax.length() == 0)
                {
                    Toast.makeText(TaoSoNgauNhieu.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                }else {
                    int min = Integer.parseInt(chuoiMin);
                    int max = Integer.parseInt(chuoiMax);
                    if(min<max) {
                        Random random = new Random();
                        int number = random.nextInt(max - min + 1) + min;
                        txtRadom.setText(String.valueOf(number));
                    }else {
                        Toast.makeText(TaoSoNgauNhieu.this, "Vui lòng nhập đúng thứ tự số", Toast.LENGTH_SHORT).show();
                    }
//                LocalTime time = LocalTime.now();
//                String a = time.toString();
//                txtRadom.setText(a);
                }
            }
        });
    }
//    public static void nextRadom(int min, int max){
//        Random random = new Random();
//        edi
//    }
}