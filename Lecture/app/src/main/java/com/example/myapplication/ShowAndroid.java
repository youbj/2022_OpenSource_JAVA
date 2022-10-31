package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ShowAndroid extends AppCompatActivity {
    TextView text1,text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR,rdoS;
    Button btnOK,btnend,btnnew;
    ImageView imgAnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_android);
        setTitle("안드로이드 버전보기");

        text1=(TextView) findViewById(R.id.Text1);
        chkAgree=(Switch) findViewById(R.id.ChkAgree);

        text2=(TextView) findViewById(R.id.Text2);

        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ=(RadioButton) findViewById(R.id.RdoQ);
        rdoR=(RadioButton) findViewById(R.id.RdoR);
        rdoS=(RadioButton) findViewById(R.id.RdoS);
        btnend = (Button)findViewById(R.id.Btnend);
        btnnew=(Button)findViewById(R.id.Btnnew);
        btnOK=(Button) findViewById(R.id.BtnOK);
        imgAnd=(ImageView) findViewById(R.id.ImgAnd);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgAnd.setVisibility(View.VISIBLE);
                }else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgAnd.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoQ:
                        imgAnd.setImageResource(R.drawable.q);
                        btnend.setVisibility(View.VISIBLE);
                        btnnew.setVisibility(View.VISIBLE);
                        break;
                    case R.id.RdoR:
                        imgAnd.setImageResource(R.drawable.r);
                        btnend.setVisibility(View.VISIBLE);
                        btnnew.setVisibility(View.VISIBLE);
                        break;
                    case R.id.RdoS:
                        imgAnd.setImageResource(R.drawable.s);
                        btnend.setVisibility(View.VISIBLE);
                        btnnew.setVisibility(View.VISIBLE);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"버전 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(ShowAndroid.this, ShowAndroid.class));
            }
        });

        btnend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}