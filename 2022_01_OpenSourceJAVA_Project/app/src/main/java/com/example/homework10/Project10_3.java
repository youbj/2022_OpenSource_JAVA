package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Project10_3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project103);
        setTitle("액티비티 테스트 예제");
        android.util.Log.i("액티비티 테스트","onCreate()");

        Button btnDial =(Button)findViewById(R.id.btnDial);
        Button btnFinish =(Button)findViewById(R.id.btnFinish);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.util.Log.i("액티비티 테스트","onStart()");
            }
        });
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    protected  void onDestroy() {

        super.onDestroy();
        android.util.Log.i("액티비티 테스트","onDestroy()");
    }

}