package com.example.efm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText ETnumber;
    Spinner Option;
    Button btncalcule;

    @SuppressLint({"WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     ETnumber = findViewById(R.id.ETnumber);
     Option = findViewById(R.id.Option);
     btncalcule = findViewById(R.id.btncalcule);



    }
}