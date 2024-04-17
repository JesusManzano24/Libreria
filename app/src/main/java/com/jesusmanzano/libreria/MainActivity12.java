package com.jesusmanzano.panaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity12 extends AppCompatActivity {
    ImageButton Spy;
    ImageButton Atras;
    ImageButton wenever;
    ImageButton Kaguya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);


        Spy = findViewById(R.id.spy);
        wenever = findViewById(R.id.Figuras);
        Kaguya = findViewById(R.id.kaguya1);
        Atras = findViewById(R.id.atras2);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity12.this, MainActivity3.class);
                startActivity(intentSora);
            }
        });
        Spy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBoxset = new Intent(MainActivity12.this, MainActivity13.class);
                startActivity(intentBoxset);
            }
        });

        wenever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFiguras = new Intent(MainActivity12.this, MainActivity14.class);
                startActivity(intentFiguras);
            }
        });
        Kaguya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMangas = new Intent(MainActivity12.this, MainActivity15.class);
                startActivity(intentMangas);
            }
        });
    }
}
