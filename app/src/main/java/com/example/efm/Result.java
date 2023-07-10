package com.example.efm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        resultTextView = findViewById(R.id.resultTextView);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("result")) {
            double result = intent.getDoubleExtra("result", 0.0);
            resultTextView.setText(String.valueOf(result));
        }
    }
}