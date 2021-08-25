package com.example.javacoban;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConstraintLayout extends AppCompatActivity {
    TextView textView;
    TextView textLink;
    Button btnDangNhap;
    EditText editTaiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        textView = (TextView) findViewById(R.id.txtError);
        textLink = (TextView) findViewById(R.id.txtLink);
        editTaiKhoan = (EditText) findViewById(R.id.editTextTextPersonName);
        String value = "<html><font color=\"white\">Thông tin liên hệ</font> <a href=\"http://www.facebook.com\">Facebook</a></html>";
        textLink.setText(Html.fromHtml(value));
        textLink.setMovementMethod(LinkMovementMethod.getInstance());
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Tài khoản hoặc mật khẩu không đúng");
                String noidung = editTaiKhoan.getText().toString();
                Toast.makeText(ConstraintLayout.this, noidung, Toast.LENGTH_LONG).show();
            }
        });
    }
}