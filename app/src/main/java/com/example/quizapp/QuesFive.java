package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class QuesFive extends AppCompatActivity {

    CheckBox c1,c2,c3,c4;
    TextView tv;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_five);
        tv=findViewById(R.id.textView5);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        next=findViewById(R.id.button);

        Bundle bundle= getIntent().getExtras();
        int s=bundle.getInt("score");
        Toast.makeText(getApplicationContext(),"Current score is "+s,Toast.LENGTH_LONG).show();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    tv.setText("Wrong answer");
                    Intent intent=new Intent(getApplicationContext(),Result.class);
                    intent.putExtra("score",s+0);
                    startActivity(intent);

                }
                else if (c2.isChecked() && c3.isChecked() && c4.isChecked()){
                    tv.setText("Your answer is correct");
                    Intent intent=new Intent(getApplicationContext(),Result.class);
                    intent.putExtra("score",s+10);
                    startActivity(intent);
                }

            }
        });
    }
}