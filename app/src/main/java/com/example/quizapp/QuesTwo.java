package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class QuesTwo extends AppCompatActivity {

    Button next;
    CheckBox c1,c2,c3,c4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_two);
        c1=findViewById(R.id.encapsulation);
        c2=findViewById(R.id.platform);
        c3=findViewById(R.id.abstraction);
        c4=findViewById(R.id.inheritance);
        tv=findViewById(R.id.textView5);
        next=findViewById(R.id.button);

        Bundle bundle= getIntent().getExtras();
        int s=bundle.getInt("score");
        Toast.makeText(getApplicationContext(),"Current score is "+s,Toast.LENGTH_LONG).show();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c2.isChecked()){
                    tv.setText("Wrong answer");
                    Intent intent=new Intent(getApplicationContext(),QuesThree.class);
                    intent.putExtra("score",s+0);
                    startActivity(intent);

                }
                else if(c1.isChecked() && c3.isChecked() && c4.isChecked()){
                    tv.setText("Your answer is correct");
                    Intent intent=new Intent(getApplicationContext(),QuesThree.class);
                    intent.putExtra("score",s+10);
                    startActivity(intent);
                }

            }
        });
    }
}