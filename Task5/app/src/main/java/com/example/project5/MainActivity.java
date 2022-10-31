package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int sub = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(100,155,100));
        setContentView(baseLayout,params);

        Button btn =new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);


        TextView tv=new TextView(this);
        tv.setText("2018038053유병주");
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Java코드로 생성한 버튼입니다",Toast.LENGTH_SHORT).show();
            }
        });
        Button btnNext =new Button(this);
        btnNext.setText("다음과제로 이동");
        btnNext.setBackgroundColor(Color.WHITE);
        baseLayout.addView(btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Practice5_2.class);
                startActivityForResult(intent,sub);
            }
        });

    }
}