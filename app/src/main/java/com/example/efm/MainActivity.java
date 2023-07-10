package com.example.efm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
     ArrayAdapter<String> spinnerAdapter;





        btncalcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberString = ETnumber.getText().toString().trim();
                if (numberString.isEmpty()) {

                    showAlertDialog("Error", "Please enter a number.");
                } else {
                    try {
                        double number = Double.parseDouble(numberString);
                    } catch (NumberFormatException e) {
                        showAlertDialog("Error", "Invalid number . Please enter a valid number.");
                    }
                }
            }

            private void showAlertDialog(String title, String message) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(title)
                        .setMessage(message);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });





        String[] spinnerItems = {"Opposite", "Absolut value", "Square",};
        spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerItems);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Option.setAdapter(spinnerAdapter);

        Option.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedColor = parent.getItemAtPosition(position).toString();

                switch (selectedColor) {
                    case "Opposite":
                        break;
                    case "Absolut value":
                        break;
                    case "Plum":
                        break;
                    case "square":
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    }