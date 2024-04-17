package com.jesusmanzano.libreria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    ImageButton boxset;
    ImageButton figuras;
    ImageButton mangas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        boxset = (ImageButton) findViewById(R.id.Boxset);
        figuras = (ImageButton) findViewById(R.id.Figuras);
        mangas = (ImageButton) findViewById(R.id.Mangas);


        boxset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBoxset = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intentBoxset);
            }
        });
        figuras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFiguras = new Intent(MainActivity3.this, MainActivity8.class);
                startActivity(intentFiguras);
            }
        });
        mangas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMangas = new Intent(MainActivity3.this, MainActivity12.class);
                startActivity(intentMangas);
            }
        });
    }
}
