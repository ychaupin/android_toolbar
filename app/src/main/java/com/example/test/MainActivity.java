package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = findViewById(R.id.etNombre);
        Toolbar myToolbar = findViewById(R.id.new_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void AbrirActivity2(View view) {
        String nombre = etNombre.getText().toString();
        Intent intent = new Intent(MainActivity.this, OtraActivity.class);
        intent.putExtra("nombre", nombre);
        startActivity(intent);
    }

    public void AbrirActivity3(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "(062)517727"));
        startActivity(intent);
    }
}