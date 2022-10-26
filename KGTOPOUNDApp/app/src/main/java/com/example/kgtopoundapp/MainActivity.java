package com.example.kgtopoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  TextView textView,textView2,textView3,valueinpounds;

  EditText editText;
  Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3= findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
        valueinpounds = findViewById(R.id.valueinpounds);
        button = findViewById(R.id.button);


        Toast.makeText(this,"Welcome To My App",Toast.LENGTH_SHORT).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPOund();
            }

            private void ConvertFromKiloToPOund() {
                String valueEntered = editText.getText().toString();
                double Kilo = Double.parseDouble(valueEntered);
                double pounds = Kilo*2.205;
                valueinpounds.setText(""+pounds);
            }
        });
    }
}