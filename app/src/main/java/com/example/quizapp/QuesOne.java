package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuesOne extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton r;
    Button next;
    TextView tv;
    int s=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_one);
        radioGroup=findViewById(R.id.rg);
        next=findViewById(R.id.button);
        tv=findViewById(R.id.textView3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=radioGroup.getCheckedRadioButtonId();
                r=findViewById(i);
                if (i==R.id.radioButton2)
                {
                    tv.setText("Your answer is correct");
                    Intent intent=new Intent(getApplicationContext(),QuesTwo.class);
                    intent.putExtra("score",s+10);
                    startActivity(intent);
                }
                else if (i==R.id.radioButton){

                    tv.setText("Wrong answer");
                    Intent intent=new Intent(getApplicationContext(),QuesTwo.class);
                    intent.putExtra("score",s+0);
                    startActivity(intent);
                }
            }
        });
    }
}