package com.example.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, correo, edad;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.editNombre);
        apellido = (EditText) findViewById(R.id.editApellido);
        correo = (EditText) findViewById(R.id.editCorreo);
        edad = (EditText) findViewById(R.id.editEdad);
        aceptar = (Button) findViewById(R.id.btnAceptar);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String name = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String email = correo.getText().toString();
                String age = edad.getText().toString();
                Intent i=new Intent(MainActivity.this,MostrarDatos.class);

                i.putExtra("name",name);
                i.putExtra("ape",ape);
                i.putExtra("email",email);
                i.putExtra("age",age);
            startActivity(i);
            }
        });
        }
    }
