package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PoupMenu extends AppCompatActivity {
    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poup_menu);
        btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }
    private void ShowMenu(){
        PopupMenu poupMenu = new PopupMenu(this, btnMenu);
        poupMenu.getMenuInflater().inflate(R.menu.menu_poup, poupMenu.getMenu());
        poupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuThem:
                        btnMenu.setText("Menu Thêm");
                        break;
                    case R.id.menuXoa:
                        btnMenu.setText("Menu Xoá");
                        break;
                    case R.id.menuSua:
                        btnMenu.setText("Menu Sửa");
                        break;

                }
                return false;
            }
        });
        poupMenu.show();
    }

}