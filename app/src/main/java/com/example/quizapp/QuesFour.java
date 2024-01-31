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

public class QuesFour extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView tv;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_four);
        radioGroup=findViewById(R.id.rg);
        tv=findViewById(R.id.textView6);
        next=findViewById(R.id.button);

        Bundle bundle= getIntent().getExtras();
        int s=bundle.getInt("score");
        Toast.makeText(getApplicationContext(),"Current score is "+s,Toast.LENGTH_LONG).show();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(i);
                if (i==R.id.radioButton4)
                {
                    tv.setText("Your answer is correct");
                    Intent intent=new Intent(getApplicationContext(),QuesFive.class);
                    intent.putExtra("score",s+10);
                    startActivity(intent);
                }
                else {
                    tv.setText("Wrong answer");
                    Intent intent=new Intent(getApplicationContext(),QuesFive.class);
                    intent.putExtra("score",s+0);
                    startActivity(intent);
                }
            }
        });


    }
}