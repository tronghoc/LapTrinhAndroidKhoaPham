package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView rvitems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Long", true));
        people.add(new Person("My", false));
        people.add(new Person("Duong", true));
        people.add(new Person("Duyen", false));

        rvitems = findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvitems.setLayoutManager(layoutManager);
        rvitems.setHasFixedSize(true);
        rvitems.setAdapter(new RecyclerDataAdapter(this, people));
    }
}