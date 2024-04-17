package com.jesusmanzano.libreria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main5);


        pagar = findViewById(R.id.pagar);
        agregar =  findViewById(R.id.agregar);
        quitar =  findViewById(R.id.Quitar);
        cantidad =  findViewById(R.id.cantidad);
        total =  findViewById(R.id.total);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intentSora);
            }
        });
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPagar = new Intent(MainActivity5.this, MainActivity4.class);//falta el mainde pago
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

    //  actualizar el TextView total
    private void actualizarTotal() {
        int TotalpagarBoxsetLasquintillizas = cantidadBoxset * 1726;
        total.setText("Total: " + TotalpagarBoxsetLasquintillizas);

        // Guardar el total en SharedPreferences
        SharedPreferences prefs = getSharedPreferences("PreferenciasDePago", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("TotalpagarBoxsetLasquintillizas", TotalpagarBoxsetLasquintillizas);
        editor.apply(); // Guardar los cambios
    }
}