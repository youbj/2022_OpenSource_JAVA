package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Practice5_2 extends AppCompatActivity {
    public static final int sub = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_practice52);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);

        EditText edit= new EditText(this);

        Button btn=new Button(this);
        btn.setText("CLICK");
        btn.setBackgroundColor(Color.rgb(255,225,50));

        TextView tv=new TextView(this);
        TextView ttt=new TextView(this);
        ttt.setText("20180338053 유병주");
        tv.setTextColor(Color.rgb(20,200,255));
        tv.setTextSize(20);

        baseLayout.addView(edit);
        baseLayout.addView(btn);
        baseLayout.addView(ttt);
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b=edit.getText().toString();
                tv.setText(b);
            }
        });

        Button btnNext =new Button(this);
        btnNext.setText("다음과제로 이동");
        btnNext.setBackgroundColor(Color.WHITE);
        baseLayout.addView(btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Practice5_3.class);
                startActivityForResult(intent,sub);
            }
        });
    }
}