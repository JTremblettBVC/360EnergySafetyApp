package com.example.a360energysafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrePlanningFieldLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_planning_field_level);
       // getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.navy_360)));

        Button vskChecklist = findViewById(R.id.vskChecklist);

        vskChecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrePlanningFieldLevel.this, VehicleSafetyKitChecklist.class);
                startActivity(intent);


            }
        });



    }
}