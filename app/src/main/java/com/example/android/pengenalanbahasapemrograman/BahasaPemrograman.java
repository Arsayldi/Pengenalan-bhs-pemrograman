package com.example.android.pengenalanbahasapemrograman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BahasaPemrograman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahasa_pemrograman);

        Button menuButton = findViewById(R.id.btn_pascal);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),pascal.class);
                startActivity(intent);
            }
        });

        Button menuButton2 = findViewById(R.id.btn_cpp);
        menuButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),cpp.class);
                startActivity(intent);
            }
        });

        Button menuButton3 = findViewById(R.id.btn_java);
        menuButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),java.class);;
                startActivity(intent);
            }
        });

        Button menuButton4 = findViewById(R.id.btn_ruby);
        menuButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ruby.class);
                startActivity(intent);
            }
        });

        Button menuButton5 = findViewById(R.id.btn_python);
        menuButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),python.class);
                startActivity(intent);
            }
        });

    }
}