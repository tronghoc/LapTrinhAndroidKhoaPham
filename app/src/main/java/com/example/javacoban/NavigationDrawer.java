package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class NavigationDrawer extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ListView listView;
    NavigationView navigationView;
    ArrayList<ItemMenu> arrayList;
    MenuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        anhXa();
        actionToolBar();
        actionMenu();
    }

    private void actionMenu() {
        arrayList = new ArrayList<>();
        arrayList.add(new ItemMenu("import", R.drawable.ic_down));
        arrayList.add(new ItemMenu("Gallery", R.drawable.ic_next_foreground));
        arrayList.add(new ItemMenu("Slideshow", R.drawable.ic_baseline_person_24));
        arrayList.add(new ItemMenu("Tools", R.drawable.ic_next_foreground));
        adapter = new MenuAdapter(this, R.layout.dong_item, arrayList);
        listView.setAdapter(adapter);
    }

    private void actionToolBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });
    }

    private void anhXa(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        listView = (ListView) findViewById(R.id.lv);

    }


}