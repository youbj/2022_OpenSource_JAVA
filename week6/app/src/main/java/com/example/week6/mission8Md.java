package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mission8Md extends AppCompatActivity {

    Button mmenuButton;
    Button mloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_md);

        mmenuButton = findViewById(R.id.mmenuButton);
        mloginButton = findViewById(R.id.mloginButton);

        mmenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8.class);
                startActivity(intent);
                finish();
            }
        });

        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}