package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String color[] = {"red", "blue", "orange", "white"};
    Spinner ddl_color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ddl_color = findViewById(R.id.ddl_color);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, color);
        ddl_color.setAdapter(arrayAdapter);
        String colorName = ddl_color.getSelectedItem().toString();
        Toast.makeText(this, colorName + " is selected", Toast.LENGTH_SHORT).show();
    }
}