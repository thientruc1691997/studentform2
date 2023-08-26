package com.example.studentform2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
    private EditText yourName;
    private EditText yourDoB;

    private Switch Gender;

    private Student student;

    private Button btnShow;

    private Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yourName=findViewById(R.id.yourName);

        yourDoB = findViewById(R.id.yourDoB);

        Gender = findViewById(R.id.Gender);

        btnShow = findViewById(R.id.btnShow);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=yourName.getText().toString();
                String yourDate=yourDoB.getText().toString();
                Boolean gender =Gender.isChecked();



            }
        });


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent();

                    startActivity(intent);
            }
        });





    }
}