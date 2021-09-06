package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppToanCau extends AppCompatActivity {
    TextView txtThongTin;
    Button btnXacNhan;
    EditText edtHoTen, edtSoDienThoai, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_toan_cau);
       Anhxa();
       btnXacNhan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String hoten = edtHoTen.getText().toString();
               String sodienthoai = edtSoDienThoai.getText().toString();
               String email = edtEmail.getText().toString();
               txtThongTin.setText("Chào bạn: " + hoten +
                       "\nEmail: " + email +
                       "\nSố điện thoại: " + sodienthoai);
           }
       });
    }

    private void Anhxa() {
        edtHoTen = findViewById(R.id.editHoTen);
        edtSoDienThoai = findViewById(R.id.editNhapsodienthoai);
        edtEmail = findViewById(R.id.editEmail);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        txtThongTin = findViewById(R.id.textMessage);
    }

}