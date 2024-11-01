package com.example.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellido, tvcorreo, tvedad;
    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre =(TextView)findViewById(R.id.tvNombre);
        tvapellido =(TextView)findViewById(R.id.tvApellido);
        tvcorreo =(TextView)findViewById(R.id.tvCorreo);
        tvedad =(TextView)findViewById(R.id.tvEdad);
        btnOk= (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener (new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                Intent intent= new Intent(MostrarDatos.this, MainActivity.class);

                startActivity(intent);
            }
        });
             mostrarDato();
    }

    private void mostrarDato() {
    Bundle datos=this.getIntent().getExtras();
    String nombre=datos.getString("name");
    String apellido=datos.getString("ape");
    String correo=datos.getString("email");
    String edad=datos.getString("age");

    tvnombre.setText(nombre);
    tvapellido.setText(apellido);
    tvcorreo.setText(correo);
    tvedad.setText(edad);
    }
}