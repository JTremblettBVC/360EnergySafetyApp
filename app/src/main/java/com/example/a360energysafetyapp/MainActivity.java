package com.example.a360energysafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Buttons
       Button btnFDoS = findViewById(R.id.btnFDoS);
       Button btnPlanningField = findViewById(R.id.btnPlanningField);
       Button btnThroughout = findViewById(R.id.btnThroughout);
       Button btnPost = findViewById(R.id.btnPost);

        btnFDoS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, FirstDayOnSite.class);
               startActivity(intent);
            }
        });

        btnPlanningField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrePlanningFieldLevel.class);
                startActivity(intent);
            }
        });

        btnThroughout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThroughoutProject.class);
                startActivity(intent);
            }
        });

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PostProjectWA.class);
                startActivity(intent);
            }
        });

    }
}