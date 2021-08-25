package com.example.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ontapSpinner extends AppCompatActivity {
   Spinner classSpinner, divSpinner;
   String seletedClass, selectedDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ontap_spinner);
        classSpinner = (Spinner) findViewById(R.id.classSpinner);
        divSpinner = (Spinner) findViewById(R.id.divSpinner);
        classSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String selectedClass = parent.getItemAtPosition(position).toString();
               switch (selectedClass){
                   case "Case 1":
                       divSpinner.setAdapter(new ArrayAdapter<String>(ontapSpinner.this,
                               android.R.layout.simple_spinner_dropdown_item,
                               getResources().getStringArray(R.array.items_div_class_1)));
                       break;
                   case "Case 2":
                       divSpinner.setAdapter(new ArrayAdapter<String>(ontapSpinner.this,
                               android.R.layout.simple_spinner_dropdown_item,
                               getResources().getStringArray(R.array.items_div_class_2)));
                       break;
                   case "Case 3":
                       divSpinner.setAdapter(new ArrayAdapter<String>(ontapSpinner.this,
                               android.R.layout.simple_spinner_dropdown_item,
                               getResources().getStringArray(R.array.items_div_class_3)));
                       break;
                   case "Case 4":
                       divSpinner.setAdapter(new ArrayAdapter<String>(ontapSpinner.this,
                               android.R.layout.simple_spinner_dropdown_item,
                               getResources().getStringArray(R.array.items_div_class_4)));
                       break;
               }
               divSpinner.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        divSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             selectedDiv = parent.getItemAtPosition(position).toString();
                Toast.makeText(ontapSpinner.this, "\n Class: \t" + seletedClass +
                        "\n Div: \t" + selectedDiv, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}