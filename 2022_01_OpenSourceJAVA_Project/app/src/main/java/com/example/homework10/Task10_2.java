package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.homework10.Project10_2_result;
import com.example.homework10.R;

public class Task10_2 extends AppCompatActivity {
    Button btnResult;
    ImageView img[] = new ImageView[9];
    Integer imgname[] = {R.id.img1, R.id.img2, R.id.img3,
            R.id.img4, R.id.img5, R.id.img6,
            R.id.img7, R.id.img8, R.id.img9};
    String imgName[] = {"우아 나나", "에스파 카리나", "김세정", "에스파 윈터", "Promis9 이채영", "Promis9 백지헌", "우주소녀 루다", "올리비아 혜", "츄"};
    int vote[] = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task102);
        setTitle("여돌 인기 투표");
        for (int i = 0; i < img.length; i++) img[i] = findViewById(imgname[i]);
        for (int i = 0; i < 9; i++) vote[i] = 0;
        btnResult = (Button) findViewById(R.id.btnResult);
        for (int i = 0; i < imgname.length; i++) {
            final int index; // 반드시 있어야 한다.
            index = i;
            img[index] = (ImageView) findViewById(imgname[index]);
            img[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    vote[index]++;
                    Toast.makeText(getApplicationContext(), imgName[index] + ": 총" + vote[index] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }
        btnResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Task10_2_result.class);
                intent.putExtra("VoteCount", vote);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });
    }
}

