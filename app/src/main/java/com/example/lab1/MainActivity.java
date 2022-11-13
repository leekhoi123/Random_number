package com.example.lab1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
    Button btnRandom;
    ImageView imgRandom;
    private void innitControl()
    {
        imgRandom = findViewById(R.id.imgRandom);
        btnRandom = findViewById(R.id.btnRandom);
        btnRandom.setOnClickListener(v -> {
            Random generator = new Random();
            int values = generator.nextInt(100);
            ;
        });
    }
}