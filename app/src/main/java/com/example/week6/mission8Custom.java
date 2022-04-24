package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mission8Custom extends AppCompatActivity {

    Button cmenuBtn;
    Button clogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_custom);

        cmenuBtn = findViewById(R.id.cmenuButton);
        clogBtn = findViewById(R.id.cloginButton);

        cmenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mission8.class);
                startActivity(intent);
                finish();
            }
        });

        clogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mission8Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}