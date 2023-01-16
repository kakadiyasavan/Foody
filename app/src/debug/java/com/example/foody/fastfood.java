package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class fastfood extends AppCompatActivity {

    LinearLayout mcdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);

        mcdi = findViewById(R.id.mcdi);

        mcdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(fastfood.this,mcdi.class);
                startActivity(intent);
            }
        });

        LinearLayout kfc;

        kfc = findViewById(R.id.kfc);

        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fastfood.this,kfc.class);
                startActivity(intent);
            }
        });

        LinearLayout pizza;

        pizza = findViewById(R.id.pizza);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fastfood.this,pizza.class);
                startActivity(intent);
            }
        });

        LinearLayout king;

        king = findViewById(R.id.king);

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fastfood.this,king.class);
                startActivity(intent);
            }
        });

        LinearLayout kola;

        kola = findViewById(R.id.kola);

        kola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fastfood.this,kola.class);
                startActivity(intent);
            }
        });

        LinearLayout buc;

        buc = findViewById(R.id.buc);

        buc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fastfood.this,buc.class);
                startActivity(intent);
            }
        });

    }
}