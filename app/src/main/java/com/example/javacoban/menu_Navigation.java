package com.example.javacoban;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class menu_Navigation extends AppCompatActivity {
   private DrawerLayout mDrawer;
   private Toolbar toolbar;
   private NavigationView nvDrawer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_navigation);


        toolbar = findViewById(R.id.toolbar);
        mDrawer = findViewById(R.id.drawerlayout);
        nvDrawer = findViewById(R.id.nvView);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        setupDrawerContent(nvDrawer);
        loadFragment(new HomeFragment());
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                selectDrawerItem(item);
                return true;
            }
        });
    }
    public void selectDrawerItem(MenuItem menuItem){
        Fragment fragment;
        switch (menuItem.getItemId()){
            case R.id.home:
                fragment = new HomeFragment();
                loadFragment(fragment);
                break;
            case R.id.r1:
                fragment = new HomeFragment();
                loadFragment(fragment);
                break;
            case R.id.r2:
                fragment = new HomeFragment();
                loadFragment(fragment);
                break;
            case R.id.r3:
                fragment = new HomeFragment();
                loadFragment(fragment);
                break;
            default:
                fragment = new HomeFragment();
                loadFragment(fragment);
        }
        menuItem.setCheckable(true);
        setTitle(menuItem.getTitle());
        mDrawer.closeDrawers();
    }

    private void loadFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.flContent, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}