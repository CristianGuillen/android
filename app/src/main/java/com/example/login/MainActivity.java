package com.example.login;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private EditText  unsuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Action(View view) {
        // Do something in response to button
        unsuario  = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.editText4);
       String user = unsuario.getText().toString();
       String pass = password.getText().toString();
       if(user.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin"))
       {
           //cargar la ventana
           Intent intent = new Intent(this, PaginaInicio.class);
           startActivity(intent);

       }
        else
           {
           //mostrar mensaje de error

           }
    }
    public void ForgotPass(View view) {
        // Do something in response to button
        //cargar la ventana "Olvide la clave"
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);

    }
    public void Register(View view) {
        // Do something in response to button
        //cargar la ventana "registrar"
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);

    }

}
