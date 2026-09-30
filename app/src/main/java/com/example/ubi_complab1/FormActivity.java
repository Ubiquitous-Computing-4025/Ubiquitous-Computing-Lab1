package com.example.ubi_complab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form);

        EditText nameInput = findViewById(R.id.nameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        EditText phoneInput = findViewById(R.id.phoneInput);
        EditText emailInput = findViewById(R.id.emailInput);

        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {

        });
    }



}
