package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1_1 extends AppCompatActivity {
    EditText edit1,edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnRes;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        setTitle("초간단 계산기");

        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText) findViewById(R.id.Edit2);
        btnAdd=(Button)findViewById(R.id.BtnAdd);
        btnSub=(Button)findViewById(R.id.BtnSub);
        btnMul=(Button)findViewById(R.id.BtnMul);
        btnDiv=(Button)findViewById(R.id.BtnDiv);
        btnRes=(Button)findViewById(R.id.BtnRes);
        textResult=(TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                String result = Float.toString(num1+num2);
                
                textResult.setText(result);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                String result = Float.toString(num1-num2);
                textResult.setText(result);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                String result = Float.toString(num1*num2);
                textResult.setText(result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                String result = Float.toString(num1/num2);
                textResult.setText(result);
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(edit1.getText().toString());
                float num2=Float.parseFloat(edit2.getText().toString());
                String result = Float.toString(num1%num2);
                textResult.setText(result);
            }
        });


    }
}