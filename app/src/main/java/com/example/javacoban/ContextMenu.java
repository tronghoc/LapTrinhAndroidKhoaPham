package com.example.javacoban;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContextMenu extends AppCompatActivity {
    Button btnContextMenu;
    android.widget.RelativeLayout manHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        btnContextMenu = (Button) findViewById(R.id.btnContextMenu);
        manHinh =(android.widget.RelativeLayout) findViewById(R.id.manHinh1);
        //đăng ký view cho context (Phải giữ 2 giây mới lên)
        registerForContextMenu(btnContextMenu);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
        menu.setHeaderTitle("Chọn màu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuDo:
                manHinh.setBackgroundColor(Color.RED);
                break;
            case R.id.menuVang:
                manHinh.setBackgroundColor(Color.YELLOW);
               break;
            case R.id.menuXanh:
                manHinh.setBackgroundColor(Color.BLUE);
                break;

        }
        return super.onContextItemSelected(item);
    }
}