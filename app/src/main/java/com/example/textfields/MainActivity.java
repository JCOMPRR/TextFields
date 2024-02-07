package com.example.textfields;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout textInputLayout;
    private AutoCompleteTextView dropDownText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropDownText = findViewById(R.id.dropdown_text);
        String[] items = new String[]{
                "BASE DE DATOS",
                "ESTRUCTURA DE DATOS",
                "INGENIERÍA DE SOFTWARE",
                "SEGURIDAD INFORMÁTICA"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                items
        );
        dropDownText.setAdapter(adapter);
    }
}