package com.jesusmanzano.libreria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity13 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main13);


        pagar = (Button) findViewById(R.id.pagar);
        agregar = (Button) findViewById(R.id.agregar);
        quitar = (Button) findViewById(R.id.Quitar);
        cantidad = (TextView) findViewById(R.id.cantidad);
        total = (TextView) findViewById(R.id.total);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity13.this, MainActivity12.class);
                startActivity(intentSora);
            }
        });
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPagar = new Intent(MainActivity13.this, MainActivity4.class);//falta el mainde pago
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
        int TotalpagarMangaSpyxFamily = cantidadFiguras * 169;
        total.setText("Total: " + TotalpagarMangaSpyxFamily);


        SharedPreferences prefs = getSharedPreferences("PreferenciasDePago", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("TotalpagarMangaSpyxFamily", TotalpagarMangaSpyxFamily);
        editor.apply();
    }
}