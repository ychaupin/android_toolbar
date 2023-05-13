package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        String nombre = getIntent().getExtras().getString("nombre");
        TextView tvNombre = findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);
    }
}