package com.jesusmanzano.libreria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button inicio;
    Button registro;
    EditText user;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicio = findViewById(R.id.Inicio);
        registro = findViewById(R.id.Registro);
        user = findViewById(R.id.user);
        password = findViewById(R.id.password);


        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener las credenciales ingresadas
                String usuarioIngresado = user.getText().toString();
                String contraseñaIngresada = password.getText().toString();

                // Verificar las credenciales
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
                String usuarioGuardado = prefs.getString("usuario", "");
                String contraseñaGuardada = prefs.getString("contraseña", "");

                // Si las credenciales coinciden, iniciar nueva Activity
                if(usuarioIngresado.equals(usuarioGuardado) && contraseñaIngresada.equals(contraseñaGuardada)) {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
