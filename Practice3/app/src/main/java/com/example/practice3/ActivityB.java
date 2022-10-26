package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toast.makeText(this, "THIS IS MY NEW ACTIVITY B", Toast.LENGTH_SHORT).show();

    }
}