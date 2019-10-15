package com.example.login;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PostRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_register);

        Bundle bundle = getIntent().getExtras();

        String nom = bundle.getString("nombre");
        String ape = bundle.getString("apellido");
        String cla = bundle.getString("clave");
        String cor = bundle.getString("correo");
        String fec = bundle.getString("fecha");

        TextView textViewNombre = (TextView) findViewById(R.id.nombre);
        TextView textViewApell = (TextView) findViewById(R.id.apellido);
        TextView textViewClave = (TextView) findViewById(R.id.clave);
        TextView textViewCorreo = (TextView) findViewById(R.id.correo);
        TextView textViewFecha = (TextView) findViewById(R.id.fecha);

        textViewNombre.setText(nom);
        textViewApell.setText(ape);
        textViewCorreo.setText(cor);
        textViewClave.setText(cla);
        textViewFecha.setText(fec);


    }
}
