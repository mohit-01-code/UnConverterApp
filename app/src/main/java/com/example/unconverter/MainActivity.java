package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button button;
        private EditText editText;
        private TextView poundText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumberDecimal);
        poundText = findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                float kg = Float.parseFloat(s);
                double pound = 2.205 * kg;
                poundText.setText(""+pound);
            }

        });
    }
}