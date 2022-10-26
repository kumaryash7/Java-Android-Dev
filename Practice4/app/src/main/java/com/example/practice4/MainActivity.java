package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText emaileditText,passwordeditText;
   Button button;
    String passwordString;
    String emailString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emaileditText = findViewById(R.id.emaileditText);
        passwordeditText = findViewById(R.id.passwordeditText);
        button= findViewById(R.id.button);

        emailString = emaileditText.getText().toString();
         passwordString = passwordeditText.getText().toString();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ActivityB.class);
                i.putExtra("email",emailString);
                i.putExtra("Password",passwordString);
                startActivity(i);
            }


        });
    }
}