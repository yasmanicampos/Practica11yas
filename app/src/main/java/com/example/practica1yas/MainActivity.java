package com.example.practica1yas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ednombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clic (View vista){
     ednombre = findViewById(R.id.et_name);
     String  nombre = String.valueOf(ednombre.getText());
        Toast.makeText(getBaseContext(),"Hola" + nombre,Toast.LENGTH_SHORT).show();
        
    }
}