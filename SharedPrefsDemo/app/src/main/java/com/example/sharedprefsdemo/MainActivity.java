package com.example.sharedprefsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView textView;
  EditText editText;
  private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String val = editText.getText().toString();
                SharedPreferences Sp = getSharedPreferences("MyPref",MODE_PRIVATE);
                SharedPreferences.Editor ed = Sp.edit();
                ed.putString("name",val);
                ed.apply();
                textView.setText(val);
            }
        });
        setContentView(R.layout.activity_main);
        SharedPreferences Sp = getSharedPreferences("MyPref",MODE_PRIVATE);
      String editVal=  Sp.getString("name", "No value as of now");
        textView.setText(editVal);



    }
}