package com.jesusmanzano.libreria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {
    ImageButton Atras;
    Button pagar;
    Button agregar;
    Button quitar;
    TextView cantidad;
    TextView total;
    int cantidadFiguras = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        pagar = (Button) findViewById(R.id.pagar);
        agregar = (Button) findViewById(R.id.agregar);
        quitar = (Button) findViewById(R.id.Quitar);
        cantidad = (TextView) findViewById(R.id.cantidad);
        total = (TextView) findViewById(R.id.total);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity10.this, MainActivity8.class);
                startActivity(intentSora);
            }
        });
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPagar = new Intent(MainActivity10.this, MainActivity4.class);//falta el mainde pago
                startActivity(intentPagar);
            }
        });
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadFiguras++;
                cantidad.setText("Cantidad: " + cantidadFiguras);
                actualizarTotal();
            }
        });
        quitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadFiguras > 0) {
                    cantidadFiguras--;
                    cantidad.setText("Cantidad: " + cantidadFiguras);
                    actualizarTotal();
                }
            }
        });
    }

    private void actualizarTotal() {
        int TotalpagarFiguraKurumi = cantidadFiguras * 4237;
        total.setText("Total: " + TotalpagarFiguraKurumi);

        // Guardar el total en SharedPreferences
        SharedPreferences prefs = getSharedPreferences("PreferenciasDePago", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("TotalpagarFiguraKurumi", TotalpagarFiguraKurumi);
        editor.apply(); // Guardar los cambios
    }
}