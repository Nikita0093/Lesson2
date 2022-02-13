package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Greetings extends AppCompatActivity implements View.OnClickListener {
    TextView Greetings;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        initialization();
        setListeners();


    }

    private void setListeners() {
        Greetings.setOnClickListener(this);
        btnStart.setOnClickListener(this);
    }

    private void initialization() {
        Greetings = findViewById(R.id.Greetings);
        btnStart = findViewById(R.id.btnStart);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.btnStart):{
                Intent intent = new Intent("Calculator");
                startActivity(intent);
                finish();
                break;

            }
        }

    }
}

