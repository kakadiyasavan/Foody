package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class food extends AppCompatActivity {

    RelativeLayout fastfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        fastfood = findViewById(R.id.fastfood);

        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(food.this,fastfood.class);
                startActivity(intent);

            }
        });

        RelativeLayout discount;

        discount = findViewById(R.id.discount);

        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this,discount.class);
                startActivity(intent);
            }
        });

        RelativeLayout india;

        india = findViewById(R.id.india);

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this,india.class);
                startActivity(intent);
            }
        });

        RelativeLayout gujrati;

        gujrati = findViewById(R.id.gujrati);

        gujrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this,gujrati.class);
                startActivity(intent);
            }
        });
    }
}