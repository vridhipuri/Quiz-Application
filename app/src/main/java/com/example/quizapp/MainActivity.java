package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button start;
    EditText name,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName2);
        reg=findViewById(R.id.editTextTextPersonName);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty() || reg.getText().toString().isEmpty()){
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Please fill all your details!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    AlertDialog alertDialog= builder.create();
                    alertDialog.setTitle("ALERT");
                    alertDialog.show();

                }

                else{
                    Toast.makeText(getApplicationContext(),"Quiz begins",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),QuesOne.class);
                    startActivity(intent);

                }
            }
        });
    }
}