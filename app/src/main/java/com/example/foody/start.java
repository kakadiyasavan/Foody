package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;

public class start extends AppCompatActivity {

ImageButton logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        logo = findViewById(R.id.logo);


        Intent intent = new Intent(start.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {startActivity(intent);

            }
        },2000);
    }
}