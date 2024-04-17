package com.jesusmanzano.libreria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {
    ImageButton Atras;
    ImageButton Yami;
    ImageButton kurumi;
    ImageButton koneko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        Yami =  findViewById(R.id.Yami);
        kurumi =  findViewById(R.id.Kurumi);
        koneko =  findViewById(R.id.Koneko);
        Atras = findViewById(R.id.atras);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSora = new Intent(MainActivity8.this, MainActivity3.class);
                startActivity(intentSora);
            }
        });
        Yami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBoxset = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(intentBoxset);
            }
        });
        kurumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFiguras = new Intent(MainActivity8.this, MainActivity10.class);
                startActivity(intentFiguras);
            }
        });

        // Configurar el OnClickListener para mangas
        koneko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMangas = new Intent(MainActivity8.this, MainActivity11.class);
                startActivity(intentMangas);
            }
        });
    }
}
