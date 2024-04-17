package com.jesusmanzano.libreria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {
    ImageButton lasQuintillizas;
    ImageButton high;
    ImageButton Sora;
    ImageButton Atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        lasQuintillizas =  findViewById(R.id.qintillizas);
        high =  findViewById(R.id.high);
        Sora =  findViewById(R.id.sora);
        Atras = findViewById(R.id.atras);


        lasQuintillizas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLasQuintillizas = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intentLasQuintillizas);
            }
        });
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHigh = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intentHigh);
            }
        });
        Sora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity4.this, MainActivity7.class);
                startActivity(intentSora);
            }
        });
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intentSora);
            }
        });
    }
}