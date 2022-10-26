package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
  TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textView2 = findViewById(R.id.textView2);
        Intent i = getIntent();
        String email = i.getStringExtra("email");
        textView2.setText("Welcome"+email);



    }
}