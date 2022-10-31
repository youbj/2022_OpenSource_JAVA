package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mission8 extends AppCompatActivity {
    Button consBtn;
    Button salesBtn;
    Button mdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8);

        consBtn = findViewById(R.id.customButton);
        salesBtn = findViewById(R.id.salesButton);
        mdBtn = findViewById(R.id.mdButton);


        Intent intent = new Intent();
        intent = getIntent();
        String id = intent.getStringExtra("id");
        String password = intent.getStringExtra("password");

        if(id != null)
        {
            Toast toast =
                    Toast.makeText(getApplicationContext(),"ID : "+id +" Password : "+password +" 으로 로그인 됨!",Toast.LENGTH_LONG);
            toast.show();
        }


        consBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mission8Custom.class);
                startActivity(intent);
                finish();
            }
        });

        salesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8Sales.class);
                startActivity(intent);
                finish();
            }
        });

        mdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mission8Md.class);
                startActivity(intent);
                finish();
            }
        });
    }
}