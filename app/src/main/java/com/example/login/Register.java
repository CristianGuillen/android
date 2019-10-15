package com.example.login;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class Register extends AppCompatActivity {
    private EditText nombre,apellido,clave,correo,fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nombre  = (EditText) findViewById(R.id.editText5);
        apellido = (EditText) findViewById(R.id.editText6);
        clave = (EditText) findViewById(R.id.editText7);
        correo = (EditText) findViewById(R.id.editText8);
        fecha = (EditText) findViewById(R.id.editText9);
    }
    public void PostRegister(View view) {
        // Do something in response to button

        //end calendar
        String nomb = nombre.getText().toString();
        String apell = apellido.getText().toString();
        String clav= clave.getText().toString();
        String corr= correo.getText().toString();
        String fech = fecha.getText().toString();

        //cargar la ventana
        Intent intent = new Intent(this, PostRegister.class);
        Bundle bundle = new Bundle();

        bundle.putString("nombre", nomb);
        bundle.putString("apellido", apell);
        bundle.putString("clave", clav);
        bundle.putString("correo", corr);
        bundle.putString("fecha", fech);

        intent.putExtras(bundle);

        startActivity(intent);

    }
    public void MostrarCalendario(View view)
    {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String formatedDay = (dayOfMonth < 10) ?
                        "0" + String.valueOf(dayOfMonth) : String.valueOf(dayOfMonth);
                String formatedMonth = (month < 10) ?
                        "0" + String.valueOf(month) : String.valueOf(month);

                fecha.setText(formatedDay + "/" + formatedMonth + "/" + year);
            }
        };

        DatePickerDialog dialog = new DatePickerDialog(
                this, dateSetListener, year, month, day);
        dialog.show();
    }
}
