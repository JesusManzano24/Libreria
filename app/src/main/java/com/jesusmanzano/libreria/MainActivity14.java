package com.jesusmanzano.libreria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity14 extends AppCompatActivity {
    ImageButton Atras;
    Button pagar;
    Button agregar;
    Button quitar;
    TextView cantidad;
    TextView total;
    int cantidadBoxset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);


        pagar = findViewById(R.id.pagar);
        agregar =  findViewById(R.id.agregar);
        quitar =  findViewById(R.id.Quitar);
        cantidad =  findViewById(R.id.cantidad);
        total =  findViewById(R.id.total);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity14.this, MainActivity12.class);
                startActivity(intentSora);
            }
        });
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPagar = new Intent(MainActivity14.this, MainActivity16.class);
                startActivity(intentPagar);
            }
        });
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadBoxset++;
                cantidad.setText("Cantidad: " + cantidadBoxset);
                actualizarTotal();
            }
        });
        quitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadBoxset > 0) {
                    cantidadBoxset--;
                    cantidad.setText("Cantidad: " + cantidadBoxset);
                    actualizarTotal();
                }
            }
        });
    }
    private void actualizarTotal() {
        int TotalpagarMangawenever = cantidadBoxset * 129;
        total.setText("Total: " + TotalpagarMangawenever);

        SharedPreferences prefs = getSharedPreferences("PreferenciasDePago", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("TotalpagarMangawenever", TotalpagarMangawenever);
        editor.apply(); // Guardar los cambios
    }
}