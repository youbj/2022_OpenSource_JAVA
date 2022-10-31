package com.example.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button1;
    Button button2;

    private RadioGroup rg;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        EditText editText = (EditText)findViewById(R.id.editText);
        rg= (RadioGroup)findViewById((R.id.radioGroup));
        img=(ImageView)findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),editText.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(mIntent);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radio, int i) {
                String result;
                if(i==R.id.radioButton ){
                    img.setImageResource(R.drawable.jisu);
                }else{
                    img.setImageResource(R.drawable.karina);
                }
            }
        });
    }

}