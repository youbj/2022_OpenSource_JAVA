package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageChange extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change);

        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        ImageView img1=findViewById(R.id.img1);
        ImageView img2=findViewById(R.id.img2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.cat);
                img2.setImageResource(0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setImageResource(R.drawable.cat);
                img1.setImageResource(0);
            }
        });


    }
}