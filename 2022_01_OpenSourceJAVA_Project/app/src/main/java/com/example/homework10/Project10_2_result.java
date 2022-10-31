package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Project10_2_result extends AppCompatActivity {
    Integer tvID[] = {R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9};
    Integer rBarID[] = {R.id.rBar1, R.id.rBar2, R.id.rBar3,
                        R.id.rBar4, R.id.rBar5, R.id.rBar6,
                        R.id.rBar7, R.id.rBar8, R.id.rBar9};
    Integer imgFiled[] = {R.id.img1, R.id.img2, R.id.img3,
                          R.id.img4, R.id.img5, R.id.img6,
                          R.id.img7, R.id.img8, R.id.img9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project102_result);
        setTitle("투표 결과");
        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");
        TextView tv[] = new TextView[imageName.length];
        RatingBar rBar[] = new RatingBar[imageName.length];
        for (int i = 0; i < voteResult.length; i++) {
            tv[i] = (TextView) findViewById(tvID[i]);
            rBar[i] = (RatingBar) findViewById(rBarID[i]);
        }
        for (int i = 0; i < voteResult.length; i++) {
            tv[i].setText(imageName[i]);
            rBar[i].setRating((float) voteResult[i]);
        }
        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}

