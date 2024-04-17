package com.jesusmanzano.panaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    ImageButton Atras;
    Button pagar;
    Button agregar;
    Button quitar;
    TextView cantidad;
    TextView total;
    int cantidadMangas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);


        pagar = findViewById(R.id.pagar);
        agregar =  findViewById(R.id.agregar);
        quitar =  findViewById(R.id.Quitar);
        cantidad =  findViewById(R.id.cantidad);
        total =  findViewById(R.id.total);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity15.this, MainActivity12.class);
                startActivity(intentSora);
            }
        });
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPagar = new Intent(MainActivity15.this, MainActivity4.class);//falta el mainde pago
                startActivity(intentPagar);
            }
        });
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadMangas++;
                cantidad.setText("Cantidad: " + cantidadMangas);
                actualizarTotal();
            }
        });
        quitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadMangas > 0) {
                    cantidadMangas--;
                    cantidad.setText("Cantidad: " + cantidadMangas);
                    actualizarTotal();
                }
            }
        });
    }
    private void actualizarTotal() {
        int TotalpagarMangakaguya = cantidadMangas * 139;
        total.setText("Total: " + TotalpagarMangakaguya);

        SharedPreferences prefs = getSharedPreferences("PreferenciasDePago", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("TotalpagarMangakaguya", TotalpagarMangakaguya);
        editor.apply(); // Guardar los cambios
    }
}